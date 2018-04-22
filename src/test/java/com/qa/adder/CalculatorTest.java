package com.qa.adder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

	private IAdder adder = new Adder();
	private Calculator calc = new Calculator(adder);

	@Test
	public void test() {
		int expectedValue = 50;
		int actualValue = calc.getRandomNumberAndAddOwnNumber(1);
		Assert.assertEquals(expectedValue, actualValue);
	}

	// @InjectMocks
	// private Calculator calc;
	//
	// @Mock
	// private Adder adder;
	//
	// @Test
	// public void randomNumberPlusNumberGivenTest() {
	// Mockito.when(adder.randomNumberAdder(1)).thenReturn(51);
	// int expectedValue = 51;
	// int actualValue = calc.getRandomNumberAndAddOwnNumber(1);
	// Assert.assertEquals(expectedValue, actualValue);
	//
	// }

}
