package com.devsuperior.dsvendas.api.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.domain.entities.Seller;

public class SellerSalesSumDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	public SellerSalesSumDTO() {}
	
	public SellerSalesSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
