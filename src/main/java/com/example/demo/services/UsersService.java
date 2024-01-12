package com.example.demo.services;

import com.example.demo.entities.users;

public interface UsersService {
	
	public String addUser(users user);

	public boolean emailExists(String email);

	public boolean validateUser(String email, String password);

	public String getRole(String email);
	
	public users getUser(String email);
	
	public void updateUser(users user);

}
