package com.internousdev.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ec.dto.CreatorContactDTO;
import com.internousdev.ec.util.DBConnector;

public class CreatorContactDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private CreatorContactDTO creatorContactDTO=new CreatorContactDTO();

	public CreatorContactDTO getCreatorItemInfo(String creatorId, String creatorMell, String CreatorContact){
		String sql="SELECT * FROM creator_contact_transaction where creator_id = ? AND creator_mell = ? AND creator_contact = ?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setString(1, creatorId);
			preparedStatement.setString(2,  creatorMell);
			preparedStatement.setString(3,  CreatorContact);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				creatorContactDTO.setCreatorId(resultSet.getString("creator_id"));
				creatorContactDTO.setCreatorMell(resultSet.getString("creator_mell"));
				creatorContactDTO.setCreatorContact(resultSet.getString("creator_contact"));

				if(!(resultSet.getString("creatorId").equals(null))){
					creatorContactDTO.setCreatorContactFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return creatorContactDTO;
	}
	public CreatorContactDTO getCreatorContactDTO(){
		return creatorContactDTO;
	}
}