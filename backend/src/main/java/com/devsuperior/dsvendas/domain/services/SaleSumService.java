package com.devsuperior.dsvendas.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.api.dto.SaleSumDTO;
import com.devsuperior.dsvendas.domain.repositories.SaleRepository;

@Service
public class SaleSumService {

	private SaleRepository saleRepository;
	
	public SaleSumService(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}

	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	};
}
