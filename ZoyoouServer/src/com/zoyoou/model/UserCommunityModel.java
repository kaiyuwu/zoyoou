/**
 * 
 */
package com.zoyoou.model;

import com.zoyoou.common.entity.UserCommunityRelationship;
import com.zoyoou.dao.DataAccessType;

/**
 * @author kaiwu
 *
 */
public class UserCommunityModel extends AbstractModel<UserCommunityRelationship> {

	protected UserCommunityModel() {
		super(DataAccessType.USERCOMMUNITY);
	}
	


}
