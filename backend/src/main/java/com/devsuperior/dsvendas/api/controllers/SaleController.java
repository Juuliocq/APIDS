package com.devsuperior.dsvendas.api.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.api.dto.SaleDTO;
import com.devsuperior.dsvendas.api.mappers.SaleMapper;
import com.devsuperior.dsvendas.domain.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	private SaleService saleService;
	private SaleMapper saleMapper;
	
	public SaleController(SaleService saleService, SaleMapper saleMapper) {
		super();
		this.saleService = saleService;
		this.saleMapper = saleMapper;
	}
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = saleMapper.toCollectionDTO(saleService.findAll(pageable));
		return ResponseEntity.ok(list);
	}
}
