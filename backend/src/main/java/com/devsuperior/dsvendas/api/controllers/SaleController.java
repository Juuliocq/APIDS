package com.devsuperior.dsvendas.api.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.api.dto.SaleDTO;
import com.devsuperior.dsvendas.api.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.api.dto.SaleSumDTO;
import com.devsuperior.dsvendas.api.mappers.SaleMapper;
import com.devsuperior.dsvendas.domain.services.SaleService;
import com.devsuperior.dsvendas.domain.services.SaleSuccessService;
import com.devsuperior.dsvendas.domain.services.SaleSumService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	private SaleService saleService;
	private SaleSumService saleSumService;
	private SaleSuccessService saleSuccessService;
	private SaleMapper saleMapper;
	
	public SaleController(SaleService saleService, SaleMapper saleMapper, SaleSumService saleSumService, SaleSuccessService saleSuccessService) {
		this.saleService = saleService;
		this.saleMapper = saleMapper;
		this.saleSumService = saleSumService;
		this.saleSuccessService = saleSuccessService;
	}
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = saleMapper.toCollectionDTO(saleService.findAll(pageable));
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/sum-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		List<SaleSumDTO> list = saleSumService.amountGroupedBySeller();
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
		List<SaleSuccessDTO> list = saleSuccessService.successGroupedBySeller();
		
		return ResponseEntity.ok(list);
	}
}
