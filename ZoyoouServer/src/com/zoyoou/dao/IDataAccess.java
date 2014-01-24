package com.zoyoou.dao;

import java.sql.Connection;
import java.util.List;

import com.zoyoou.common.entity.IEntity;



public interface IDataAccess<E extends IEntity> extends AutoCloseable{
	
	List<E> findAll();
	List<E> findAllBy(String queryCondition);
	E findById(long id);
	E create(E entity);
	E update(E entity);
	E remove(long id);
	Connection getConnection();


}
