package com.tdd.tc_num_check.feature.validation.util;

public class CustomStringUtils {

	public static boolean isNullOrBlank(String str) {
		if(str == null || str.isBlank())
			return true;
		return false;
	}
	
	
}
