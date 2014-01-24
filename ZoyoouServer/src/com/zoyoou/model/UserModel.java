package com.zoyoou.model;

import java.util.ArrayList;
import java.util.List;

import com.zoyoou.common.entity.User;
import com.zoyoou.dao.DataAccessType;
import com.zoyoou.dao.UserDao;
import com.zoyoou.resource.ErrorMessages;

public class  UserModel extends AbstractModel<User>{
	
	public UserModel(){
		super(DataAccessType.USER);
	}
	
	protected UserModel(DataAccessType daoType) {
		super(daoType);
	}

	public User login(String username, String password) throws Exception{
		
		this.initDao();
		User user = ((UserDao)this.dao).findByUserName(username);
		this.closeDao();
		
		if(null == user){
			user = new User();
			user.setUserName(username);
			user.setPwd(password);
			user.setErrorList(getLoginErrors());
			return user;
		}
		
		if(!user.getPwd().equals(password)){
			user.setErrorList(getLoginErrors());
		}
		return user;
		
	}
	
	private static List<String> errors =null;
	private static List<String> getLoginErrors(){
		if(null==errors){
			errors = new ArrayList<String>();
			errors.add(ErrorMessages.LOGIN_ERROR);
		}
		
		return errors;
		
	}

}
