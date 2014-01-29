/**
 * 
 */
package com.zoyoou.model;

import com.zoyoou.common.entity.ContactInfo;
import com.zoyoou.dao.ContactInfoDao;
import com.zoyoou.dao.DataAccessType;

/**
 * @author kaiwu
 *
 */
public class ContactInfoModel extends AbstractModel<ContactInfoDao,ContactInfo> {

	protected ContactInfoModel() {
		super(DataAccessType.CONTACTINFO);
	}

}
