/**
 * 
 */
package com.zoyoou.model;

import com.zoyoou.common.entity.UserCommunityRelationship;
import com.zoyoou.dao.DataAccessType;
import com.zoyoou.dao.UserCommunityDao;

/**
 * @author kaiwu
 *
 */
public class UserCommunityModel extends AbstractModel<UserCommunityDao,UserCommunityRelationship> {

	protected UserCommunityModel() {
		super(DataAccessType.USERCOMMUNITY);
	}
	


}
