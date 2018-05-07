package com.internousdev.ec.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec.dao.UserContactCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserContactCompleteAction extends ActionSupport implements SessionAware{
	private String userId;
	private String userMell;
	private String userContact;
	public Map<String, Object> session;
	private UserContactCompleteDAO userContactCompleteDAO=new UserContactCompleteDAO();

	public String execute() throws SQLException{
		userContactCompleteDAO.userContact(session.get("userId").toString(),
				session.get("userMell").toString(),
				session.get("userContact").toString());

		String result=SUCCESS;
		return result;
	}
	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserMell(){
		return userMell;
	}
	public void setUserMell(String userMell){
		this.userMell=userMell;
	}
	public String getUserContact(){
		return userContact;
	}
	public void setUserContact(String userContact){
		this.userContact=userContact;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}