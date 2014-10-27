package com.smithson.mike.roman.numeral.converter;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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

}
