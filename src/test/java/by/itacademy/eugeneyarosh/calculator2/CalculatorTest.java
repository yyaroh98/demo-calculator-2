package by.itacademy.eugeneyarosh.calculator2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void sum1() {
        Calculator calculator = new Calculator();

        double actual = calculator.sum(1.3, 2.3);
        Assertions.assertEquals(3.6, actual, 0.001);
    }
}
