package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
    BMICalculator calculator = new BMICalculator();

    @Test
    void calculateBMI() {
        assertEquals(1, calculator.calculateBMI(100, 10));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateBMI(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateBMI(5, -1));
    }

    @Test
    void classifyBMI() {
        assertEquals("Invalid BMI", calculator.classifyBMI(-1));
        assertEquals("Underweight", calculator.classifyBMI(1));
        assertEquals("Normal weight", calculator.classifyBMI(18.5));
        assertEquals("Overweight", calculator.classifyBMI(24.9));
        assertEquals("Obesity", calculator.classifyBMI(100));
    }
}