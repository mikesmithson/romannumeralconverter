package com.smithson.mike.roman.numeral.converter;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by mikesmithson on 10/26/14.
 */
public class ArabicToRomanConverterTest {
    private RomanNumeralConverter converter;


    @Test
    public void testThatCoverterExists() throws Exception {
          assertThat(converter, notNullValue());
    }

}
