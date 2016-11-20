package lab01.zad3;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import lab01.zad3.LiczbaRzymska;

import org.hamcrest.Matchers;
import org.hamcrest.core.AnyOf;
import org.junit.Test;

public class LiczbaRzymskaTest {

	LiczbaRzymska roman1 = new LiczbaRzymska(2130);
	LiczbaRzymska roman2 = new LiczbaRzymska(-20);
	
	@Test
	public void testAnyOfString() {
		@SuppressWarnings("unchecked")
		AnyOf<String> anyOfString = anyOf(
				containsString("M"),
				containsString("C"),
				containsString("D"),
				containsString("L"),
				containsString("X"),
				containsString("V"),
				containsString("I"));
		assertThat(this.roman1.toString(), anyOfString);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalNumber() {
		assertThat(this.roman2.getNumber(), Matchers.lessThanOrEqualTo(0));
		this.roman2.toString();
	}
	
	@Test
	public void testNumberBetween() {
		assertThat(
			this.roman1.getNumber(),
			Matchers.allOf(
				Matchers.lessThanOrEqualTo(2999),
				Matchers.greaterThan(0)
			)
		);
	}
}
