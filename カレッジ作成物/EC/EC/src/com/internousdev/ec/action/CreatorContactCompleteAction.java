package com.internousdev.ec.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec.dao.CreatorContactCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreatorContactCompleteAction extends ActionSupport implements SessionAware{
	private String creatorId;
	private String creatorMell;
	private String creatorContact;
	public Map<String, Object> session;
	private CreatorContactCompleteDAO creatorContactCompleteDAO=new CreatorContactCompleteDAO();

	public String execute() throws SQLException{
		creatorContactCompleteDAO.creatorContact(session.get("creatorId").toString(),
				session.get("creatorMell").toString(),
				session.get("creatorContact").toString());

		String result=SUCCESS;
		return result;
	}
	public String getCreatorId(){
		return creatorId;
	}
	public void setCreatorId(String creatorId){
		this.creatorId=creatorId;
	}
	public String getCreatorMell(){
		return creatorMell;
	}
	public void setCreatorMell(String creatorMell){
		this.creatorMell=creatorMell;
	}
	public String getCreatorContact(){
		return creatorContact;
	}
	public void setCreatorContact(String creatorContact){
		this.creatorContact=creatorContact;
	}
	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}