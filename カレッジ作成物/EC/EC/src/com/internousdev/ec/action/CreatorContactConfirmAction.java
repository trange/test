package com.internousdev.ec.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreatorContactConfirmAction extends ActionSupport implements SessionAware {
		private String creatorId;
		private String creatorMell;
		private String creatorContact;
		public Map<String,Object> session;
		private String errorMassage;

		public String execute(){
			String result=SUCCESS;
			if(!(creatorId.equals(""))
					&& !(creatorMell.equals(""))
					&& !(creatorContact.equals(""))){
					session.put("itemName", creatorId);
					session.put("itemPrice", creatorMell);
					session.put("itemStock", creatorContact);
			}else{
				setErrorMassage("未入力の項目があります。");
				result=ERROR;
			}
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
		public String getErrorMassage(){
			return errorMassage;
		}
		public void setErrorMassage(String errorMassage){
			this.errorMassage=errorMassage;
		}
}