/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class SystemLog extends AbstractEntity {

	private long logId;
	private int actionId;
	private String logData;
	private long requestedUid;
	/**
	 * @return the logId
	 */
	public long getLogId() {
		return logId;
	}
	/**
	 * @param logId the logId to set
	 */
	public void setLogId(long logId) {
		this.logId = logId;
	}
	/**
	 * @return the actionId
	 */
	public int getActionId() {
		return actionId;
	}
	/**
	 * @param actionId the actionId to set
	 */
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	/**
	 * @return the logData
	 */
	public String getLogData() {
		return logData;
	}
	/**
	 * @param logData the logData to set
	 */
	public void setLogData(String logData) {
		this.logData = logData;
	}
	/**
	 * @return the requestedUid
	 */
	public long getRequestedUid() {
		return requestedUid;
	}
	/**
	 * @param requestedUid the requestedUid to set
	 */
	public void setRequestedUid(long requestedUid) {
		this.requestedUid = requestedUid;
	}
	
	
	
}
