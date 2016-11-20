package lab01.zad1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import lab01.zad1.Calculator;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void testCalculatorAdd() {
		assertThat(calculator.add(3, 2), is(equalTo(5)));
	}
	
	@Test
	public void testCalculatorSub() {
		assertThat(calculator.sub(9, 1), is(not(equalTo(10))));
	}
	
	@Test
	public void testCalculatorMulti() {
		int result = calculator.multi(10, 1);
		assertNotNull(result);
		assertSame(10, result);
	}

	@Test
	public void testCalculatorDiv() {
		int result = calculator.div(15, 3);
		assertNotEquals(15, result);
	}
	
	@Test
	public void testCalculatorGreater() {
		assertFalse(calculator.greater(10, 15));
		assertTrue(calculator.greater(10, 5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testCalculatorDivisionByZero() {
		calculator.div(10, 0);
	}

}
