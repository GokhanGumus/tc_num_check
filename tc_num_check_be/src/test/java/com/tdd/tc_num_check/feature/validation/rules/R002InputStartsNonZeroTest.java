package com.tdd.tc_num_check.feature.validation.rules;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class R002InputStartsNonZeroTest {

	/*
	 * The test returns false if;	
	 *  - input string starts with 0 (No matter what comes next)
	 *  - Input is either null, empty, blank
	 * 
	 * The test returns true if;
	 *  - input starts anything but not 0
	 *  
	 */
	
	// TRIANGULATION FOR POSITIVE MATCHES (TRUE)
 
    @Test
    void shouldReturnTrueWhenSingleDigitIsNonZero() {
        assertTrue(R002InputStartsNonZeroCheck.isStartWithNonZero("5"));
    }

    @Test
    void shouldReturnTrueWhenMultiDigitIsNonZero() {
    	assertTrue(R002InputStartsNonZeroCheck.isStartWithNonZero("123"));
    }
    
    @Test
    void shouldReturnTrueWhenNotANumberIsNonZero() {
    	assertTrue(R002InputStartsNonZeroCheck.isStartWithNonZero("abc"));
    }
    
    // TRIANGULATION FOR NEGATIVE CASES WITH INPUT (FALSE)
    
    @Test
    void shouldReturnFalseWhenSingleDigitIsZero() {
    	assertFalse(R002InputStartsNonZeroCheck.isStartWithNonZero("0"));
    }
    
    @Test
    void shouldReturnFalseWhenMultiDigitIsZero() {
    	assertFalse(R002InputStartsNonZeroCheck.isStartWithNonZero("0123"));
    }
    
    @Test
    void shouldReturnFalseWhenNull() {
    	assertFalse(R002InputStartsNonZeroCheck.isStartWithNonZero(null));
    }
    
    @Test
    void shouldReturnFalseWhenEmpty() {
    	assertFalse(R002InputStartsNonZeroCheck.isStartWithNonZero(""));
    }
    
    @Test
    void shouldReturnFalseWhenBlank() {
    	assertFalse(R002InputStartsNonZeroCheck.isStartWithNonZero("    "));
    }
    
}
