/**
 * 
 */
package com.zoyoou.common.entity;

import org.joda.time.DateTime;

/**
 * @author kaiwu
 *
 */
public class User extends AbstractEntity {

	private long userId;
	private String userName;
	private String nickName;
	private String pwd;
	private boolean gender;
	private DateTime dob;
	private ContactInfo contactinfo;
	private ActiveStatus activeStatus;
	private UserCommunityRelationship communityRelation;
	/**
	 * @return the uid
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	/**
	 * @return the dob
	 */
	public DateTime getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(DateTime dob) {
		this.dob = dob;
	}
	/**
	 * @return the contactinfo
	 */
	public ContactInfo getContactinfo() {
		return contactinfo;
	}
	/**
	 * @param contactinfo the contactinfo to set
	 */
	public void setContactinfo(ContactInfo contactinfo) {
		this.contactinfo = contactinfo;
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
	 * @return the communityRelation
	 */
	public UserCommunityRelationship getCommunityRelation() {
		return communityRelation;
	}
	/**
	 * @param communityRelation the communityRelation to set
	 */
	public void setCommunityRelation(UserCommunityRelationship communityRelation) {
		this.communityRelation = communityRelation;
	}

	
	
}
