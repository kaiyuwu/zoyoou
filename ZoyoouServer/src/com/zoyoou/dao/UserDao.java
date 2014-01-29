/**
 * 
 */
package com.zoyoou.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zoyoou.common.entity.ActiveStatus;
import com.zoyoou.common.entity.ContactInfo;
import com.zoyoou.common.entity.User;
import com.zoyoou.resource.ErrorMessages;

/**
 * @author kaiwu
 *
 */
public class UserDao extends AbstractDataAccess<User> {

	public UserDao(Connection connection) throws SQLException {
		super(connection);
	
	}

	static final String UID= "UID";
	static final String USERNAME="UserName";
	static final String PASSWORD= "Pwd";
	static final String STATUS = "ActiveStatus";
	static final String NICKNAME="NickName";
	
	
	static final String FIND_BY_ID="{call GetUserInfo(?)}";
	static final String FIND_BY_USERNAME="{CALL GetUserLoginInfo(?)}";
	static final String INSERT_USER="{CALL InsertUserInfo(?, NULL, ?, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ?)}";
	static final String UPDATE_USER="{CALL UpdateUserInfo(?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,?)}";
	static final String DELETE_USER="{CALL DeleteUserInfo(?)}";
	

	/* (non-Javadoc)
	 * @see com.zouyou.dao.IDataAccess#findAll()
	 */
	@Override
	public List<User> findAll()  throws Exception{
		//CallableStatement cs = this.conn.prepareCall()
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.dao.IDataAccess#finalBy(java.lang.String)
	 */
	@Override
	public List<User> findAllBy(String queryCondition)  throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.dao.IDataAccess#findById(long)
	 */
	@Override
	public User findById(long id)  throws Exception{
		User user = new User();
		user.setUserId(id);

		CallableStatement cs = this.conn.prepareCall(FIND_BY_ID);
		cs.setLong(1, id);
		ResultSet result = cs.executeQuery();
			

		if(result.next()){
			user = getUserFromResult(result);
		}else{
			List<String> errors = new ArrayList<String>();
			errors.add(String.format(ErrorMessages.NO_RECORD_FOUND_BY_ID, id));
			user.setErrorList(errors);
		}
		return user;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.dao.IDataAccess#create(java.lang.Object)
	 */
	@Override
	public User create(User entity)  throws Exception{
		User user = entity;
		CallableStatement csUser = this.conn.prepareCall(INSERT_USER);
		csUser.setString(1, user.getUserName());
		csUser.setString(2, user.getPwd());
		csUser.registerOutParameter(3, java.sql.Types.BIGINT);
		csUser.execute();
		long uid = csUser.getLong(3);
		user.setUserId(uid);
		return user;
	}

	

	public User findByUserName(String username) throws Exception{
		
		User user = new User();
		CallableStatement cs = this.conn.prepareCall(FIND_BY_USERNAME);
		cs.setString(1, username);
		ResultSet result = cs.executeQuery();
		

		if(result.next()){
			user = getUserFromResult(result,true);
		}else{
			List<String> errors = new ArrayList<String>();
			errors.add(String.format(ErrorMessages.NO_RECORD_FOUND_BY_USERNAME, username));
			user.setErrorList(errors);
		}
			
		return user;

	}
	
	
	private static User getUserFromResult(ResultSet result, boolean forLogin) throws SQLException{
		User user = new User();
		user.setUserId(result.getLong(UID));
		user.setUserName(result.getString(USERNAME));
		user.setPwd(result.getString(PASSWORD));
		
		
		ActiveStatus status = new ActiveStatus();
		status.setActiveId(result.getShort(STATUS));
		user.setActiveStatus(status);
		if(!forLogin){
			user.setNickName(result.getString(NICKNAME));
			
			ContactInfo contactInfo = new ContactInfo();
			contactInfo.setContactID(result.getLong(ContactInfoDao.CONTACT_ID));
			contactInfo.setAddress1(result.getString(ContactInfoDao.ADDRESS1));
			contactInfo.setAddress2(result.getString(ContactInfoDao.ADDRESS2));
			contactInfo.setCity(result.getString(ContactInfoDao.CITY));
			contactInfo.setProvince(result.getString(ContactInfoDao.PROVINCE));
			contactInfo.setPostCode(result.getString(ContactInfoDao.POSTAL_CODE));
			contactInfo.setEmail1(result.getString(ContactInfoDao.EMAIL1));
			contactInfo.setEmail2(result.getString(ContactInfoDao.EMAIL2));
			contactInfo.setWorkPhone(result.getString(ContactInfoDao.WORKPHONE));
			contactInfo.setHomePhone(result.getString(ContactInfoDao.HOMEPHONE));
			contactInfo.setCellPhone(result.getString(ContactInfoDao.CELLPHONE));
			user.setContactinfo(contactInfo);
		}
		return user;
	}
	
	private static User getUserFromResult(ResultSet result) throws SQLException{
		return getUserFromResult(result,false);
	}



	@Override
	public User update(User entity)  throws Exception{
		User user = entity;
		CallableStatement csUser = this.conn.prepareCall(UPDATE_USER);
		csUser.setLong(1, user.getUserId());
		csUser.setString(2, user.getUserName());
		csUser.setString(3,user.getPwd());
		csUser.setShort(4, user.getActiveStatus().getActiveId());
		csUser.setString(5, user.getNickName());
		csUser.setBoolean(6, user.isGender());
		csUser.setDate(7, new Date(user.getDob().getMillis()));
		csUser.setString(8,  user.getContactinfo().getAddress1());
		csUser.setString(9,  user.getContactinfo().getAddress2());
		csUser.setString(10, user.getContactinfo().getCity());
		csUser.setString(11,  user.getContactinfo().getProvince());
		csUser.setString(12, user.getContactinfo().getPostCode());
		csUser.setString(13, user.getContactinfo().getEmail1());
		csUser.setString(14,  user.getContactinfo().getEmail2());
		csUser.setString(15,  user.getContactinfo().getHomePhone());
		csUser.setString(16, user.getContactinfo().getWorkPhone());
		csUser.setString(17, user.getContactinfo().getCellPhone());
				
		csUser.execute();
		
		return user;
	}

	@Override
	public User remove(long id)  throws Exception{
		User user = findById(id);
		CallableStatement csUser = this.conn.prepareCall(DELETE_USER);
		csUser.setLong(1, id);
		csUser.execute();
		return user;
	
	}
	
	


}
