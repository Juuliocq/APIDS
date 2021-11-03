package com.devsuperior.dsvendas.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.domain.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
