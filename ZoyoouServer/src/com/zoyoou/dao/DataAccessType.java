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
	CONTACTINFO(2),
	COMMUNITY(3),
	USERCOMMUNITY(4);
	
	
	public final int Value;
	private DataAccessType(int value){
		this.Value = value;
	}

}
