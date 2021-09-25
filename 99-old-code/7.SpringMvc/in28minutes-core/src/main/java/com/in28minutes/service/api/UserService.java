package com.biswaljava.service.api;

import com.biswaljava.domain.User;


public interface UserService {

	
	User getUserByEmail(final String email);

	
	boolean isValidUser(final String email, final String password);

	
	User create(final User user);

	
	User update(User user);

	
	void remove(final User user);
}
