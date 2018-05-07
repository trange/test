package com.internousdev.ec.dto;

public class UserContactDTO {

	private String userId;
	private String userMell;
	private String userContact;
	private boolean userContactFlg=false;

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

	public boolean getUserContactFlg(){
		return userContactFlg;
	}
	public void setUserContactFlg(boolean userContactFlg){
		this.userContactFlg=userContactFlg;
	}
}