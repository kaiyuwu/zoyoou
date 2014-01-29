/**
 * 
 */
package com.zoyoou.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.zoyoou.common.entity.ContactInfo;

/**
 * @author kaiwu
 *
 */
public class ContactInfoDao extends AbstractDataAccess<ContactInfo> {
	
	public ContactInfoDao(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	static final String CONTACT_ID = "ContactID";
	static final String ADDRESS1 = "Address1";
	static final String ADDRESS2 = "Address2";
	static final String CITY = "City";
	static final String PROVINCE = "Province";
	static final String POSTAL_CODE = "PostCode";
	static final String EMAIL1 = "Email1";
	static final String EMAIL2 = "Email2";
	static final String HOMEPHONE = "HomePhone";
	static final String WORKPHONE = "WorkPhone";
	static final String CELLPHONE = "CellPhone";
	
	
	static final String INSERT_CONTACT_INFO="{CALL InsertContactInfo(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#findAll()
	 */
	@Override
	public List<ContactInfo> findAll() throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#findAllBy(java.lang.String)
	 */
	@Override
	public List<ContactInfo> findAllBy(String queryCondition) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#findById(long)
	 */
	@Override
	public ContactInfo findById(long id) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#create(com.zuoyou.entity.IEntity)
	 */
	@Override
	public ContactInfo create(ContactInfo entity) throws Exception{
		
		
		ContactInfo contact = entity;
		CallableStatement csContact = this.conn.prepareCall(INSERT_CONTACT_INFO);
		csContact.setString(1,  contact.getAddress1());
		csContact.setString(2,  contact.getAddress2());
		csContact.setString(3,  contact.getCity());
		csContact.setString(4,  contact.getProvince());
		csContact.setString(5,  contact.getPostCode());
		csContact.setString(6,  contact.getEmail1());
		csContact.setString(7,  contact.getEmail2());
		csContact.setString(8,  contact.getHomePhone());
		csContact.setString(9,  contact.getWorkPhone());
		csContact.setString(10,  contact.getCellPhone());
		csContact.registerOutParameter(11, java.sql.Types.BIGINT);
		csContact.execute();
		long id = csContact.getLong(11);
		contact.setContactID(id);
			
		return contact;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#update(com.zuoyou.entity.IEntity)
	 */
	@Override
	public ContactInfo update(ContactInfo entity) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#remove(long)
	 */
	@Override
	public ContactInfo remove(long id) throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

}
