package com.devsuperior.dsvendas.api.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.devsuperior.dsvendas.api.dto.SellerDTO;
import com.devsuperior.dsvendas.domain.entities.Seller;

@Component
public class SellerMapper {
		
		private ModelMapper modelMapper;
		
		public SellerMapper(ModelMapper modelMapper) {
			this.modelMapper = modelMapper;
		}

		public SellerDTO toModel(Seller seller) {
			return modelMapper.map(seller, SellerDTO.class);
		}
		
		public List<SellerDTO> toCollectionDTO(List<Seller> sellers){
			return sellers.stream().map(this::toModel).collect(Collectors.toList());
		}
		
		public Seller toEntity(SellerDTO sellerDTO) {
			return modelMapper.map(sellerDTO, Seller.class);
		}
}