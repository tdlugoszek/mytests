package org.example.school;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator  = new Calculator();


    @Test
    void add() {
        Assertions.assertEquals(2, calculator.add(1,1));
        Assertions.assertEquals(0, calculator.add(2,-2));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(0, calculator.subtract(1,1));
        Assertions.assertEquals(-10, calculator.subtract(-5,5));
    }

    @Test
    void devide() {
        Assertions.assertEquals(2, calculator.divide(4,2));
        Assertions.assertEquals(-3, calculator.divide(9,-3));

        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }


    @Test
    void multiply() {
        Assertions.assertEquals(10, calculator.multiply(2,5));
        Assertions.assertEquals(-25, calculator.multiply(-5,5));
    }

    @Test
    void modulus() {
        Assertions.assertEquals(2, calculator.modulus(10,4));
        Assertions.assertEquals(0, calculator.modulus(10,5));
    }


    @Test
    void power() {
        Assertions.assertEquals(25, calculator.power(5,2));
        Assertions.assertEquals(1, calculator.power(2,0));
    }
}