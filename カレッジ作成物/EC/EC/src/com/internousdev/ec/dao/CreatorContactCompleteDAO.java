package com.internousdev.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ec.util.DBConnector;
import com.internousdev.ec.util.DateUtil;

public class CreatorContactCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil=new DateUtil();
	private String sql="INSERT INTO creator_contact_transaction (creator_id, creator_mell, creator_contact, insert_date) VALUES(?, ?, ?, ?)";
	public void creatorContact(String creatorId, String creatorMell, String creatorContact) throws SQLException{
		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, creatorId);
			preparedStatement.setString(2, creatorMell);
			preparedStatement.setString(3, creatorContact);
			preparedStatement.setString(4, dateUtil.getDate());

			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}