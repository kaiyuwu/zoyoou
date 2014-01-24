/**
 * 
 */
package com.zoyoou.dao;

import java.sql.SQLException;

import com.zoyoou.common.entity.IEntity;

/**
 * @author kaiwu
 *
 */
public class DataAccessFactory {
	
	public static IDataAccess<? extends IEntity> getDataAccess(DataAccessType type) throws SQLException{
		switch(type){
		case USER:
			return new UserDao();
		case COMMUNITY:
			return null;//todo:
		default:
			return null;
		}
	}

}
