package lab01;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   lab01.zad1.CalculatorTest.class,
   lab01.zad2.CalculatorTest.class,
   lab01.zad3.LiczbaRzymskaTest.class,
   lab01.zad4.PsikusImplTest.class
})

public class TestSuite {

}
