package com.hgarmatz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgarmatz.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
