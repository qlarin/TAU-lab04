package lab04.zad1;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CalculatorSteps {

    private Calculator calculator;
    private Throwable throwable = null;

    @Given("a calculator")
    public void setCalculator() {
        calculator = new Calculator();
    }

    @When("set arguments to $l and $r")
    public void setArguments(int l, int r) {
        calculator.setLeft(l);
        calculator.setRight(r);
    }

    @Then("adding should return $result")
    public void testCalculatorAdd(int result) {
        calculator.add();
        assertEquals(result, (int) calculator.getResult());
    }

    @Then("subtracting should return $result")
    public void testCalculatorSub(int result) {
        calculator.sub();
        assertEquals(result, (int) calculator.getResult());
    }

    @Then("multiplication should return $result")
    public void testCalculatorMulti(int result) {
        calculator.multi();
        assertEquals(result, (int) calculator.getResult());
    }

    @Then("division should return $result")
    public void testCalculatorDiv(int result) {
        calculator.div();
        assertEquals(result, (int) calculator.getResult());
    }

    @Then("condition greater should return $result")
    public void testCalculatorGreater(boolean result) {
        calculator.greater();
        assertEquals(result, (Boolean) calculator.getResult());
    }

    @When("$left division by 0")
    public void testCalculatorDivisionByZero(int l) {
        try {
            calculator.setLeft(l);
            calculator.setRight(0);
            calculator.div();
        } catch (ArithmeticException e) {
            throwable = e;
        }
    }

    @Then("an exception is thrown")
    public void exceptionThrown() {
        assertThat(throwable, instanceOf(ArithmeticException.class));
    }
}
