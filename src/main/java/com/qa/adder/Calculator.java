package com.qa.adder;

public class Calculator {
	private IAdder adderable;

	public Calculator(IAdder adderable) {
		this.adderable = adderable;
	}

	public int getRandomNumberAndAddOwnNumber(int numberToAdd) {
		return adderable.randomNumberAdder(numberToAdd);
	}
}
