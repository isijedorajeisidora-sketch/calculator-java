package test.java.test;

public class CalculatorTest package test;

import main.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testCalculate() {
        Calculator calc = new Calculator();
        assertEquals(14, calc.calculate("2+3*4"), "2+3*4 treba da bude 14");
        assertEquals(20, calc.calculate("(2+3)*4"), "(2+3)*4 treba da bude 20");
        assertEquals(5.6, calc.calculate("3.5+2.1"), 0.0001, "3.5+2.1 treba da bude 5.6");
        assertEquals(-15, calc.calculate("5*-3"), "5*-3 treba da bude -15");
    }
}{
}
