package com.devsuperior.dsvendas.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.domain.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
