package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.CreateItemDAO;
import com.internousdev.template.dao.MasterDAO;
import com.internousdev.template.dto.CreateItemDTO;
import com.internousdev.template.dto.MasterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterAction extends ActionSupport implements SessionAware{
	private String masterUserId;
	private String masterPassword;
	private String result;
	public Map<String,Object> session;
	private MasterDAO masterDAO=new MasterDAO();
	private MasterDTO masterDTO=new MasterDTO();
	private CreateItemDAO createItemDAO=new CreateItemDAO();

	public String getMasterUserId(){
		return masterUserId;
	}
	public void setMatsterUserId(String masterUserId){
		this.masterUserId=masterUserId;
	}
	public String getMasterPassword(){
		return masterPassword;
	}
	public void setMasterPassword(String masterPassword){
		this.masterPassword=masterPassword;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String execute(){
		result=ERROR;
		masterDTO=masterDAO.getMasterUserInfo(masterUserId, masterPassword);
		session.put("masterUser", masterDTO);
		if(((MasterDTO) session.get("masterUser")).getLoginFlg()){
			result=SUCCESS;
			CreateItemDTO createItemDTO=createItemDAO.getCreateItemInfo();
			session.put("master_user_id",masterDTO.getMasterId());
			session.put("id",createItemDTO.getId());
			session.put("CreateItem_name",createItemDTO.getItemName());
			session.put("createItem_price",createItemDTO.getItemPrice());

			return result;
		}
		return result;
	}
}