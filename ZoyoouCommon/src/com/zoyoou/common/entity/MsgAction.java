/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class MsgAction extends AbstractEntity {
	private short actionId;
	private String actionStatus;
	private String description;
	/**
	 * @return the actionId
	 */
	public short getActionId() {
		return actionId;
	}
	/**
	 * @param actionId the actionId to set
	 */
	public void setActionId(short actionId) {
		this.actionId = actionId;
	}
	/**
	 * @return the actionStatus
	 */
	public String getActionStatus() {
		return actionStatus;
	}
	/**
	 * @param actionStatus the actionStatus to set
	 */
	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
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
