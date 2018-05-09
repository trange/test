package com.internousdev.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ec.dto.UserLoginDTO;
import com.internousdev.ec.util.DBConnector;

public class UserLoginDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private UserLoginDTO userLoginDTO=new UserLoginDTO();

	public UserLoginDTO getLoginUserInfo(String loginUserId, String loginPassword){
		String sql="SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2,  loginPassword);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				userLoginDTO.setLoginId(resultSet.getString("login_id"));
				userLoginDTO.setLoginPassword(resultSet.getString("login_pass"));
				userLoginDTO.setUserName(resultSet.getString("user_name"));

				if(!(resultSet.getString("login_id").equals(null))){
					userLoginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return userLoginDTO;
	}
	public UserLoginDTO getUserLoginDTO(){
		return userLoginDTO;
	}
}