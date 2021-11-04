package com.devsuperior.dsvendas.api.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.domain.entities.Seller;

public class SellerSalesSuccessDTO implements Serializable{
	
	/**
	 * 	
	 */
	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visisted;
	private Long deals;
	
	public SellerSalesSuccessDTO(Seller seller, Long visited, Long deals) {
		this.sellerName = seller.getName();
		this.visisted = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisisted() {
		return visisted;
	}

	public void setVisisted(Long visisted) {
		this.visisted = visisted;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
}
