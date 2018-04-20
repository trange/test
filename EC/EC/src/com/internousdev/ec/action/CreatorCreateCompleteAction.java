package com.internousdev.ec.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec.dao.CreatorCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreatorCreateCompleteAction extends ActionSupport implements SessionAware{
	private String loginCreatorId;
	private String loginCreatorPassword;
	private String creatorName;
	public Map<String, Object> session;
	private CreatorCreateCompleteDAO creatorCreateCompleteDAO=new CreatorCreateCompleteDAO();

	public String execute() throws SQLException{
		creatorCreateCompleteDAO.createCreator(session.get("loginCreatorId").toString(),
				session.get("loginCreatorPassword").toString(),
				session.get("creatorName").toString());

		String result=SUCCESS;
		return result;
	}
	public String getLoginCreatorId(){
		return loginCreatorId;
	}
	public void setLoginCreatorId(String loginCreatorId){
		this.loginCreatorId=loginCreatorId;
	}
	public String getLoginCreatorPassword(){
		return loginCreatorPassword;
	}
	public void setLoginCreatorPassword(String loginCreatorPassword){
		this.loginCreatorPassword=loginCreatorPassword;
	}
	public String getCreatorName(){
		return creatorName;
	}
	public void setCreatorName(String creatorName){
		this.creatorName=creatorName;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}