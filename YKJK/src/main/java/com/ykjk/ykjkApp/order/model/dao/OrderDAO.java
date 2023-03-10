package com.ykjk.ykjkApp.order.model.dao;

import java.util.List;
import java.util.Map;

import com.ykjk.ykjkApp.order.model.vo.Cart;
import com.ykjk.ykjkApp.order.model.vo.Order;
import com.ykjk.ykjkApp.order.model.vo.OrderList;

public interface OrderDAO {
	
	List<Cart> selectCartList(int member_no);

	int deleteCartProduct(int cart_no);
	
	int deleteCartProductAll(int member_no);

	int updateQuantity(Map<String, String> map);

	List<Cart> selectedCartList(int cart_no);

	int insertOrder(Order order);

	int insertOrderList(OrderList oList);

	int insertPurchase(int member_no);

	int insertSaleList(int member_no);

	Order selectOrderList();

	int addCartList(Cart cart);

	int addTempCartList(Cart cart);

	int selectTempCartNo();


	
}
