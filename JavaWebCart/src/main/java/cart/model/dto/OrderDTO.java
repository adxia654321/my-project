package cart.model.dto;

import java.util.ArrayList;
import java.util.List;

import cart.model.entity.OrderItem;

public class OrderDTO {

	private Integer orderId;
	private Integer userId;
	private List<OrderItem> items = new ArrayList<OrderItem>();

}
