/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class ActiveStatus extends AbstractEntity {
	
	private short activeId;
	private String activeStatusName;
	private String description;
	/**
	 * @return the activeId
	 */
	public short getActiveId() {
		return activeId;
	}
	/**
	 * @param activeId the activeId to set
	 */
	public void setActiveId(short activeId) {
		this.activeId = activeId;
	}
	/**
	 * @return the activeStatusName
	 */
	public String getActiveStatusName() {
		return activeStatusName;
	}
	/**
	 * @param activeStatusName the activeStatusName to set
	 */
	public void setActiveStatusName(String activeStatusName) {
		this.activeStatusName = activeStatusName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
