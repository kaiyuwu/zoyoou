package com.zoyoou.test;



import org.codehaus.jackson.map.ObjectMapper;

import com.zoyoou.common.entity.User;
import com.zoyoou.model.ModelFactory;
import com.zoyoou.model.ModelType;
import com.zoyoou.model.UserModel;

public class TestModel {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			User user= TestHelper.getTestUserForCreate("a28", "123456");
			String reqStr = mapper.writeValueAsString(user);
			System.out.println(reqStr);

			UserModel userModel = (UserModel)ModelFactory.getModel(ModelType.USER);

			
			User createdUser = userModel.create(user);
			reqStr = mapper.writeValueAsString(createdUser);
			System.out.println(reqStr);
		
			user = userModel.findById(createdUser.getUserId());
			
		    reqStr = mapper.writeValueAsString(user);
			System.out.println(reqStr);

//			long cid = user.getContactinfo().getContactID()-1;
//			user.getContactinfo().setContactID(cid);
			User updateUser = TestHelper.getTestUserForUpdate(user);
			user = userModel.update(updateUser);
			
		    reqStr = mapper.writeValueAsString(user);
			System.out.println(reqStr);
	
			
			
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
