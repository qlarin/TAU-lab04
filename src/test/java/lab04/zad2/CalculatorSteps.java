package lab04.zad2;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    private static final double delta = 0.00001d;
    private Calculator calculator;

    @Given("a calculator")
    public void setCalculator() {
        calculator = new Calculator();
    }

    @When("set arguments to $l and $r")
    public void setArguments(double l, double r) {
        calculator.setLeft(l);
        calculator.setRight(r);
    }

    @Then("adding should return $result")
    public void testCalculatorAdd(double result) {
        calculator.add();
        assertEquals(result, (double) calculator.getResult(), delta);
    }

    @Then("subtracting should return $result")
    public void testCalculatorSub(double result) {
        calculator.sub();
        assertEquals(result, (double) calculator.getResult(), delta);
    }

    @Then("multiplication should return $result")
    public void testCalculatorMulti(double result) {
        calculator.multi();
        assertEquals(result, (double) calculator.getResult(), delta);
    }

    @Then("division should return $result")
    public void testCalculatorDiv(double result) {
        calculator.div();
        assertEquals(result, (double) calculator.getResult(), delta);
    }

    @Then("condition greater should return $result")
    public void testCalculatorGreater(boolean result) {
        calculator.greater();
        assertEquals(result, (Boolean) calculator.getResult());
    }

    @When("$left division by 0")
    public void testCalculatorDivisionByZero(double l) {
        calculator.setLeft(l);
        calculator.setRight(0);
        calculator.div();
    }

    @Then("an infinity is acquired")
    public void infinityAcquired() {
        assertEquals((double) calculator.getResult(), Double.POSITIVE_INFINITY, delta);
    }
}
