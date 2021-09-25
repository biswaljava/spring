package com.biswaljava.data.api;

import com.biswaljava.domain.User;


public interface UserDataService {

	
	User getUserByEmail(final String email);

	
	boolean login(final String email, final String password);

	
	User create(final User user);

	
	User update(User user);

	
	void remove(final User user);

}
