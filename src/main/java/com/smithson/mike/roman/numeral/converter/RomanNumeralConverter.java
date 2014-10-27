package com.smithson.mike.roman.numeral.converter;

/**
 * Created by mikesmithson on 10/26/14.
 */
public class RomanNumeralConverter {

    public String convert(Integer integer) {
        StringBuilder result = new StringBuilder();
        if (integer >= 10) {
             result.append("X");
            integer -= 10;
        }

        if (integer >= 5) {
            result.append("V");
            integer -= 5;
        }


        for (int i = 0; i < (integer); i++) {
            result.append("I");
        }
        return result.toString();
    }
}
