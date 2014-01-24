/**
 * 
 */
package com.zoyoou.common.entity;

import org.joda.time.DateTime;

/**
 * @author kaiwu
 *
 */
public class PrivateMsg extends AbstractEntity {
	private long msgId;
	private User sender;
	private long receiverId;
	private EntityType receiverTypeID;
	private int infoTypeId;
	private String subject;
	private String content;
	private DateTime sendDate;
	private ActiveStatus activeStatus;
	private MsgAction action;
	/**
	 * @return the msgId
	 */
	public long getMsgId() {
		return msgId;
	}
	/**
	 * @param msgId the msgId to set
	 */
	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}
	/**
	 * @return the sender
	 */
	public User getSender() {
		return sender;
	}
	/**
	 * @param sender the sender to set
	 */
	public void setSender(User sender) {
		this.sender = sender;
	}
	/**
	 * @return the receiverId
	 */
	public long getReceiverId() {
		return receiverId;
	}
	/**
	 * @param receiverId the receiverId to set
	 */
	public void setReceiverId(long receiverId) {
		this.receiverId = receiverId;
	}
	/**
	 * @return the receiverTypeID
	 */
	public EntityType getReceiverTypeID() {
		return receiverTypeID;
	}
	/**
	 * @param receiverTypeID the receiverTypeID to set
	 */
	public void setReceiverTypeID(EntityType receiverTypeID) {
		this.receiverTypeID = receiverTypeID;
	}
	/**
	 * @return the infoTypeId
	 */
	public int getInfoTypeId() {
		return infoTypeId;
	}
	/**
	 * @param infoTypeId the infoTypeId to set
	 */
	public void setInfoTypeId(int infoTypeId) {
		this.infoTypeId = infoTypeId;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
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
	/**
	 * @return the sendDate
	 */
	public DateTime getSendDate() {
		return sendDate;
	}
	/**
	 * @param sendDate the sendDate to set
	 */
	public void setSendDate(DateTime sendDate) {
		this.sendDate = sendDate;
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
	 * @return the action
	 */
	public MsgAction getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(MsgAction action) {
		this.action = action;
	}
	
	
	
}
