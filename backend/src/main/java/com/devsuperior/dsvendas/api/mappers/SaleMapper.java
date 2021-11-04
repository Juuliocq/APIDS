package com.devsuperior.dsvendas.api.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
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
		
		public Page<SaleDTO> toCollectionDTO(Page<Sale> sales){
			return sales.map(this::toModel);
		}
		
		public Sale toEntity(Sale saleDTO) {
			return modelMapper.map(saleDTO, Sale.class);
		}
}