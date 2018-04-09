package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MasterCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterCreateCompleteAction extends ActionSupport implements SessionAware{
	private String masterUserId;
	private String masterPassword;
	private String userName;
	public Map<String, Object> session;
	private MasterCreateCompleteDAO masterCreateCompleteDAO=new MasterCreateCompleteDAO();

	public String execute() throws SQLException{
		masterCreateCompleteDAO.createUser(session.get("masterUserId").toString(),
				session.get("masterPassword").toString(),
				session.get("userName").toString());

		String result=SUCCESS;
		return result;
	}
	public String getMasterUserId(){
		return masterUserId;
	}
	public void seMasterUserId(String masterUserId){
		this.masterUserId=masterUserId;
	}
	public String getMasterPassword(){
		return masterPassword;
	}
	public void setMasterPassword(String masterPassword){
		this.masterPassword=masterPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}