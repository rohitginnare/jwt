package com.jwt.example.JwtExample3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.JwtExample3.modal.User;

@Service
public class UserService {
	private List<User> store = new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Durgesh", "Durgest@xyz.in"));
		store.add(new User(UUID.randomUUID().toString(), "Harsh", "Harsh@xyz.in"));
		store.add(new User(UUID.randomUUID().toString(), "Ankit", "Ankit@xyz.in"));
		store.add(new User(UUID.randomUUID().toString(), "Durgesh1", "Durgest1@xyz.in"));
	}

	public List<User> getUsers() {
		return this.store;

	}
}
