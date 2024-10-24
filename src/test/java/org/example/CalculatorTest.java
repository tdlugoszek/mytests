package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator  = new Calculator();
    @Test
    void add() {
        Assertions.assertEquals(2, calculator.add(1,1));
    }

    @Test
    void deduct() {
        Assertions.assertEquals(0, calculator.deduct(1,1));
    }

    @Test
    void devide() {
        Assertions.assertEquals(1, calculator.divide(1,1));
    }

    @Test
    void devideThrowsTextMethod() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }
    @Test
    void multiply() {
        Assertions.assertEquals(10, calculator.multiply(2,5));
    }

    @Test
    void modulus() {
        Assertions.assertEquals(2, calculator.modulus(10,4));
    }


    @Test
    void power() {
        Assertions.assertEquals(25, calculator.power(5,2));
    }
}