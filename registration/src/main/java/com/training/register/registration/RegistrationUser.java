package com.training.register.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationUser {
	
	@Autowired
	private UserProxy proxy;
	
	@PostMapping("/register")
	public void register(@RequestBody User user) {
		Boolean result=proxy.add(user);
	}

}
