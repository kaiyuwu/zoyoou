/**
 * 
 */
package com.zoyoou.model;

import java.util.List;

import com.zoyoou.common.entity.IEntity;

/**
 * @author kaiwu
 *
 */
public interface IModel <E extends IEntity>{
	List<E> findAll() throws Exception;
	List<E> findAllBy(String queryCondition)  throws Exception;
	E findById(long id)  throws Exception;
	E create(E entity)  throws Exception;
	E update(E entity)  throws Exception;
	E remove(long id)  throws Exception; 
	E create(E entity, boolean autoDao)  throws Exception;
	E update(E entity, boolean autoDao)  throws Exception;
	E remove(long id, boolean autoDao)  throws Exception; 

}
