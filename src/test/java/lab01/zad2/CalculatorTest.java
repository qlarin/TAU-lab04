package lab01.zad2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import lab01.zad2.Calculator;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void testCalculatorAddDouble() {
		assertThat(calculator.add(1.89d, 1.25d), is(closeTo(3.14d, 0.0001)));
	}
	
	@Test
	public void testCalculatorSubDouble() {
		assertThat(calculator.sub(7.77d, 5.63000001d), is(not(closeTo(3.14d, 0.0001))));
	}

	@Test
	public void testCalculatorMultiDouble() {
		assertEquals(3.14d, calculator.multi(2.0d, 1.570001d), 0.0001);
	}
	
	@Test
	public void testCalculatorDivDouble() {
		double[] expecteds = {5.0d};
		double[] actuals = {calculator.div(100.0d, 20.00001d)};
		assertArrayEquals(expecteds, actuals, 0.0001);
	}
	
	@Test
	public void testCalculatorGreaterDouble() {
		assertTrue(calculator.greater(5.01d, 5.001d));
	}
}
