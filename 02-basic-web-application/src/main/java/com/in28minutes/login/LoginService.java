package com.biswaljava.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("biswaljava") && password.equals("dummy");
	}

}