package com.internousdev.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ec.dto.CreateItemDTO;
import com.internousdev.ec.util.DBConnector;

public class CreateItemDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private CreateItemDTO createItemDTO=new CreateItemDTO();

	public CreateItemDTO getCreateItemInfo(String itemName, String itemPrice, String itemStock){
		String sql="SELECT * FROM item_info_transaction where item_name = ? AND item_price = ? AND item_stock = ?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setString(1, itemName);
			preparedStatement.setString(2,  itemPrice);
			preparedStatement.setString(3,  itemStock);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				createItemDTO.setItemName(resultSet.getString("item_name"));
				createItemDTO.setItemPrice(resultSet.getString("item_price"));
				createItemDTO.setItemStock(resultSet.getString("item_stock"));

				if(!(resultSet.getString("item_name").equals(null))){
					createItemDTO.setItemFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return createItemDTO;
	}
	public CreateItemDTO getCreateItemDTO(){
		return createItemDTO;
	}
}