/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class BusinessCommunityRelationship extends AbstractEntity {
	private long id;
	private Business business;
	private Community community;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the business
	 */
	public Business getBusiness() {
		return business;
	}
	/**
	 * @param business the business to set
	 */
	public void setBusiness(Business business) {
		this.business = business;
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

	
	
}
