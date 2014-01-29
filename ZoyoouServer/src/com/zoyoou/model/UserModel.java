package com.zoyoou.model;

import java.util.ArrayList;
import java.util.List;

import com.zoyoou.common.entity.ContactInfo;
import com.zoyoou.common.entity.User;
import com.zoyoou.common.entity.UserCommunityRelationship;
import com.zoyoou.dao.DataAccessType;
import com.zoyoou.dao.UserDao;
import com.zoyoou.resource.ErrorMessages;

public class  UserModel extends AbstractModel<User>{
	
	public UserModel(){
		super(DataAccessType.USER);
	}
	

	/* (non-Javadoc)
	 * @see com.zoyoou.model.AbstractModel#create(com.zoyoou.common.entity.IEntity)
	 */
	@Override
	@SuppressWarnings("finally")
	public User create(User entity) throws Exception {
	
		User user = entity;
		try{
			this.initDao();
			this.connection.setAutoCommit(false);
	
//			ContactInfoModel contactInfoModel =  (ContactInfoModel) ModelFactory.getModel(ModelType.CONTACTINFO);
//			contactInfoModel.initDao(this.connection);
//			ContactInfo contactInfo = contactInfoModel.create(null==user.getContactinfo()?new ContactInfo():user.getContactinfo(),false);
//
//			user.setContactinfo(contactInfo);
			user = this.create(user, false);
			
			
			UserCommunityModel userCommunityModle = (UserCommunityModel)ModelFactory.getModel(ModelType.USER_COMMUNITY);
			userCommunityModle.initDao(this.connection);
			UserCommunityRelationship userCommunity = user.getCommunityRelation();
			
			User newUser = new User();
			newUser.setUserId(user.getUserId());
			userCommunity.setUser(newUser);
			userCommunity = userCommunityModle.create(userCommunity,false);
			
			this.connection.commit();
			this.connection.setAutoCommit(true);
			
//			user.setContactinfo(contactInfo);
			user.setCommunityRelation(userCommunity);
			
		}catch(Exception e){
			List<String> errors = new ArrayList<String>();
			errors.add(e.toString());
			user.setErrorList(errors);
		}finally{
			this.closeDao();
			return user;
		}
		
	}
	
	@SuppressWarnings("finally")
	public User login(String username, String password) throws Exception{
		User user = new User();
		try{
			this.initDao();
			user = ((UserDao)this.dao).findByUserName(username);
			
			if(null == user){
				user = new User();
				user.setUserName(username);
				user.setPwd(password);
				user.setErrorList(getLoginErrors());
				return user;
			}
			
			if(!user.getPwd().equals(password)){
				user.setErrorList(getLoginErrors());
			}
			
		}catch(Exception e){
			
			List<String> errors = new ArrayList<String>();
			errors.add(e.toString());
			user.setErrorList(errors);
		}finally{
			this.closeDao();
			return user;
			
		}
		
	}
	
	private static List<String> errors =null;
	private static List<String> getLoginErrors(){
		if(null==errors){
			errors = new ArrayList<String>();
			errors.add(ErrorMessages.LOGIN_ERROR);
		}
		
		return errors;
		
	}

}
