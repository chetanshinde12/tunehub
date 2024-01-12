package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.users;
import com.example.demo.repository.UsersRepository;
@Service
public class UserServiceImplimentation implements UsersService {

	@Autowired
	UsersRepository repo;
	@Override
	public String addUser(users user) {
		// TODO Auto-generated method stub
		repo.save(user);
		return "user added successfully";
	}
	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email)==null) {
			return false;
		}
		else {
			return true;
		}
		
		
			}
	@Override
	public boolean validateUser(String email, String password) {
		users  user = repo.findByEmail(email);
		String db_pass = user.getPassword();
		if(password.equals(db_pass)) {
			return true;
		}
		else {
			return false;
		}
	

}
	@Override
	public String getRole(String email) {
		users user= repo.findByEmail(email);
		return user.getRole();
		
	}
	@Override
	public users getUser(String email) {
		return  repo.findByEmail(email);
	}
	@Override
	public void updateUser(users user) {
		repo.save(user);
		
		
		
	}
}