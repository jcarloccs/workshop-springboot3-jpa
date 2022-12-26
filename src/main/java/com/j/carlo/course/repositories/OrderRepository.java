package com.j.carlo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j.carlo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
