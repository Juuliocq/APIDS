package com.devsuperior.dsvendas.domain.services;

import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.domain.repositories.SaleRepository;

@Service
public class SaleService {
	
	private SaleRepository saleRepository;
	
	public SaleService() {}

	public SaleService(SaleRepository saleRepository) {
		super();
		this.saleRepository = saleRepository;
	}
	
	
	}
