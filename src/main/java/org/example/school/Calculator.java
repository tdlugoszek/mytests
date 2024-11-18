package org.example.school;

//Zaimplementuj prosty kalkulator, który potrafi:
//        * dodawać,
//        * odejmować,
//        * mnożyć,
//        * dzielić,
//        * wykonywać dwie operacje zaproponowane przez Ciebie
//na dwóch liczbach rzeczywistych.
//Napisz testy jednostkowe, aby sprawdzić poprawność operacji matematycznych.

public class Calculator {
    public float add (float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float divide (float a, float b) {
        if (b == 0) throw new ArithmeticException("/ by zero");
        return a / b;
    }

    public float multiply (float a, float b) {
        return a * b;
    }

    public float modulus(int a, int b) {
        return a % b;
    }

    public float power(double base, double exponent) {
        return (float) Math.pow(base, exponent);
    }
}
