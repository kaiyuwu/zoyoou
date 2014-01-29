/**
 * 
 */
package com.zoyoou.model;

/**
 * @author kaiwu
 *
 */
public enum ModelType {
	USER(1),
	CONTACTINFO(2),
	USER_COMMUNITY(3);
	
	public  final int Value;
	private ModelType(int value){
		this.Value = value; 
	}
	
}
