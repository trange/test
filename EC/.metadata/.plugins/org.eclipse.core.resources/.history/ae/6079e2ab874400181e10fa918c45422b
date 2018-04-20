package com.internousdev.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ec.dto.CreatorLoginDTO;
import com.internousdev.ec.util.DBConnector;

public class CreatorLoginDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private CreatorLoginDTO creatorLoginDTO=new CreatorLoginDTO();

	public CreatorLoginDTO getLoginUserInfo(String loginUserId, String loginPassword){
		String sql="SELECT * FROM login_creator_transaction where login_id = ? AND login_pass = ?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2,  loginPassword);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				creatorLoginDTO.setLoginId(resultSet.getString("login_id"));
				creatorLoginDTO.setLoginPassword(resultSet.getString("login_pass"));
				creatorLoginDTO.setUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("login_id").equals(null))){
					creatorLoginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return creatorLoginDTO;
	}
	public CreatorLoginDTO getCreatorLoginDTO(){
		return creatorLoginDTO;
	}
}