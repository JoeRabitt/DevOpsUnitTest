package com.example.demo.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralConverterTest {

    @Test
    public void convertToRoman_Numeral1_ReturnsI() {
        assertEquals("I", RomanNumeralConverter.convertToRoman(1));
    }

}
