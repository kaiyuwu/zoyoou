package com.zoyoou.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.map.ObjectMapper;
import org.joda.time.DateTime;

import com.zoyoou.common.entity.Community;
import com.zoyoou.common.entity.Role;
import com.zoyoou.common.entity.User;
import com.zoyoou.common.entity.UserCommunityRelationship;

public class TestHelper {

	public static User getTestUserForUpdate(User u){
		User user = u;
		user.setNickName("NicknameforUser");
		user.setGender(true);
		user.setDob(DateTime.now().plusWeeks(1040));
		user.getContactinfo().setAddress1("123 Main Street");
		user.getContactinfo().setAddress2(" Unit 23");
		user.getContactinfo().setCity("Belelvue");
		user.getContactinfo().setProvince("WA");
		user.getContactinfo().setPostCode("123456");
		user.getContactinfo().setEmail1("email@email.com");
		
		return user;


		
	}
	
	public static User getTestUserForCreate(String username, String password){
		User user = new User();
		user.setUserName(username);
		user.setPwd(password);
		user.setCommunityRelation(new UserCommunityRelationship());
		user.getCommunityRelation().setCommunity(new Community());
		user.getCommunityRelation().setRole(new Role());
		
		user.getCommunityRelation().getCommunity().setCommunityId(1);
		user.getCommunityRelation().getRole().setRoleId((short)4);
		return user;

	}
	
	public static User displayResponse(HttpResponse response) throws Exception{
		String respStr = formatResponseString(response);
		System.out.println("Resposne JSON: " + respStr);
		ObjectMapper om = new ObjectMapper();
		
		User u = om.readValue(respStr, User.class);
//		if(u.getErrorList()==null)
//			System.out.println(u.getUserId() + "  " + u.getUserName() );//+"  " + u.getActiveStatus().getActiveId());
//		else{
//			String err = "";
//			for(String error : u.getErrorList()){
//				err += error +"\n";
//			}
//			
//			System.out.println("Error: " + err);
//		}
		
		return u;
			
		
	}
	
	private static String formatResponseString(HttpResponse response) throws IllegalStateException, IOException{

		//return null if there is no response
		if(null == response )return null;
		
		//read response and format to return string.
		StringBuilder responseStringBuilder = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		String line;
		while((line = reader.readLine())!=null){
			responseStringBuilder.append(line);
		}
		reader.close();
		return responseStringBuilder.toString();
		
	}
	
}
