package com.internousdev.ec.dto;

public class CreateItemDTO {
	private String itemName;
	private String itemPrice;
	private String itemStock;
	private boolean itemFlg=false;

	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice=itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}
	public void setItemStock(String itemStock){
		this.itemStock=itemStock;
	}

	public boolean getItemFlg(){
		return itemFlg;
	}
	public void setItemFlg(boolean itemFlg){
		this.itemFlg=itemFlg;
	}
}