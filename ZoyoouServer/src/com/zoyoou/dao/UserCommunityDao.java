/**
 * 
 */
package com.zoyoou.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.zoyoou.common.entity.UserCommunityRelationship;

/**
 * @author kaiwu
 *
 */
public class UserCommunityDao extends AbstractDataAccess<UserCommunityRelationship> {

	static final String ID= "UID";
	static final String UID= "UID";
	static final String COMMUNITYID= "CommunityID";
	static final String ROLEID= "RoleID";
	
	
	
	static final String INSERT_USER_COMMNUNITY="{CALL InsertUserCommunityRelationship(?, ?, ?, ?)}";

	public UserCommunityDao(Connection conn) throws SQLException {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<UserCommunityRelationship> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserCommunityRelationship> findAllBy(String queryCondition)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCommunityRelationship findById(long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCommunityRelationship create(UserCommunityRelationship entity)
			throws Exception {
		
			
			CallableStatement csUserCommunity = this.conn.prepareCall(INSERT_USER_COMMNUNITY) ;
			
			csUserCommunity.setLong(1, entity.getUser().getUserId());
			csUserCommunity.setLong(2, entity.getCommunity().getCommunityId());
			csUserCommunity.setShort(3, entity.getRole().getRoleId());
			
			csUserCommunity.registerOutParameter(4, java.sql.Types.BIGINT);
			csUserCommunity.execute();
			long cid = csUserCommunity.getLong(4);
			
			entity.setId(cid);
			return entity; 
	}

	@Override
	public UserCommunityRelationship update(UserCommunityRelationship entity)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCommunityRelationship remove(long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
