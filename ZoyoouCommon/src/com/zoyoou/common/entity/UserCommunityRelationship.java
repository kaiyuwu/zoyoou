package com.zoyoou.common.entity;

public class UserCommunityRelationship extends AbstractEntity {
	private long id;
	private User user;
	private Community community;
	private Role role;
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
