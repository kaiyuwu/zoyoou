/**
 * 
 */
package com.zoyoou.common.entity;

import org.joda.time.DateTime;

/**
 * @author kaiwu
 *
 */
public class Bulletin extends AbstractEntity {

	private long id;
	private Community community;
	private long publisherId;
	private EntityType publisherType;
	private InfoType infoType;
	private DateTime publishDate;
	private DateTime expireDate;
	private ActiveStatus activeStatus;
	private String title;
	private String content;
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
	 * @return the publisherId
	 */
	public long getPublisherId() {
		return publisherId;
	}
	/**
	 * @param publisherId the publisherId to set
	 */
	public void setPublisherId(long publisherId) {
		this.publisherId = publisherId;
	}
	/**
	 * @return the publisherType
	 */
	public EntityType getPublisherType() {
		return publisherType;
	}
	/**
	 * @param publisherType the publisherType to set
	 */
	public void setPublisherType(EntityType publisherType) {
		this.publisherType = publisherType;
	}
	/**
	 * @return the infoType
	 */
	public InfoType getInfoType() {
		return infoType;
	}
	/**
	 * @param infoType the infoType to set
	 */
	public void setInfoType(InfoType infoType) {
		this.infoType = infoType;
	}
	/**
	 * @return the publishDate
	 */
	public DateTime getPublishDate() {
		return publishDate;
	}
	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(DateTime publishDate) {
		this.publishDate = publishDate;
	}
	/**
	 * @return the expireDate
	 */
	public DateTime getExpireDate() {
		return expireDate;
	}
	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(DateTime expireDate) {
		this.expireDate = expireDate;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	
	
}
