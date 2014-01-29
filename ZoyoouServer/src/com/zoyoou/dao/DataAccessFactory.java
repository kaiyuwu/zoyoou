/**
 * 
 */
package com.zoyoou.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.zoyoou.common.entity.IEntity;

/**
 * @author kaiwu
 *
 */
public class DataAccessFactory {
	
	public static IDataAccess<? extends IEntity> getDataAccess(DataAccessType type, Connection connection) throws SQLException{
		switch(type){
		case USER:
			return new UserDao(connection);
		case COMMUNITY:
			return null;//todo
		case CONTACTINFO:
			return new ContactInfoDao(connection);
		case USERCOMMUNITY:
			return new UserCommunityDao(connection);
		default:
			return null;
		}
	}

}
