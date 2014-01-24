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
public abstract class AbstractDataAccess<E extends IEntity> implements IDataAccess<E>{
	
	protected Connection conn;
	/**
	 * Constructor
	 * @throws SQLException 
	 */
	public AbstractDataAccess() throws SQLException{
		ConnectionPool connectionPool = ConnectionPool.getInstance();
		this.conn = connectionPool.getConnection();
		this.conn.setAutoCommit(false);

	}

	/* (non-Javadoc)
	 * @see com.zouyou.dao.IDataAccess#getConnection()
	 */
	@Override
	public Connection getConnection() {
		return this.conn;
	}

	/* (non-Javadoc)
	 * @see java.lang.AutoCloseable#close()
	 */
	@Override
	public void close() throws Exception {
		this.conn.close();
		this.conn = null;
		
	}
	
	
	
}
