package com.internousdev.ec.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ec.dao.CreatorPageDAO;
import com.internousdev.ec.dto.CreatorPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreatorPageAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;
	public CreatorPageDAO creatorPageDAO=new CreatorPageDAO();
	public CreatorPageDTO creatorPageDTO=new CreatorPageDTO();
	public String deleteFlg;
	private String result;
	public String execute() throws SQLException{
		// 商品履歴を削除しない場合
		if(deleteFlg==null){
			String item_transaction_id=session.get("id").toString();
			String user_master_id=session.get("login_user_id").toString();
			creatorPageDTO=creatorPageDAO.getCreatorPageUserInfo(item_transaction_id, user_master_id);
			session.put("buyItem_name", creatorPageDTO.getItemName());
			session.put("total_price", creatorPageDTO.getTotalPrice());
			session.put("total_count", creatorPageDTO.getTotalCount());
			session.put("total_payment", creatorPageDTO.getPayment());
			session.put("message", "");
		// 商品履歴を削除する場合
		}else if(deleteFlg.equals("1")){
			delete();
		}
		result=SUCCESS;
		return result;
	}
	public void delete() throws SQLException{
		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_user_id").toString();
		int res=creatorPageDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);
		if(res > 0){
			session.put("message", "商品情報を正しく削除しました。");
		}else if(res==0){
			session.put("message", "商品情報の削除に失敗しました。");
		}
	}
	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
	@Override
	public void setSession(Map<String, Object> loginSessionMap){
		this.session=loginSessionMap;
	}
}