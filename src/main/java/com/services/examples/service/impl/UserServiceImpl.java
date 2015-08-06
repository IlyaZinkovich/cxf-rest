package com.services.examples.service.impl;

import com.services.examples.model.User;
import com.services.examples.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	public User get(String id) {
		return new User("user", 1L);
	}
}