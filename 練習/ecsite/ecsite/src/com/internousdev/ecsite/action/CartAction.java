package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.CartDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private int count;

	private int pay;

	/**
	 *
	 */
	public String execute() throws NumberFormatException, SQLException {
		String result = SUCCESS;

		if (!session.containsKey("login_user_id")) {
			return ERROR;
		}

		BuyItemDTO buyItemDTO = new BuyItemDTO();
		buyItemDTO = (BuyItemDTO) session.get("buyItems");
		CartDAO cartDAO = new CartDAO();

		session.put("buy_count", count);
		session.put("total_price", (Integer.parseInt(buyItemDTO.getItemPrice()) * count));

		if(pay == 1) {
			session.put("pay", "クレジットカード");
		} else {
			session.put("pay", "現金払い");
		}

		cartDAO.createCart(session.get("login_user_id").toString(), buyItemDTO.getId(), Integer.parseInt(session.get("total_price").toString()), Integer.parseInt(session.get("buy_count").toString()), session.get("pay").toString());

		List<CartDTO> cartDTOList = cartDAO.getCartInfo(session.get("login_user_id").toString());

		session.put("cartDTOList", cartDTOList);
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * @return count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count セットする count
	 */
	public void setCount(int count) {
		this.count = count;
	}
}
