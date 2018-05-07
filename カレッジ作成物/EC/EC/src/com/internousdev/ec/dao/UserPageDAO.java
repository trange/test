package com.internousdev.ec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ec.dto.UserPageDTO;
import com.internousdev.ec.util.DBConnector;

public class UserPageDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private UserPageDTO userPageDTO=new UserPageDTO();
	public UserPageDTO getUserPageUserInfo(String item_transaction_id, String user_master_id) throws SQLException{
		String sql="SELECT iit.item_name, ubit.total_price, ubit.total_count, ubit.pay FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id = iit.id WHERE ubit.item_transaction_id = ? AND ubit.user_master_id = ? ORDER BY ubit.insert_date DESC";
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				userPageDTO.setItemName(resultSet.getString("item_name"));
				userPageDTO.setTotalPrice(resultSet.getString("total_price"));
				userPageDTO.setTotalCount(resultSet.getString("total_count"));
				userPageDTO.setPayment(resultSet.getString("pay"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return userPageDTO;
	}
	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id) throws SQLException{
		String sql="DELETE FROM user_buy_item_transaction WHERE item_transaction_id = ? AND user_master_id = ?";
		PreparedStatement preparedStatement;
		int result=0;
		try{
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);
			result=preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}
}