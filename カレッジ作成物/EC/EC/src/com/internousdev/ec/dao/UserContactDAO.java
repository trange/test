package com.internousdev.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ec.dto.UserContactDTO;
import com.internousdev.ec.util.DBConnector;

public class UserContactDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private UserContactDTO userContactDTO=new UserContactDTO();

	public UserContactDTO getUserItemInfo(String userId, String userMell, String UserContact){
		String sql="SELECT * FROM user_contact_transaction where user_id = ? AND user_mell = ? AND user_contact = ?";
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setString(1, userId);
			preparedStatement.setString(2,  userMell);
			preparedStatement.setString(3,  UserContact);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				userContactDTO.setUserId(resultSet.getString("user_id"));
				userContactDTO.setUserMell(resultSet.getString("user_mell"));
				userContactDTO.setUserContact(resultSet.getString("user_contact"));

				if(!(resultSet.getString("userId").equals(null))){
					userContactDTO.setUserContactFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return userContactDTO;
	}
	public UserContactDTO getUserContactDTO(){
		return userContactDTO;
	}
}