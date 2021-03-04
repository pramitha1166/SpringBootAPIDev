package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserDaoService service;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}
	
	@PostMapping("/users")
	public User addNewUser(@RequestBody User user) {
		return service.save(user);
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return service.findOne(id);
	}
}
