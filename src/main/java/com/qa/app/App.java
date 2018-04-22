package com.qa.app;

import com.qa.adder.Adder;
import com.qa.adder.Calculator;
import com.qa.adder.IAdder;

public class App {

	public static void main(String[] args) {
		IAdder adder = new Adder();
		Calculator calc = new Calculator(adder);
		int randomNumberPlusValue = calc.getRandomNumberAndAddOwnNumber(1);
		System.out.println("This is the value of randomNumberPlusValue " + randomNumberPlusValue);
	}

}
