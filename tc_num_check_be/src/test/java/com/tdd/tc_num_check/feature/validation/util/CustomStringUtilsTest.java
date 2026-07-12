package com.tdd.tc_num_check.feature.validation.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class CustomStringUtilsTest {

	// TRUE tests
	@Test
	void shouldReturnTrueWhenStringIsNull() {
        assertTrue(CustomStringUtils.isNullOrBlank(null));
    }
	
	@Test
	void shouldReturnTrueWhenStringIsEmpty() {
        assertTrue(CustomStringUtils.isNullOrBlank(""));
    }
	
	@Test
	void shouldReturnTrueWhenStringHasJustSpace() {
        assertTrue(CustomStringUtils.isNullOrBlank("    "));
    }

	// FALSE test
	
	@Test
	void shouldReturnFalseWhenStringHasNumber() {
        assertFalse(CustomStringUtils.isNullOrBlank("123"));
    }
}
