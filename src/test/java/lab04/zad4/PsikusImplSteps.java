package lab04.zad4;

import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class PsikusImplSteps {

	PsikusImpl psikus;
	private Throwable throwable = null;

	@Given("a psikus instance")
	public void setPsikusImpl() {
		psikus = new PsikusImpl();
	}

	@When("set argument $value to cyfrokrad")
	public void settingNumberToCryfrokrad(int value) {
		psikus.cyfrokrad(value);
	}

	@Then("result is equal to null")
	public void testCyfrokradDigit() {
		assertThat(psikus.getResult(), is(Matchers.nullValue()));
	}

	@Then("result is not null and any of $f, $s, $t")
	public void testCyfrokrad(int f, int s, int t) {
		assertThat(psikus.getResult(), Matchers.allOf(
				Matchers.notNullValue(),
				Matchers.anyOf(
						is(Matchers.equalTo(f)),
						is(Matchers.equalTo(s)),
						is(Matchers.equalTo(t))
				)
		));
	}

	@When("set argument $value to hultajchochla")
	public void settingNumberToHultajchochla(int value) {
		try {
			psikus.hultajchochla(value);
		}  catch (NieudanyPsikusException e) {
			throwable = e;
		}
	}

	@Then("result is reversed and equal to $value")
	public void testReversedHultajchochla(int value) {
		assertThat(psikus.getResult(), is(Matchers.equalTo(value)));
	}

	@Then("an nieudany psikus exception is thrown")
	public void testNieudanyPsikusException() {
		assertThat(throwable, instanceOf(NieudanyPsikusException.class));
	}

	@When("set argument $value to nieksztaltek")
	public void settingNumberToNieksztaltek(int value) {
		psikus.nieksztaltek(value);
	}

	@Then("result is same as an argument and equal to $value")
	public void testEqualResultNieksztaltek(int value) {
		assertThat(psikus.getResult(), Matchers.equalTo(value));
	}

	@Then("result is equal to any of $f, $s, $t")
	public void testDistortionInNieksztaltek(int f, int s, int t) {
		assertThat(psikus.getResult(), Matchers.anyOf(
				is(Matchers.equalTo(f)),
				is(Matchers.equalTo(s)),
				is(Matchers.equalTo(t))
		));
	}
}
