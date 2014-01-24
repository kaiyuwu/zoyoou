package com.zoyoou.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

import com.zoyoou.resource.DataBaseConfig;

public class ConnectionPool {
	
	
	private volatile static ConnectionPool connectionPool = null;
	private BasicDataSource dataSource;
	
	
	private ConnectionPool(){
		dataSource =  new BasicDataSource();
		
		dataSource.setDriverClassName(DataBaseConfig.DRIVER_CLASS_NAME);
		dataSource.setUrl(DataBaseConfig.URL);
		dataSource.setUsername(DataBaseConfig.USERNAME);
		dataSource.setPassword(DataBaseConfig.PASSWORD);
		
		dataSource.setMaxActive(DataBaseConfig.CONNECTION_POOL_MAX_ACTIVE);
		dataSource.setMaxWait(DataBaseConfig.CONNECTION_POOL_MAX_WAIT);
		dataSource.setMaxIdle(DataBaseConfig.CONNECTION_POOL_MAX_IDLE);
		
	}

	public static ConnectionPool getInstance(){
		if(null == connectionPool){
			synchronized (ConnectionPool.class) {
				if(null == connectionPool){
					connectionPool = new ConnectionPool();
				}
			}
		}
		return connectionPool;
	}
	
	
	public Connection getConnection() throws SQLException{
		return dataSource.getConnection();
		
	}
}
