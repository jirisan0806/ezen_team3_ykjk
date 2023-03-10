package com.ykjk.ykjkApp.myPage.senondHand.model.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Product implements Serializable {
	
	private int product_no;
	private String product_name;
	private String product_detail;
	private String product_sizeinfo;
	private String product_size;
	private int product_price;
	private int product_stock_s;
	private int product_stock_m;
	private int product_stock_l;
	private int product_type;
	private int member_no;

}
