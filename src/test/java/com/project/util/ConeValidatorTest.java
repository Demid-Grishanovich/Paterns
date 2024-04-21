package com.project.util;

import com.project.exception.ValidationException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConeValidatorTest {

    @Test
    public void testValidConeParameters() {
        assertDoesNotThrow(() -> ConeValidator.isValidConeParameters(5.0, 10.0));
    }

    @Test
    public void testInvalidConeParameters() {
        assertThrows(ValidationException.class, () -> ConeValidator.isValidConeParameters(-5.0, -10.0));
    }
}