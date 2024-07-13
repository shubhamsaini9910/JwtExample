package com.jwt.example.UserService;


import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.jwt.example.entity.User;

@Service
public class UserService {
	
	private List<User> store = new ArrayList<>();


	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Shubham Saini","Shubham@gmail.com "));
		store.add(new User(UUID.randomUUID().toString(),"Manan Saini","Manan@gmail.com "));
		store.add(new User(UUID.randomUUID().toString(),"Mukesh Saini","Mukesh@gmail.com "));
		store.add(new User(UUID.randomUUID().toString(),"panda","Panda@gmail.com "));
	}


	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return this.store;
	}


}
