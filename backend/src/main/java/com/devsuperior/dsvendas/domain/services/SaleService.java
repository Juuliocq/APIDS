package com.devsuperior.dsvendas.domain.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.domain.entities.Sale;
import com.devsuperior.dsvendas.domain.repositories.SaleRepository;
import com.devsuperior.dsvendas.domain.repositories.SellerRepository;

@Service
public class SaleService {
	
	private SaleRepository saleRepository;
	private SellerRepository sellerRepository;

	public SaleService(SaleRepository saleRepository, SellerRepository sellerRepository) {
		this.saleRepository = saleRepository;
		this.sellerRepository = sellerRepository;
	}
	
	@Transactional(readOnly = true)
	public Page<Sale> findAll(Pageable pageable) {
		
		sellerRepository.findAll();
		return saleRepository.findAll(pageable);
	}	
}
