package com.devsuperior.dsvendas.api.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.devsuperior.dsvendas.api.dto.SaleDTO;
import com.devsuperior.dsvendas.domain.entities.Sale;

@Component
public class SaleMapper {
		
		private ModelMapper modelMapper;
		
		public SaleMapper(ModelMapper modelMapper) {
			this.modelMapper = modelMapper;
		}

		public SaleDTO toModel(Sale sale) {
			return modelMapper.map(sale, SaleDTO.class);
		}
		
		public List<SaleDTO> toCollectionModel(List<Sale> sales){
			return sales.stream().map(this::toModel).collect(Collectors.toList());
		}
		
		public Sale toEntity(Sale saleDTO) {
			return modelMapper.map(saleDTO, Sale.class);
		}
}