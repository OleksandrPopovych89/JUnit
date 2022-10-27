package org.example.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {

    @Test
    void getSquare() {
        assertEquals(1250, new Trapezoid(20, 30, 50).getSquare());
    }
}