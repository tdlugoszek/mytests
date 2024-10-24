package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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





//        Assertions.assertEquals(1, calculator.divide(1,0));
    }








}