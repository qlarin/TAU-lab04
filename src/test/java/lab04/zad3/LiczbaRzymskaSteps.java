package lab04.zad3;

import org.hamcrest.Matchers;
import org.hamcrest.core.AnyOf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LiczbaRzymskaSteps {

	LiczbaRzymska roman1;
	LiczbaRzymska roman2;
	private Throwable throwable = null;

	@Given("a two roman numbers: $first and $second")
	public void setRomanNumbers(int first, int second) {
		roman1 = new LiczbaRzymska(first);
		roman2 = new LiczbaRzymska(second);
	}

	@When("number is less than 0")
	public void testIllegalNumber() {
		try {
			assertThat(this.roman2.getNumber(), Matchers.lessThanOrEqualTo(0));
			this.roman2.toString();
		} catch (IllegalArgumentException e) {
			throwable = e;
		}
	}

	@Then("an illegal argument exception is thrown")
	public void illegalArgumentExceptionThrown() {
		assertThat(throwable, instanceOf(IllegalArgumentException.class));
	}

	@When("number is greater than 0 and less than $value")
	public void testNumberBetween(int value) {
		assertThat(
				this.roman1.getNumber(),
				Matchers.allOf(
						Matchers.lessThanOrEqualTo(value),
						Matchers.greaterThan(0)
				)
		);
	}

	@Then("can be written as roman")
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
}
