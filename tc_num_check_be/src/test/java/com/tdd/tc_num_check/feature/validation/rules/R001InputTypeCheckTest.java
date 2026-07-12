package com.tdd.tc_num_check.feature.validation.rules;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class R001InputTypeCheckTest {

    // TRIANGULATION FOR POSITIVE MATCHES (TRUE)
 
    @Test
    void shouldReturnTrueWhenInputIsSingleDigit() {
        assertTrue(R001InputTypeCheck.isAllNumber("5"));
    }

    @Test
    void shouldReturnTrueWhenInputIsMultipleDigits() {
        // Triangulates against a hardcoded single digit length
        assertTrue(R001InputTypeCheck.isAllNumber("12345"));
    }

    // TRIANGULATION FOR NON-NUMERIC CHARACTERS (FALSE)
 
    @Test
    void shouldReturnFalseWhenInputContainsLetterAtStart() {
        assertFalse(R001InputTypeCheck.isAllNumber("a123"));
    }

    @Test
    void shouldReturnFalseWhenInputContainsLetterInMiddle() {
        assertFalse(R001InputTypeCheck.isAllNumber("12a34"));
    }

    @Test
    void shouldReturnFalseWhenInputContainsLetterAtEnd() {
        assertFalse(R001InputTypeCheck.isAllNumber("123a"));
    }
    
    @Test
    void shouldReturnFalseWhenInputIsNull() {
        assertFalse(R001InputTypeCheck.isAllNumber(null));
    }
    
    // TRIANGULATION FOR WHITESPACE (FALSE)
 
    @Test
    void shouldReturnFalseWhenInputHasLeadingWhitespace() {
        assertFalse(R001InputTypeCheck.isAllNumber(" 123"));
    }

    @Test
    void shouldReturnFalseWhenInputHasTrailingWhitespace() {
        // Triangulates against regex patterns that forget structural anchors
        assertFalse(R001InputTypeCheck.isAllNumber("123 "));
    }

    // TRIANGULATION FOR EMPTY STATE (FALSE)
 
    @Test
    void shouldReturnFalseWhenInputIsEmpty() {
        assertFalse(R001InputTypeCheck.isAllNumber(""));
    }
	
}
