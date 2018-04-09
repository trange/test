package com.internousdev.template.dto;

public class MasterDTO {
	private String masterId;
	private String masterPassword;
	private String userName;
	private boolean masterFlg=false;

	public String getMasterId(){
		return masterId;
	}
	public void setMasterId(String masterId){
		this.masterId=masterId;
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

	public boolean getLoginFlg(){
		return masterFlg;
	}
	public void setMasterFlg(boolean masterFlg){
		this.masterFlg=masterFlg;
	}
}