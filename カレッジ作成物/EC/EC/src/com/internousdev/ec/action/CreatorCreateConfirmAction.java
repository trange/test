package com.internousdev.ec.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreatorCreateConfirmAction extends ActionSupport implements SessionAware {
		private String loginCreatorId;
		private String loginCreatorPassword;
		private String creatorName;
		public Map<String,Object> session;
		private String errorMassage;

		public String execute(){
			String result=SUCCESS;
			if(!(loginCreatorId.equals(""))
					&& !(loginCreatorPassword.equals(""))
					&& !(creatorName.equals(""))){
					session.put("loginCreatorId", loginCreatorId);
					session.put("loginCreatorPassword", loginCreatorPassword);
					session.put("creatorName", creatorName);
			}else{
				setErrorMassage("未入力の項目があります。");
				result=ERROR;
			}
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
		public String getErrorMassage(){
			return errorMassage;
		}
		public void setErrorMassage(String errorMassage){
			this.errorMassage=errorMassage;
		}
}