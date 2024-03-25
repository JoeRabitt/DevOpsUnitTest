package com.example.demo.demo;

public class RomanNumeralConverter {

    public static String convertToRoman(int number) {
        String[] romanNumerals = {"IV", "I"};
        int[] values = {4, 1};
        StringBuilder roman = new StringBuilder();
    
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                roman.append(romanNumerals[i]);
            }
        }
        return roman.toString();
    }
    
}
