package org.demo;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals((double) 10, calculator.add(3, 7), 0.1);
	}

	@Test
	public void testSubtract() {
		assertEquals((double) 10, calculator.subtract(13, 3), 0.1);
	}

	@Test
	public void testMultiply() {
		assertEquals((double) 10, calculator.multiply(2, 5), 0.1);
	}

	@Test
	public void testDivide() {
		assertEquals((double) 10, calculator.divide(20, 2), 0.1);
	}
}