package com.j.carlo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j.carlo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
