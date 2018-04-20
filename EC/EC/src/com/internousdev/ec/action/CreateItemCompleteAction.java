package com.internousdev.ec.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec.dao.CreateItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateItemCompleteAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String, Object> session;
	private CreateItemCompleteDAO createItemCompleteDAO=new CreateItemCompleteDAO();

	public String execute() throws SQLException{
		createItemCompleteDAO.createItem(session.get("itemName").toString(),
				session.get("itemPrice").toString(),
				session.get("itemStock").toString());

		String result=SUCCESS;
		return result;
	}
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
	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}
}