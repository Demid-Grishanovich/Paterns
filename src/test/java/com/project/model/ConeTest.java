package com.project.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConeTest {

    @Test
    public void testConeCreation() {
        Point vertex = new Point(1.0, 2.0, 3.0);
        Cone cone = new Cone(vertex, 5.0, 10.0);
        assertNotNull(cone);
        assertEquals(5.0, cone.getRadius());
        assertEquals(10.0, cone.getHeight());
        assertEquals(vertex, cone.getVertex());
    }
}
