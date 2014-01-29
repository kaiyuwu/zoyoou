/**
 * 
 */
package com.zuoyou.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import com.zoyoou.common.entity.User;
import com.zoyoou.model.ModelType;
import com.zoyoou.model.UserModel;

/**
 * @author kaiwu
 *
 */
@Provider
@Path(Constants.ServicePath.USER_SERVICE_PATH)
public class UserService extends AbstractZuoyouWebservice<UserModel,User> {

	public UserService(){
		super(ModelType.USER);
	}
	
	@GET
	@Path(Constants.ServicePath.LOGIN_PATH)
	@Produces({ MediaType.APPLICATION_JSON})
	public User login(@QueryParam(Constants.QueryParam.USERNAME) String username,
					  @QueryParam(Constants.QueryParam.PASSWORD) String password) throws Exception{
		return (this.model).login(username, password);
	}

}
