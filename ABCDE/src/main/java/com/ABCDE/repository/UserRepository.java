package com.ABCDE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ABCDE.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
 
	User findByUsernameAndPassword(String username, String password);
	User findByUsernameOrEmail(String username, String email);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);
}