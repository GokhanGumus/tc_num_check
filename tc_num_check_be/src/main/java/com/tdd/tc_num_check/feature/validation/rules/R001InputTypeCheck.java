package com.tdd.tc_num_check.feature.validation.rules;

import com.tdd.tc_num_check.feature.validation.util.CustomStringUtils;

public class R001InputTypeCheck {
	
	public static boolean isAllNumber(String str) {
		// Handle null or empty scenarios
        if (CustomStringUtils.isNullOrBlank(str)) {
            return false;
        }
                        
        return str.chars().allMatch(Character::isDigit);
	}
	
}
