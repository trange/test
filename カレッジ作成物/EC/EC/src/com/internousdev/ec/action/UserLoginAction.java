package com.internousdev.ec.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec.dao.BuyItemDAO;
import com.internousdev.ec.dao.UserLoginDAO;
import com.internousdev.ec.dto.BuyItemDTO;
import com.internousdev.ec.dto.UserLoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private String result;
	public Map<String,Object> session;
	private UserLoginDAO userLoginDAO=new UserLoginDAO();
	private UserLoginDTO userLoginDTO=new UserLoginDTO();
	private BuyItemDAO buyItemDAO=new BuyItemDAO();

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
		userLoginDTO=userLoginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", userLoginDTO);
		if(((UserLoginDTO) session.get("loginUser")).getLoginFlg()){
			result=SUCCESS;
			BuyItemDTO buyItemDTO=buyItemDAO.getBuyItemInfo();
			session.put("login_user_id",userLoginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("buyItem_name",buyItemDTO.getItemName());
			session.put("buyItem_price",buyItemDTO.getItemPrice());

			return result;
		}
		return result;
	}
}