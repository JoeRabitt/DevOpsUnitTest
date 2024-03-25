package com.example.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    @Test
    public void convertToRoman_Numeral1_ReturnsI() {
        assertEquals("I", RomanNumeralConverter.convertToRoman(1));
    }

    @Test
    public void convertToRoman_Numeral2_ReturnsII() {
        assertEquals("II", RomanNumeralConverter.convertToRoman(2));
    }

    @Test
    public void convertToRoman_Numeral3_ReturnsIII() {
        assertEquals("III", RomanNumeralConverter.convertToRoman(3));
    }

    @Test
    public void convertToRoman_Numeral4_ReturnsIV() {
        assertEquals("IV", RomanNumeralConverter.convertToRoman(4));
    }
 
}
