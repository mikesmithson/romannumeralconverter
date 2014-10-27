package com.smithson.mike.roman.numeral.converter;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by mikesmithson on 10/26/14.
 */
public class ArabicToRomanConverterTest {
    private RomanNumeralConverter converter;

    @Before
    public void setUp() {
        converter = new RomanNumeralConverter();
    }


    @Test
    public void testThatCoverterExists() throws Exception {
        assertThat(converter, notNullValue());
    }

    @Test
    public void convertsAnArabicNumeralOneToRomanNumeral() throws Exception {
        assertThat(converter.convert(1), is("I"));
    }

    @Test
    public void convertsAnArabicNumeralThreeToRomanNumeral() throws Exception {
        assertThat(converter.convert(3), is("III"));
    }

    @Test
    @Ignore
    public void convertsAnArabicNumeralFourToRomanNumeral() throws Exception {
        assertThat(converter.convert(4), is("IV"));
    }
    @Test
    public void convertsAnArabicNumeralFiveToRomanNumeral() throws Exception {
        assertThat(converter.convert(5), is("V"));
    }

    @Test
    public void convertsAnArabicNumeralSixToRomanNumeral() throws Exception {
        assertThat(converter.convert(6), is("VI"));
    }

}
