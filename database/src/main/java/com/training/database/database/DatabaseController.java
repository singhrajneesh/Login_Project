package com.training.database.database;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public Boolean add(@RequestBody User user) {
		Optional<User> option = userRepository.findByUsername(user.getUsername());

		if(option.isPresent())
			{
				return false;
			} 
		
		
		userRepository.save(user);
		return true;
	}
	
	@PostMapping("/verify-user")
	public Boolean verifyUser(@RequestBody User user) {
		Optional<User> option = userRepository.findById(user.getUsername());

		if(option.isPresent()) {
			if(option.get().getPassword().equals(user.getPassword())) {
				return true;
			} 
		}
		return false;
	}

}
