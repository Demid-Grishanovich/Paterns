package com.project.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void testEqualsSamePoint() {
        Point point1 = new Point(1.0, 2.0, 3.0);
        Point point2 = new Point(1.0, 2.0, 3.0);
        assertTrue(point1.equals(point2));
    }

    @Test
    public void testNotEqualsDifferentPoint() {
        Point point1 = new Point(1.0, 2.0, 3.0);
        Point point2 = new Point(4.0, 5.0, 6.0);
        assertFalse(point1.equals(point2));
    }
}