package org.example;

public class UnitConverter {
    private void validateInput(double value) {
        if (value < 0) {
            throw new NegativeUnitException("Negative values are not allowed: " + value);
        }
    }

    public double kilogramToPound(double kg) {
        validateInput(kg);
        return kg * 2.205;
    }

    public double mileToKilometer(double miles) {
        validateInput(miles);
        return miles * 1.609;
    }

    public double literToGallon(double liters) {
        validateInput(liters);
        return liters * 0.264;
    }

    public double inchToCentimeter(double inches) {
        validateInput(inches);
        return inches * 2.54;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
