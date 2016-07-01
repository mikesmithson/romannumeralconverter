package com.smithson.mike.roman.numeral.converter;

<<<<<<< HEAD:src/test/java/com/smithson/mike/roman/numeral/converter/ArabicToRomanNumeralConverterTest.java
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by mikesmithson on 10/26/14.
 */
public class ArabicToRomanNumeralConverterTest {
    private RomanNumeralConverter converter;
=======
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by mikesmithson on 10/26/14.
 */
public class ArabicToRomanConverterTest {
    private Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }
>>>>>>> b08bca1ddbf5397c9ff96bf03f73cecc612ec357:src/test/java/com/smithson/mike/roman/numeral/converter/ArabicToRomanConverterTest.java


    @Test
    public void testThatCoverterExists() throws Exception {
<<<<<<< HEAD:src/test/java/com/smithson/mike/roman/numeral/converter/ArabicToRomanNumeralConverterTest.java
          Assertions.assertThat(converter).isNotNull();
=======
        assertThat(converter, notNullValue());
    }

    @Test
    public void convertsAnArabicNumeralOneToRomanNumeral() throws Exception {
        assertThat(converter.convert(1), is("I"));
    }

    @Test
    public void convertsAnArabicNumeralTwoToRomanNumeral() throws Exception {
        assertThat(converter.convert(2), is("II"));
    }

    @Test
    public void convertsAnArabicNumeralThreeToRomanNumeral() throws Exception {
        assertThat(converter.convert(3), is("III"));
    }

    @Test
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

    @Test
    public void convertsAnArabicNumeralSevenToRomanNumeral() throws Exception {
        assertThat(converter.convert(7), is("VII"));
>>>>>>> b08bca1ddbf5397c9ff96bf03f73cecc612ec357:src/test/java/com/smithson/mike/roman/numeral/converter/ArabicToRomanConverterTest.java
    }

    @Test
    public void convertsAnArabicNumeralEightToRomanNumeral() throws Exception {
        assertThat(converter.convert(8), is("VIII"));
    }

    @Test
    public void convertsAnArabicNumeralNineToRomanNumeral() throws Exception {
        assertThat(converter.convert(9), is("IX"));
    }

    @Test
    public void convertsAnArabicNumeralTenToRomanNumeral() throws Exception {
        assertThat(converter.convert(10), is("X"));
    }

    @Test
    public void convertsAnArabicNumeralTwentyToRomanNumeral() throws Exception {
        assertThat(converter.convert(20), is("XX"));
    }

    @Test
    public void convertsAnArabicNumeralFortyToRomanNumeral() throws Exception {
        assertThat(converter.convert(40), is("XL"));
    }

    @Test
    public void convertsAnArabicNumeralFiftyToRomanNumeral() throws Exception {
        assertThat(converter.convert(50), is("L"));
    }
}
