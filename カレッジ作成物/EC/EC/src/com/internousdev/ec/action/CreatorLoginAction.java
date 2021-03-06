package com.internousdev.ec.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec.dao.CreatorLoginDAO;
import com.internousdev.ec.dto.CreatorLoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreatorLoginAction extends ActionSupport implements SessionAware{
	private String loginCreatorId;
	private String loginCreatorPassword;
	private String result;
	public Map<String,Object> session;
	private CreatorLoginDAO creatorLoginDAO=new CreatorLoginDAO();
	private CreatorLoginDTO creatorLoginDTO=new CreatorLoginDTO();

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

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String execute(){
		result=ERROR;
		creatorLoginDTO = creatorLoginDAO.getLoginCreatorInfo(loginCreatorId, loginCreatorPassword);
		session.put("loginCreator", creatorLoginDTO);
		if(((CreatorLoginDTO) session.get("loginCreator")).getLoginCreatorFlg()){
			result=SUCCESS;
			session.put("login_user_id",creatorLoginDTO.getLoginCreatorId());

			return result;
		}
		return result;
	}
}