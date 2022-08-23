package com.tlglearning;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    @Test
    void convertToDecimal() {
        assertEquals(173,Conversion.convertToDecimal("10101101"));
    }

    @ParameterizedTest
    void parse_valid(String representation, int radix, int expected) {


    }
}
