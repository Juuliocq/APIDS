package com.devsuperior.dsvendas.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.api.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.domain.repositories.SaleRepository;

@Service
public class SaleSuccessService {

	private SaleRepository saleRepository;
	
	public SaleSuccessService(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return saleRepository.successGroupedBySeller();
	};
}
