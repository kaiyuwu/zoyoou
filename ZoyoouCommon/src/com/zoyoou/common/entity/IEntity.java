package com.zoyoou.common.entity;

import java.util.List;

import org.joda.time.DateTime;

public interface IEntity {
	/**
	 * @return the createDate
	 */
	DateTime getCreateDate();
	
	/**
	 * @param createDate the createDate to set
	 */
	void setCreateDate(DateTime createDate);

	/**
	 * @return the createBy
	 */
	String getCreateBy();

	/**
	 * @param createBy the createBy to set
	 */
	void setCreateBy(String createBy);
	
	/**
	 * @return the lastModifiedDate
	 */
	DateTime getLastModifiedDate();

	/**
	 * @param lastModifiedDate the lastModifiedDate to set
	 */
	void setLastModifiedDate(DateTime lastModifiedDate);

	/**
	 * @return the lastModifiedBy
	 */
	String getLastModifiedBy();

	/**
	 * @param lastModifiedBy the lastModifiedBy to set
	 */
	void setLastModifiedBy(String lastModifiedBy);
	
	/**
	 * @return the errorList
	 */
	List<String> getErrorList();

	/**
	 * @param errorList the errorList to set
	 */
	void setErrorList(List<String> errorList);

}
