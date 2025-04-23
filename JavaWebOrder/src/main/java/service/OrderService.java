package service;

import dao.OrderDAO;
import model.dto.OrderDTO;
import model.entity.Order;

public class OrderService {
	private OrderDAO orderDAO = new OrderDAO();
	
	// 根據訂單項目(item)新增一筆訂單並回傳訂單顯示資訊(OrderDTO)
	public OrderDTO addOrder(String item) {
		// 1: 根據訂單項目(item)新增一筆訂單
		Order order = new Order();
		order.setItem(item);
		order.setPrice(100); // 價格一律 100 元
		// 傳給 orderDAO 儲存訂單
		orderDAO.save(order);
		//-------------------------------------
		// 2: 回傳訂單顯示資訊(OrderDTO)
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setMessage("您點了 " + order.getItem() + " 價格:" + order.getPrice() + "元");
		
		return orderDTO;
	}
	
}