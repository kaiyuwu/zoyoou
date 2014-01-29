/**
 * 
 */
package com.zoyoou.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zoyoou.common.entity.IEntity;
import com.zoyoou.dao.ConnectionPool;
import com.zoyoou.dao.DataAccessFactory;
import com.zoyoou.dao.DataAccessType;
import com.zoyoou.dao.IDataAccess;

/**
 * @author kaiwu
 *
 */
public abstract class AbstractModel<E extends IEntity> implements IModel<E> {
	
	DataAccessType daoType = null;
	IDataAccess<E> dao = null;
	Connection connection;
	
	protected AbstractModel(DataAccessType daoType){
		this.daoType = daoType;
	}
	
	
	@SuppressWarnings("unchecked")
	protected void initDao() throws SQLException{
		this.connection = ConnectionPool.getInstance().getConnection();
		this.dao =  (IDataAccess<E>) DataAccessFactory.getDataAccess(this.daoType, connection);
	}

	@SuppressWarnings("unchecked")
	protected void initDao(Connection connection) throws SQLException{
		this.connection = connection;
		this.dao =  (IDataAccess<E>) DataAccessFactory.getDataAccess(this.daoType, connection);
	}

	protected void closeDao() throws Exception{
		this.dao.close();
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#findAll()
	 */
	@Override
	public List<E> findAll() throws Exception {
		this.initDao();
		List<E> list = dao.findAll();
		this.closeDao(); 
		return list;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#findAllBy(java.lang.String)
	 */
	@Override
	public List<E> findAllBy(String queryCondition) throws Exception {
		this.initDao();
		List<E> list =  dao.findAllBy(queryCondition);
		this.closeDao();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#findById(long)
	 */
	@Override
	public E findById(long id) throws Exception {
		this.initDao();
		E entity =  this.dao.findById(id);
		this.closeDao();
		return entity;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#create(com.zouyou.entity.E)
	 */
	@Override
	public E create(E entity) throws Exception {
		return  this.create(entity, true);
		
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#update(com.zouyou.entity.E)
	 */
	@Override
	public E update(E entity) throws Exception {
		return this.update(entity, true);
	}


	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#remove(long)
	 */
	@Override
	public E remove(long id) throws Exception {
		return this.remove(id, true);
	}


	/* (non-Javadoc)
	 * @see com.zoyoou.model.IModel#create(com.zoyoou.common.entity.IEntity, boolean)
	 */
	@Override
	public E create(E entity, boolean autoDao) throws Exception {
		if(autoDao){
			try{
				this.initDao();
				this.connection.setAutoCommit(false);
				entity = this.dao.create(entity);
				return entity;
				
			}catch(Exception e){
				List<String> errors = new ArrayList<String>();
				errors.add(e.toString());
				entity.setErrorList(errors);
				return entity;
				
			}finally{
				this.connection.commit();
				this.closeDao();
				
			}			
		}else 
			return this.dao.create(entity);
		
	}


	/* (non-Javadoc)
	 * @see com.zoyoou.model.IModel#update(com.zoyoou.common.entity.IEntity, boolean)
	 */
	@Override
	public E update(E entity, boolean autoDao) throws Exception {
		if(autoDao){
			try{
				this.initDao();
				this.connection.setAutoCommit(false);
				entity = this.dao.update(entity);
				return entity;
				
			}catch(Exception e){
				List<String> errors = new ArrayList<String>();
				errors.add(e.toString());
				entity.setErrorList(errors);
				return entity;
				
			}finally{
				this.connection.commit();
				this.closeDao();
				
			}
		}else
			return this.dao.update(entity);

	}


	/* (non-Javadoc)
	 * @see com.zoyoou.model.IModel#remove(long, boolean)
	 */
	@Override
	public E remove(long id, boolean autoDao) throws Exception {
		if(autoDao){
			try{
				this.initDao();
				this.connection.setAutoCommit(false);
					
				E entity = this.dao.remove(id);

				return entity;			
			}catch(Exception e){
				return null;
			}finally{
				this.connection.commit();
				this.closeDao();
				
			}
			
		}else{
			return this.dao.remove(id);
		}
	
	}
	
	
	
}
