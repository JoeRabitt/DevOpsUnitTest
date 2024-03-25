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

    @Test
    public void convertToRoman_Numeral5_ReturnsV() {
        assertEquals("V", RomanNumeralConverter.convertToRoman(5));
    }

    @Test
    public void convertToRoman_Numeral9_ReturnsIX() {
        assertEquals("IX", RomanNumeralConverter.convertToRoman(9));
    }

    @Test
    public void convertToRoman_Numeral10_ReturnsX() {
        assertEquals("X", RomanNumeralConverter.convertToRoman(10));
    }

    @Test
    public void convertToRoman_Numeral21_ReturnsXXI() {
        assertEquals("XXI", RomanNumeralConverter.convertToRoman(21));
    }

    @Test
    public void convertToRoman_Numeral50_ReturnsL() {
        assertEquals("L", RomanNumeralConverter.convertToRoman(50));
    }

    @Test
    public void convertToRoman_Numeral100_ReturnsC() {
        assertEquals("C", RomanNumeralConverter.convertToRoman(100));
    }

    @Test
    public void convertToRoman_Numeral500_ReturnsD() {
        assertEquals("D", RomanNumeralConverter.convertToRoman(500));
    }

    @Test
    public void convertToRoman_Numeral1000_ReturnsM() {
        assertEquals("M", RomanNumeralConverter.convertToRoman(1000));
    }
}
