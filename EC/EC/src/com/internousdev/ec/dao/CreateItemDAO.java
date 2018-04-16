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

	public CreateItemDTO getItemInfo(){
		String sql="SELECT id, item_name, item_price FROM item_info_transaction";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				createItemDTO.setId(resultSet.getInt("id"));
				createItemDTO.setItemName(resultSet.getString("item_name"));
				createItemDTO.setItemPrice(resultSet.getString("item_price"));
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