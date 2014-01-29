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

public class TestService {
	private static final String HOST = "localhost";
	private static final int PORT = 8080;
	private static final String ENTITY_CONTENT_TYPE="application/json";

	private static User getTestUserForUpdate(User u){
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
	
	private static User getTestUserForCreate(String username, String password){
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
	
	public static void main(String[] args) throws Exception {
		String testUserName = "test'user6'" +203;
		String testPassword= "123456";
		
		
		
		//create test
		System.out.println("=======  Create Test ===========");
		User createUser = testCreate(getTestUserForCreate(testUserName,testPassword));
		System.out.print("*** CREATE TEST RESULT: ");
		System.out.println(null==createUser.getErrorList()?"Created":createUser.getErrorList().get(0));
		
		if(null==createUser.getErrorList()){
			//login test
			System.out.println("=======  Login Test ===========");
			User loginUser = testLogin(createUser.getUserName(),createUser.getPwd());
			System.out.print("*** LOGIN TEST RESULT: ");
			System.out.println(null==loginUser.getErrorList()?"Logged In":createUser.getErrorList().get(0));
			
			//find by user id test
			System.out.println("=======  FindById Test ===========");
			User findByIdUser = testFindById(createUser.getUserId());
			System.out.print("*** FIND BY ID TEST RESULT: ");
			System.out.println(null==findByIdUser.getErrorList()?"User Found by ID": findByIdUser.getErrorList().get(0));

			if(null == findByIdUser.getErrorList()){
				//update test
				System.out.println("=======  Update Test ===========");
				User updatedUser = testUpdate(getTestUserForUpdate(findByIdUser));
				System.out.print("*** UPDATE TEST RESULT: ");
				System.out.println(null==updatedUser.getErrorList()
						?	"Updated " +updatedUser.getContactinfo().getAddress1()
						:   updatedUser.getErrorList().get(0));
			}

			
			//delete test
			System.out.println("=======  Delete Test ===========");
			User deleteUser = testDelete(createUser.getUserId());
			System.out.print("*** DELETE TEST RESULT 1: ");
			System.out.println(null == deleteUser.getErrorList()?"Deleted":deleteUser.getErrorList().get(0));
			if(null==deleteUser.getErrorList()){
				findByIdUser = testFindById(createUser.getUserId());
				System.out.print("*** DELETE TEST RESULT 2 (CEHCK ACTIVE STATUS): ");
				System.out.println(null ==findByIdUser.getErrorList()
						? "Deleted user found. Active Status is  " + findByIdUser.getActiveStatus().getActiveId()
						: findByIdUser.getErrorList().get(0));
				
			}
		}

	}
	
	private static User testDelete(long userid) throws Exception{
		HttpClient  httpClient = new DefaultHttpClient();
		String uri = getUri("ZoyoouWebService/userservice/" +userid);
		
		System.out.println("URI: " + uri);
	
		
		//create HTTP DELETE
		HttpDelete delete = new HttpDelete(uri);
		
		HttpResponse httpResponse = httpClient.execute(delete);
		return displayResponse(httpResponse);
	}

	
	private static User testUpdate(User user) throws Exception{
		HttpClient  httpClient = new DefaultHttpClient();
		String uri = getUri("ZoyoouWebService/userservice");
		System.out.println("URI: " + uri);
		
		ObjectMapper mapper = new ObjectMapper();
		String reqStr = mapper.writeValueAsString(user);
		System.out.println(reqStr);
		
		//create HTTP PUT
		HttpPut put = new HttpPut(uri);
		//add JSON String to post 
		StringEntity entity = new StringEntity(reqStr);
		entity.setContentType(ENTITY_CONTENT_TYPE); //set content type as JSON
		put.setEntity(entity); //set 
		
		HttpResponse httpResponse = httpClient.execute(put);
		return displayResponse(httpResponse);
	}
	
	private static  String getUri(String service){
		return String.format("http://%s:%d/%s", HOST, PORT, service);
	}
	
	private static User testCreate(User user) throws Exception{
		HttpClient  httpClient = new DefaultHttpClient();
		String uri = getUri("ZoyoouWebService/userservice");
		System.out.println("URI: " + uri);
		
		ObjectMapper mapper = new ObjectMapper();
		String reqStr = mapper.writeValueAsString(user);
		System.out.println(reqStr);
		
		//create HTTP Post
		HttpPost post = new HttpPost(uri);
		//add JSON String to post 
		StringEntity entity = new StringEntity(reqStr);
		entity.setContentType(ENTITY_CONTENT_TYPE); //set content type as JSON
		post.setEntity(entity); //set 
		
		HttpResponse httpResponse = httpClient.execute(post);
		return displayResponse(httpResponse);
	}
	private static User testLogin(String username, String password) throws Exception{
		HttpClient  httpClient = new DefaultHttpClient();
		String uri = getUri("ZoyoouWebService/userservice/login/"+"?username="+username+"&password="+password);
		System.out.println("URI: " + uri);
		HttpGet httpGet = new HttpGet(uri);
		HttpResponse httpResponse = httpClient.execute(httpGet);
		return displayResponse(httpResponse);
		
	}
	
	
	private static User testFindById(long uid) throws Exception{
		HttpClient  httpClient = new DefaultHttpClient();		
		
		String uri = getUri("ZoyoouWebService/userservice/" +uid);
		System.out.println("URI: " + uri);
		HttpGet httpGet = new HttpGet(uri);
	
		HttpResponse httpResponse = httpClient.execute(httpGet);
		return displayResponse(httpResponse);
	}
	
	
	private static User displayResponse(HttpResponse response) throws Exception{
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
