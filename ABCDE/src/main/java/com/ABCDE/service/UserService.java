package com.ABCDE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABCDE.model.User;
import com.ABCDE.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	public User findByUsernameOrEmail(String username, String email) {
		return userRepository.findByUsernameOrEmail(username, email);
	}
	
	public Boolean existsByUsername(String username) {
		return userRepository.existsByUsername(username);
	}
	
	public Boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
	}
	
}