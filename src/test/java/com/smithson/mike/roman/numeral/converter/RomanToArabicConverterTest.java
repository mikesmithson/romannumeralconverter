package com.smithson.mike.roman.numeral.converter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mikesmithson on 10/27/14.
 */
public class RomanToArabicConverterTest {

    private Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void romanNumeralOneConvertsToArabicOne() {
        assertThat(converter.convert("I"), is(1));
    }

    @Test
    public void romanNumeralTwoConvertsToArabicTwo() {
        assertThat(converter.convert("II"), is(2));
    }

    @Test
    public void romanNumeralThreeConvertsToArabicThree() {
        assertThat(converter.convert("III"), is(3));
    }

    @Test
    public void romanNumeralFiveConvertsToArabicFive() {
        assertThat(converter.convert("V"), is(5));
    }



}
