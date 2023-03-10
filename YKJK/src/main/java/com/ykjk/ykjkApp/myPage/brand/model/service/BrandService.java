package com.ykjk.ykjkApp.myPage.brand.model.service;

import java.util.List;
import java.util.Map;

import com.ykjk.ykjkApp.member.model.vo.Member;
import com.ykjk.ykjkApp.myPage.brand.model.vo.MypageOrderList;
import com.ykjk.ykjkApp.myPage.brand.model.vo.O_Order;
import com.ykjk.ykjkApp.myPage.brand.model.vo.O_Order_List;
import com.ykjk.ykjkApp.product.model.vo.Attachment;
import com.ykjk.ykjkApp.product.model.vo.Product;

public interface BrandService {

	List<Map<String, String>> selectBrandOrderList(int cPage, int numPerPage, String brand_name);
	
	int brandSelectTotalContents();

	List<Map<String, String>> selectBrandProductList(int cPage, int numPerPage, int member_no);

	int deleteBrandProductList(int productNo);
	
	// 주문 detail
	List<MypageOrderList> selectBrandOrderDetail(O_Order tempOrder);
	
	// Info update에 관련된 공통 함수
	int updateBrandInfo(Member tempMember);

	int emUpdateBrandInfo(Member tempMember);

	int phUpdateBrandInfo(Member tempMember);

	int acUpdateBrandInfo(Member tempMember);

	List<Product> selectBrandProductRankList(int member_no);

	int updateBrandStatus(O_Order_List tempOrder);


	int brandProductSelectTotalContents();

	List<Attachment> selectAttachmentList(int productNo);


}