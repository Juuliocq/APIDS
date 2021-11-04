package com.devsuperior.dsvendas.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.api.dto.SellerDTO;
import com.devsuperior.dsvendas.api.mappers.SellerMapper;
import com.devsuperior.dsvendas.domain.services.SellerService;

@RestController
@RequestMapping("/sellers")
public class SellerController {

	private SellerService sellerService;
	private SellerMapper sellerMapper;
	
	public SellerController(SellerService sellerService, SellerMapper sellerMapper) {
		this.sellerService = sellerService;
		this.sellerMapper = sellerMapper;
	}
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = sellerMapper.toCollectionDTO(sellerService.findAll());
		
		return ResponseEntity.ok(list);
	}
	
}
