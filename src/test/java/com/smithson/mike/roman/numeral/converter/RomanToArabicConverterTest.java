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

	@Test
	public void roman_MMM_becomes_3000() {
		assertThat(converter.convert("MMM"), is(3000));
	}

	@Test
	public void roman_M_becomes_1000() {
		assertThat(converter.convert("M"), is(1000));
	}

	@Test
	public void roman_MD_becomes_1500() {
		assertThat(converter.convert("MD"), is(1500));
	}

	@Test
	public void roman_MDCLXVI_becomes_1666() {
		assertThat(converter.convert("MDCLXVI"), is(1666));
	}

	@Test
	public void roman_IV_becomes_4() {
		assertThat(converter.convert("IV"), is(4));
	}

	@Test
	public void roman_CM_becomes_900() {
		assertThat(converter.convert("CM"), is(900));
	}

	@Test
	public void roman_XLV_becomes_45() {
		assertThat(converter.convert("XLV"), is(45));
	}
}
