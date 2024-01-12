package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.users;

public interface UsersRepository  extends JpaRepository<users, Integer>{

	public users findByEmail(String email);

	

}
