package com.hgarmatz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgarmatz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
