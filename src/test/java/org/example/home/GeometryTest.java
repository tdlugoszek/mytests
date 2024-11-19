package org.example.home;

import org.example.school.NegativeUnitException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {
    Geometry geometry = new Geometry();

    @Test
    void areaOfaRectangle() {
        assertEquals(4, geometry.areaOfaRectangle(2, 2));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaRectangle(1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaRectangle(-1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaRectangle(-1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaRectangle(0, 0));
    }

    @Test
    void perimeterOfaRectangle() {
        assertEquals(4, geometry.perimeterOfaRectangle(1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaRectangle(1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaRectangle(-1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaRectangle(-1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaRectangle(0, 0));
    }

    @Test
    void areaOfaTriangle() {
        assertEquals(2, geometry.areaOfaTriangle(2, 2));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaTriangle(1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaTriangle(-1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaTriangle(-1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaTriangle(0, 0));
    }

    @Test
    void perimeterOfaTriangle() {
        assertEquals(6, geometry.perimeterOfaTriangle(2, 2, 2));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTriangle(1, 1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTriangle(1, -1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTriangle(-1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTriangle(0, 0, 0));
    }

    @Test
    void areaOfaCircle() {
        assertEquals(Math.PI, geometry.areaOfaCircle(1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaCircle(-1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaCircle(0));
    }

    @Test
    void perimeterOfaCircle() {
        assertEquals(2*Math.PI, geometry.perimeterOfaCircle(1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaCircle(-1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaCircle(0));
    }

    @Test
    void areaOfaTrapeze() {
        assertEquals(2, geometry.areaOfaTrapeze(2, 2, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaTrapeze(1, 1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaTrapeze(1, -1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaTrapeze(-1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaTrapeze(0, 0, 0));
    }

    @Test
    void perimeterOfaTrapeze() {
        assertEquals(8, geometry.perimeterOfaTrapeze(2, 2, 2, 2));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTrapeze(1, 1, 1, -1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTrapeze(1, 1, -1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTrapeze(1, -1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTrapeze(-1, 1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaTrapeze(0, 0, 0, 0));

    }

    @Test
    void areaOfaSquare() {
        assertEquals(4, geometry.areaOfaSquare(2));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaSquare(-1));
        assertThrows(IllegalArgumentException.class, () -> geometry.areaOfaSquare(0));
    }

    @Test
    void perimeterOfaSquare() {
        assertEquals(4, geometry.perimeterOfaSquare(1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaSquare(-1));
        assertThrows(IllegalArgumentException.class, () -> geometry.perimeterOfaSquare(0));
    }
}