package org.example.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getSquare() {
        assertEquals(200, new Rectangle(20, 10).getSquare());
        assertEquals(200, new Rectangle(10, 20).getSquare());
        assertEquals(100, new Rectangle(5, 20).getSquare());
        assertEquals(100, new Rectangle(-100, 10).getSquare());
    }
}