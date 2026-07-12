package com.tdd.tc_num_check.feature.validation.rules;

import com.tdd.tc_num_check.feature.validation.util.CustomStringUtils;

public class R002InputStartsNonZeroCheck {
	
	public static boolean isStartWithNonZero(String str) {
		
		if(CustomStringUtils.isNullOrBlank(str))
			return false;
		
		return str.charAt(0) != '0';
	}
	
}
