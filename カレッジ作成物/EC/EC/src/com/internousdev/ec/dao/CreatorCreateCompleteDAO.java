package com.internousdev.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ec.util.DBConnector;
import com.internousdev.ec.util.DateUtil;

public class CreatorCreateCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();
	private String sql="INSERT INTO login_creator_transaction (login_id, login_pass, user_name, insert_date) VALUES(?, ?, ?, ?)";
	public void createCreator(String loginCreatorId, String loginCreatorPassword, String creatorName) throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, loginCreatorId);
			preparedStatement.setString(2, loginCreatorPassword);
			preparedStatement.setString(3, creatorName);
			preparedStatement.setString(4, dateUtil.getDate());

			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}