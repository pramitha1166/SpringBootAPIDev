package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>(); 
	
	private static int idCounter = 3;
	
	static {
		users.add(new User(1, "Kamal", new Date()));
		users.add(new User(2, "Aamal", new Date()));
		users.add(new User(3, "Yamal", new Date()));
	}
	
	public List<User> getAllUsers() {
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==0) {
			user.setId(++idCounter);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
}

