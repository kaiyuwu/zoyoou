/**
 * 
 */
package com.zoyoou.model;

import java.sql.SQLException;
import java.util.List;

import com.zoyoou.common.entity.IEntity;
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
	
	protected AbstractModel(DataAccessType daoType){
		this.daoType = daoType;
	}
	
	
	@SuppressWarnings("unchecked")
	protected void initDao() throws SQLException{
		
		this.dao =  (IDataAccess<E>) DataAccessFactory.getDataAccess(this.daoType);
	}
	protected void closeDao() throws Exception{
		this.dao.close();
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#findAll()
	 */
	@Override
	public List<E> findAll() throws Exception {
		initDao();
		List<E> list = dao.findAll();
		closeDao();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#findAllBy(java.lang.String)
	 */
	@Override
	public List<E> findAllBy(String queryCondition) throws Exception {
		initDao();
		List<E> list =  dao.findAllBy(queryCondition);
		closeDao();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#findById(long)
	 */
	@Override
	public E findById(long id) throws Exception {
		initDao();
		E entity =  this.dao.findById(id);
		closeDao();
		return entity;
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#create(com.zouyou.entity.E)
	 */
	@Override
	public E create(E entity) throws Exception {
		initDao();
		entity = this.dao.create(entity);
		closeDao();
		return  entity;
		
	}

	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#update(com.zouyou.entity.E)
	 */
	@Override
	public E update(E entity) throws Exception {
		initDao();
		entity = this.dao.update(entity);
		closeDao();
		return entity;
	}


	/* (non-Javadoc)
	 * @see com.zouyou.model.IModel#remove(long)
	 */
	@Override
	public E remove(long id) throws Exception {
		initDao();
		E entity = this.dao.remove(id);
		closeDao();
		return entity;
	}
	
	

}
