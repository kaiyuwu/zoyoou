/**
 * 
 */
package com.zoyoou.dao;

/**
 * @author kaiwu
 *
 */
public enum DataAccessType {
	USER(1),
	COMMUNITY(2);
	
	
	public final int Value;
	private DataAccessType(int value){
		this.Value = value;
	}

}
