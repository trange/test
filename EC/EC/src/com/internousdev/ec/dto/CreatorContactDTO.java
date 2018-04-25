package com.internousdev.ec.dto;

public class CreatorContactDTO {

	private String creatorId;
	private String creatorMell;
	private String creatorContact;
	private boolean creatorContactFlg=false;

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

	public boolean getCreatorContactFlg(){
		return creatorContactFlg;
	}
	public void setCreatorContactFlg(boolean creatorContactFlg){
		this.creatorContactFlg=creatorContactFlg;
	}
}