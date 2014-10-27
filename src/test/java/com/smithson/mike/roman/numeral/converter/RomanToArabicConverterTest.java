package com.smithson.mike.roman.numeral.converter;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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

}
