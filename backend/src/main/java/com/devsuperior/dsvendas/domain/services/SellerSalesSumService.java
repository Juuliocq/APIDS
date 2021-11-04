package com.devsuperior.dsvendas.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.api.dto.SellerSalesSumDTO;
import com.devsuperior.dsvendas.domain.repositories.SaleRepository;

@Service
public class SellerSalesSumService {

	private SaleRepository saleRepository;
	
	public SellerSalesSumService(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}

	@Transactional(readOnly = true)
	public List<SellerSalesSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	};
}
