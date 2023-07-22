package com.example.SpringSecurityRegDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurityRegDemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findUserByEmail(String email);
	
	public User findUserByUserName(String name);
}