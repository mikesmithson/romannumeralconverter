package com.smithson.mike.roman.numeral.converter;

/**
 * Created by mikesmithson on 10/26/14.
 */
public class RomanNumeralConverter {

    public String convert(Integer integer) {
        StringBuilder result = new StringBuilder();
        while (integer >= 10) {
             result.append("X");
            integer -= 10;
        }

        if (integer >= 9) {
            result.append("IX");
            integer -= 9;
        }

        if (integer >= 5) {
            result.append("V");
            integer -= 5;
        }

        if (integer >= 4) {
            result.append("IV");
            integer -= 4;
        }

        while (integer >= 1) {
            result.append("I");
            integer -= 1;
        }
        return result.toString();
    }
}
