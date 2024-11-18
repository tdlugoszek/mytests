package org.example.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UnitConverterTest {
    UnitConverter converter = new UnitConverter();

    @Test
    void kilogramToPound() {
        assertEquals(22.05, converter.kilogramToPound(10));
        assertEquals(0, converter.kilogramToPound(0));
        assertThrows(NegativeUnitException.class, () -> converter.kilogramToPound(-1));
    }

    @Test
    void mileToKilometer() {
        assertEquals(16.09, converter.mileToKilometer(10));
        assertEquals(0, converter.mileToKilometer(0));
        assertThrows(NegativeUnitException.class, () -> converter.mileToKilometer(-1));
    }

    @Test
    void literToGallon() {
        assertEquals(2.64, converter.literToGallon(10));
        assertEquals(0, converter.literToGallon(0));
        assertThrows(NegativeUnitException.class, () -> converter.literToGallon(-1));
    }

    @Test
    void inchToCentimeter() {
        assertEquals(25.4, converter.inchToCentimeter(10));
        assertEquals(0, converter.inchToCentimeter(0));
        assertThrows(NegativeUnitException.class, () -> converter.inchToCentimeter(-1));
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32));
        assertEquals(100, converter.fahrenheitToCelsius(212));
    }
}