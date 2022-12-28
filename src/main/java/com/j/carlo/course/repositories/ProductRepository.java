package com.j.carlo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j.carlo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
