package com.internousdev.ec.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec.dao.CreateItemDAO;
import com.internousdev.ec.dao.CreatorLoginDAO;
import com.internousdev.ec.dto.CreateItemDTO;
import com.internousdev.ec.dto.CreatorLoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreatorLoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String result;
	public Map<String,Object> session;
	private CreatorLoginDAO creatorLoginDAO=new CreatorLoginDAO();
	private CreatorLoginDTO creatorLoginDTO=new CreatorLoginDTO();
	private CreateItemDAO createItemDAO=new CreateItemDAO();

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String execute(){
		result=ERROR;
		creatorLoginDTO = creatorLoginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", creatorLoginDTO);
		if(((CreatorLoginDTO) session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;
			CreateItemDTO createItemDTO=createItemDAO.getItemInfo();
			session.put("login_user_id",creatorLoginDTO.getLoginId());
			session.put("id",createItemDTO.getId());
			session.put("buyItem_name",createItemDTO.getItemName());
			session.put("buyItem_price",createItemDTO.getItemPrice());

			return result;
		}
		return result;
	}
}