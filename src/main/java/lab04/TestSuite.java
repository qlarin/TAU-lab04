package lab04;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   lab04.zad1.CalculatorTest.class,
   lab04.zad2.CalculatorTest.class,
   lab04.zad3.LiczbaRzymskaTest.class,
   lab04.zad4.PsikusImplTest.class
})

public class TestSuite {

}
