package com.example.jeep.s05.ex;

import java.util.Arrays;

public class MoodChecker {
	private static final String [] MOODS = {"default", "hopeful", "active", "sleepy", "happy"};
	private static final MoodChecker instance = new MoodChecker();
	
	private MoodChecker() {
		
	}
	
	public static MoodChecker getInstance() {
		return instance;
	}

	public String checked(String mood) {
		
		if(Arrays.stream(MOODS).anyMatch(s -> s.equals(mood))) {
			return mood;
		}
		
//		for(int i=0 ; i<MOODS.length ;i++) {
//			if(mood.equals(MOODS[i])) {
//				return mood;
//			}
//		}
		
		return MOODS[0];
	}
}
