package com.devsuperior.dsvendas.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.domain.entities.Seller;
import com.devsuperior.dsvendas.domain.repositories.SellerRepository;

@Service
public class SellerService {
	
	private SellerRepository sellerRepository;
		
	public SellerService(SellerRepository sellerRepository) {
		super();
		this.sellerRepository = sellerRepository;
	}

	public List<Seller> findAll() {
		return sellerRepository.findAll();
	}
}
