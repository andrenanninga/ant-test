package org.demo;

public class App {
	private Calculator calculator;

	public App() {
		calculator = new Calculator();
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public static void main(String[] args) {
		new App();
	}
}