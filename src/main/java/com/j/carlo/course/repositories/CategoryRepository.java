package com.j.carlo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j.carlo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
