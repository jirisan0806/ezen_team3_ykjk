package com.ykjk.ykjkApp.product.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderList {
	
	private String order_size;
	private int order_quantity;
	private int order_no;
	private int product_no;

}
