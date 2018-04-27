package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.MasterDTO;
import com.internousdev.template.util.DBConnector;

public class MasterDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private MasterDTO masterDTO=new MasterDTO();

	public MasterDTO getMasterUserInfo(String masterUserId, String masterPassword){
		String sql="SELECT * FROM master_user_transaction where master_id = ? AND master_pass = ?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setString(1, masterUserId);
			preparedStatement.setString(2,  masterPassword);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				masterDTO.setMasterId(resultSet.getString("master_id"));
				masterDTO.setMasterPassword(resultSet.getString("master_pass"));
				masterDTO.setUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("master_id").equals(null))){
					masterDTO.setMasterFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return masterDTO;
	}
	public MasterDTO getMasterDTO(){
		return masterDTO;
	}
}