package lab01.zad4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import lab01.zad4.NieudanyPsikusException;
import lab01.zad4.PsikusImpl;

import org.hamcrest.Matchers;
import org.junit.Test;

public class PsikusImplTest {

	PsikusImpl psikus = new PsikusImpl();
	
	@Test
	public void testCyfrokrad() {
		assertThat(psikus.cyfrokrad(8), is(Matchers.nullValue()));
		assertThat(psikus.cyfrokrad(109), Matchers.allOf(
			Matchers.notNullValue(),
			Matchers.anyOf(
				is(Matchers.equalTo(10)),
				is(Matchers.equalTo(19)),
				is(Matchers.equalTo(9))
			)
		));
	}

	@Test
	public void testHultajchochla() {
		Throwable ex = null;
		try {
			assertThat(psikus.hultajchochla(29), is(Matchers.equalTo(92)));
			psikus.hultajchochla(8);
		} catch (NieudanyPsikusException e) {
			ex = e;
		}
		assertThat(ex, instanceOf(NieudanyPsikusException.class));
	}
	
	@Test
	public void testNieksztaltek() {
		assertThat(psikus.nieksztaltek(376), Matchers.anyOf(
			is(Matchers.equalTo(876)),
			is(Matchers.equalTo(316)),
			is(Matchers.equalTo(379))
		));
		assertThat(psikus.nieksztaltek(455), Matchers.equalTo(455));
	}
}
