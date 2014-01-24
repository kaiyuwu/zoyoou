/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class DepartmentCommunityRelationship extends AbstractEntity {

	private long id;
	private Department department;
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
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
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
