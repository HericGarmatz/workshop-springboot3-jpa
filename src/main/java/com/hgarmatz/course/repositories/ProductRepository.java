package com.hgarmatz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgarmatz.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
