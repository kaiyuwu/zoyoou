/**
 * 
 */
package com.zoyoou.dao;

import java.sql.SQLException;
import java.util.List;

import com.zoyoou.common.entity.ContactInfo;

/**
 * @author kaiwu
 *
 */
public class ContactInfoDao extends AbstractDataAccess<ContactInfo> {
	
	public ContactInfoDao() throws SQLException {
		super();
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

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#findAll()
	 */
	@Override
	public List<ContactInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#findAllBy(java.lang.String)
	 */
	@Override
	public List<ContactInfo> findAllBy(String queryCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#findById(long)
	 */
	@Override
	public ContactInfo findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#create(com.zuoyou.entity.IEntity)
	 */
	@Override
	public ContactInfo create(ContactInfo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#update(com.zuoyou.entity.IEntity)
	 */
	@Override
	public ContactInfo update(ContactInfo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.zuoyou.dao.IDataAccess#remove(long)
	 */
	@Override
	public ContactInfo remove(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
