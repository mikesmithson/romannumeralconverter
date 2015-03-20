package com.smithson.mike.roman.numeral.converter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mikesmithson on 10/26/14.
 */
public class Converter {

    private static final Map<Integer, String> ROMAN_NUMERAL_PRIMITIVES = new LinkedHashMap<Integer, String>();
    private static final Map<String, Integer> ARABIC_NUMERAL_PRIMITIVES = new LinkedHashMap<String, Integer>();

    static {
        ROMAN_NUMERAL_PRIMITIVES.put(50, "L");
        ROMAN_NUMERAL_PRIMITIVES.put(40, "XL");
        ROMAN_NUMERAL_PRIMITIVES.put(10, "X");
        ROMAN_NUMERAL_PRIMITIVES.put(9, "IX");
        ROMAN_NUMERAL_PRIMITIVES.put(5, "V");
        ROMAN_NUMERAL_PRIMITIVES.put(4, "IV");
        ROMAN_NUMERAL_PRIMITIVES.put(1, "I");
        ARABIC_NUMERAL_PRIMITIVES.put("V", 5);
    }


    public Integer convert(String romanNumeral) {
        Integer result = 0;
        int length = romanNumeral.length();
        if (ARABIC_NUMERAL_PRIMITIVES.containsKey(romanNumeral)) {
        	result += ARABIC_NUMERAL_PRIMITIVES.get(romanNumeral);
        	length --;
        }
        
        while( length > 0) {
            result += 1;
            length --;
        }
        return result;
    }

    public String convert(Integer arabicNumber) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, String> entries : ROMAN_NUMERAL_PRIMITIVES.entrySet()) {
            while (arabicNumber >= entries.getKey()) {
                result.append(entries.getValue());
                arabicNumber -= entries.getKey();
            }
        }

        return result.toString();
    }
}
