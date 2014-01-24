/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class Department extends AbstractEntity {
	private long id;
	private String name;
	private DepartmentType type;
	private User admin;
	private ContactInfo contactInfo;
	private ActiveStatus activeStatus;
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
	 * @return the type
	 */
	public DepartmentType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(DepartmentType type) {
		this.type = type;
	}
	/**
	 * @return the admin
	 */
	public User getAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(User admin) {
		this.admin = admin;
	}
	/**
	 * @return the contactInfo
	 */
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
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
