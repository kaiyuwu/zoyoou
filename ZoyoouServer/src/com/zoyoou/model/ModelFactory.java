/**
 * 
 */
package com.zoyoou.model;

import com.zoyoou.common.entity.IEntity;

/**
 * @author kaiwu
 *
 */
public class ModelFactory {
	
	public static IModel<? extends IEntity> getModel(ModelType type){
		switch(type){
		case USER:
			return new UserModel();
		default: 
			return null; 
		}
	}

}
