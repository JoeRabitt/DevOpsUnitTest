package com.example.demo.demo;

public class RomanNumeralConverter {

    public static String convertToRoman(int number) {
        String[] romanNumerals = {"I", "IV"};
        int[] values = {1, 4};
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
