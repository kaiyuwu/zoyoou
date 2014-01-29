/**
 * 
 */
package com.zoyoou.model;

import com.zoyoou.common.entity.ContactInfo;
import com.zoyoou.dao.DataAccessType;

/**
 * @author kaiwu
 *
 */
public class ContactInfoModel extends AbstractModel<ContactInfo> {

	protected ContactInfoModel() {
		super(DataAccessType.CONTACTINFO);
	}

}
