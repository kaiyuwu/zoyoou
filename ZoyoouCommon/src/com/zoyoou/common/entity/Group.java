/**
 * 
 */
package com.zoyoou.common.entity;


/**
 * @author kaiwu
 *
 */
public class Group extends AbstractEntity {
	  private long groupID;
	  private Community community;
	  private String name;
	  private String description;
	  private ActiveStatus activeStatus;
	/**
	 * @return the groupID
	 */
	public long getGroupID() {
		return groupID;
	}
	/**
	 * @param groupID the groupID to set
	 */
	public void setGroupID(long groupID) {
		this.groupID = groupID;
	}
	/**
	 * @return the community
	 */
	public Community getCommunity() {
		return community;
	}
	/**
	 * @param community the community to set
	 */
	public void setCommunity(Community community) {
		this.community = community;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	/**
	 * @return the activeStatus
	 */
	public ActiveStatus getActiveStatus() {
		return activeStatus;
	}
	/**
	 * @param activeStatus the activeStatus to set
	 */
	public void setActiveStatus(ActiveStatus activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	
}
