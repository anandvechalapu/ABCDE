package com.ABCDE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ABCDE.model.User;
import com.ABCDE.model.Opportunity;
import com.ABCDE.service.UserService;
import com.ABCDE.service.SalesforceService;

@RestController
@RequestMapping("/api")
public class ABCDEController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SalesforceService salesforceService;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/user/{username}/{password}")
	public User findByUsernameAndPassword(@PathVariable String username, @PathVariable String password) {
		return userService.findByUsernameAndPassword(username, password);
	}
	
	@GetMapping("/user/{username}/{email}")
	public User findByUsernameOrEmail(@PathVariable String username, @PathVariable String email) {
		return userService.findByUsernameOrEmail(username, email);
	}
	
	@GetMapping("/user/exists/{username}")
	public Boolean existsByUsername(@PathVariable String username) {
		return userService.existsByUsername(username);
	}
	
	@GetMapping("/user/exists/email/{email}")
	public Boolean existsByEmail(@PathVariable String email) {
		return userService.existsByEmail(email);
	}
	
	@GetMapping("/opportunity/all-open")
	public List<Opportunity> findAllOpenOpportunities() {
		return salesforceService.findAllOpenOpportunities();
	}
	
	@GetMapping("/opportunity/owner/{name}")
	public List<Opportunity> findByOwnerName(@PathVariable String name) {
		return salesforceService.findByOwnerName(name);
	}
	
	@GetMapping("/opportunity/stage/{stage}")
	public List<Opportunity> findByStage(@PathVariable String stage) {
		return salesforceService.findByStage(stage);
	}
	
	@GetMapping("/opportunity/amount/{amount}")
	public List<Opportunity> findByAmount(@PathVariable int amount) {
		return salesforceService.findByAmount(amount);
	}
	
	@GetMapping("/opportunity/closing-date/{date}")
	public List<Opportunity> findByClosingDate(@PathVariable String date) {
		return salesforceService.findByClosingDate(date);
	}
	
	@GetMapping("/opportunity/owner/{name}/stage/{stage}")
	public List<Opportunity> findByOwnerNameAndStage(@PathVariable String name, @PathVariable String stage) {
		return salesforceService.findByOwnerNameAndStage(name, stage);
	}
	
	@GetMapping("/opportunity/owner/{name}/amount/{amount}")
	public List<Opportunity> findByOwnerNameAndAmount(@PathVariable String name, @PathVariable int amount) {
		return salesforceService.findByOwnerNameAndAmount(name, amount);
	}
	
	@GetMapping("/opportunity/owner/{name}/closing-date/{date}")
	public List<Opportunity> findByOwnerNameAndClosingDate(@PathVariable String name, @PathVariable String date) {
	