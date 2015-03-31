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
		ARABIC_NUMERAL_PRIMITIVES.put("I", 1);
		ARABIC_NUMERAL_PRIMITIVES.put("M", 1000);
		ARABIC_NUMERAL_PRIMITIVES.put("D", 500);
		ARABIC_NUMERAL_PRIMITIVES.put("C", 100);
		ARABIC_NUMERAL_PRIMITIVES.put("L", 50);
		ARABIC_NUMERAL_PRIMITIVES.put("X", 10);
		ARABIC_NUMERAL_PRIMITIVES.put("V", 5);
		ARABIC_NUMERAL_PRIMITIVES.put("I", 1);
		ARABIC_NUMERAL_PRIMITIVES.put("O", 0);

	}

	public int convert(String romanNumerals) {

		int result = 0;

		char[] romanNumeralCharacters = romanNumerals.toCharArray();

		char romanNumeralCharacterAhead = 'O';
		char currentRomanNumeral;

		for (int i = 0; i < romanNumeralCharacters.length; i++) {
			currentRomanNumeral = romanNumeralCharacters[i];
			if (i < romanNumeralCharacters.length - 1) {
				romanNumeralCharacterAhead = romanNumeralCharacters[i + 1];
			}
			if(ARABIC_NUMERAL_PRIMITIVES.get(convertCharacterToString(romanNumeralCharacterAhead)) > ARABIC_NUMERAL_PRIMITIVES.get(convertCharacterToString(currentRomanNumeral))) {
				result += ARABIC_NUMERAL_PRIMITIVES.get(convertCharacterToString(romanNumeralCharacterAhead)) 
						- ARABIC_NUMERAL_PRIMITIVES.get(convertCharacterToString(currentRomanNumeral));
				i++;
				romanNumeralCharacterAhead = 'O';
			} else {
				result += ARABIC_NUMERAL_PRIMITIVES.get(convertCharacterToString(currentRomanNumeral));	
			}
		}
		return result;
	}

	private String convertCharacterToString(char romanNumeralCharacterAhead) {
		return new StringBuilder().append(romanNumeralCharacterAhead).toString();
	}

	public String convert(Integer arabicNumber) {
		StringBuilder result = new StringBuilder();
		for (Map.Entry<Integer, String> entries : ROMAN_NUMERAL_PRIMITIVES
				.entrySet()) {
			while (arabicNumber >= entries.getKey()) {
				result.append(entries.getValue());
				arabicNumber -= entries.getKey();
			}
		}

		return result.toString();
	}
}
