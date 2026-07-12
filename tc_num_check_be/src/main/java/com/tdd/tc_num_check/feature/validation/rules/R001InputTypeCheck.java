package com.tdd.tc_num_check.feature.validation.rules;

public class R001InputTypeCheck {
	
	public static boolean isAllNumber(String str) {
		// Handle null or empty scenarios
        if (str == null || str.isEmpty()) {
            return false;
        }
                        
        return str.chars().allMatch(Character::isDigit);
	}
	
}
