package com.internousdev.ec.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserContactConfirmAction extends ActionSupport implements SessionAware {
		private String userId;
		private String userMell;
		private String userContact;
		public Map<String,Object> session;
		private String errorMassage;

		public String execute(){
			String result=SUCCESS;
			if(!(userId.equals(""))
					&& !(userMell.equals(""))
					&& !(userContact.equals(""))){
					session.put("itemName", userId);
					session.put("itemPrice", userMell);
					session.put("itemStock", userContact);
			}else{
				setErrorMassage("未入力の項目があります。");
				result=ERROR;
			}
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
		public String getErrorMassage(){
			return errorMassage;
		}
		public void setErrorMassage(String errorMassage){
			this.errorMassage=errorMassage;
		}
}