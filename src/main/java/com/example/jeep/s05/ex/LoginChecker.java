package com.example.jeep.s05.ex;

import java.util.Arrays;

public class LoginChecker {
	private static final String [] MOODS = {"default", "hopeful", "active", "sleepy", "happy"};
	private static final LoginChecker instance = new LoginChecker();
	
	private LoginChecker() {
		
	}
	
	public static LoginChecker getInstance() {
		return instance;
	}

	public boolean checked(String username, String password) {
		return ("ALtoz".equals(username) && "pazzword".equals(password));
	}
}
