package ex10accessmodifier;

import ex10accessmodifier.cal.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.printf("%4d + %4d = %4d%n", 10, 20, cal.addTwoNumber(10, 20));
		System.out.printf("%4d + %4d = %4d%n", 55, 88, cal.addTwoNumber(55, 88));
		System.out.printf("%4d - %4d = %4d%n", 77, 100, cal.subTwoNumer(77, 100));
		
		cal.showOperatingTimes();

	}

}
