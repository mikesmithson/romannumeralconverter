package com.smithson.mike.roman.numeral.converter;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by mikesmithson on 10/26/14.
 */
public class ArabicToRomanNumeralConverterTest {
    private RomanNumeralConverter converter;


    @Test
    public void testThatCoverterExists() throws Exception {
          Assertions.assertThat(converter).isNotNull();
    }

}
