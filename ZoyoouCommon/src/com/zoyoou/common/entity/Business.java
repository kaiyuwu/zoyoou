/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class Business extends AbstractEntity {
	
	private long businessId;
	private String businessName;
	private User admin;
	private ContactInfo contact;
	private BusinessType businessType;
	private ActiveStatus activeStatus;
	/**
	 * @return the businessId
	 */
	public long getBusinessId() {
		return businessId;
	}
	/**
	 * @param businessId the businessId to set
	 */
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}
	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
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
	 * @return the contact
	 */
	public ContactInfo getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(ContactInfo contact) {
		this.contact = contact;
	}
	/**
	 * @return the businessType
	 */
	public BusinessType getBusinessType() {
		return businessType;
	}
	/**
	 * @param businessType the businessType to set
	 */
	public void setBusinessType(BusinessType businessType) {
		this.businessType = businessType;
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
