package com.internousdev.ec.dto;

public class CreatorLoginDTO {
	private String loginCreatorId;
	private String loginCreatorPassword;
	private String creatorName;
	private boolean loginCreatorFlg=false;

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

	public boolean getLoginCreatorFlg(){
		return loginCreatorFlg;
	}
	public void setLoginCreatorFlg(boolean loginCreatorFlg){
		this.loginCreatorFlg=loginCreatorFlg;
	}
}