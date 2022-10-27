package org.example.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getSquare() {
        assertEquals(100, new Triangle(10, 20).getSquare());
    }
}