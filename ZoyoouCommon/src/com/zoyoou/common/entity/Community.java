/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class Community extends AbstractEntity {
	private long communityId;
	private String name;
	private ActiveStatus activeStatus;
	private Map map;
	/**
	 * @return the communityId
	 */
	public long getCommunityId() {
		return communityId;
	}
	/**
	 * @param communityId the communityId to set
	 */
	public void setCommunityId(long communityId) {
		this.communityId = communityId;
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
	/**
	 * @return the map
	 */
	public Map getMap() {
		return map;
	}
	/**
	 * @param map the map to set
	 */
	public void setMap(Map map) {
		this.map = map;
	}
	
	

}
