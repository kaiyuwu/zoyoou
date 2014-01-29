/**
 * 
 */
package com.zuoyou.webservice;

import java.util.List;

import com.zoyoou.common.entity.IEntity;
import com.zoyoou.model.IModel;
import com.zoyoou.model.ModelFactory;
import com.zoyoou.model.ModelType;

/**
 * @author kaiwu
 *
 */
public abstract class AbstractZuoyouWebservice <T extends IModel<E>,E extends IEntity> implements IZuoyouWebService <E> {

	protected T model;

	protected AbstractZuoyouWebservice(ModelType type){
		this.model = ModelFactory.getModel(type);
	}
	
	/* (non-Javadoc)
	 * @see com.abc.webservice.IZuoyouWebService#findById(long)
	 */
	@Override
	public E findById(long id) throws Exception {
		return model.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.abc.webservice.IZuoyouWebService#findAll()
	 */
	@Override
	public List<E> findAll() throws Exception {
		return model.findAll();
	}

	/* (non-Javadoc)
	 * @see com.abc.webservice.IZuoyouWebService#create(com.zouyou.entity.IEntity)
	 */
	@Override
	public E create(E entity) throws Exception {
		return model.create(entity);
	}

	/* (non-Javadoc)
	 * @see com.abc.webservice.IZuoyouWebService#update(com.zouyou.entity.IEntity)
	 */
	@Override
	public E update(E entity) throws Exception {
		
		System.out.println("Update test.");
		return model.update(entity);
	}

	/* (non-Javadoc)
	 * @see com.abc.webservice.IZuoyouWebService#remove(long)
	 */
	@Override
	public E remove(long id) throws Exception {
		return model.remove(id);
	}
	
	
	

}
