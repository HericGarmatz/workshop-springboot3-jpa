package com.hgarmatz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgarmatz.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
