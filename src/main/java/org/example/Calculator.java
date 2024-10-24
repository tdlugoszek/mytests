package org.example;

public class Calculator {
    public float add (float number1, float number2) {
        return number1 + number2;
    }

    public float deduct (float number1, float number2) {
        return number1 - number2;
    }

    public float divide (float number1, float number2) {
        if (number2 == 0) throw new ArithmeticException("/ by zero");
        return number1 / number2;
    }
}
