package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MasterCreateConfirmAction extends ActionSupport implements SessionAware {
		private String masterUserId;
		private String masterPassword;
		private String userName;
		public Map<String,Object> session;
		private String errorMassage;

		public String execute(){
			String result=SUCCESS;
			if(!(masterUserId.equals(""))
					&& !(masterPassword.equals(""))
					&& !(userName.equals(""))){
					session.put("masterUserId", masterUserId);
					session.put("masterPassword", masterPassword);
					session.put("userName", userName);
			}else{
				setErrorMassage("未入力の項目があります。");
				result=ERROR;
			}
			return result;
		}
		public String getMasterUserId(){
			return masterUserId;
		}
		public void setMasterUserId(String masterUserId){
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
		public String getErrorMassage(){
			return errorMassage;
		}
		public void setErrorMassage(String errorMassage){
			this.errorMassage=errorMassage;
		}
}