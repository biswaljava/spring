package com.biswaljava.springmvc.web.util;

import java.io.Serializable;
import java.util.Locale;

import com.biswaljava.domain.User;


public class SessionData implements Serializable {

	public SessionData() {
		super();
	}

	private User user;

	private Locale locale;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
