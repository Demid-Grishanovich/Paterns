package com.project.exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidationExceptionTest {

    @Test
    public void testExceptionMessage() {
        Exception exception = assertThrows(ValidationException.class, () -> {
            throw new ValidationException("Test message");
        });
        assertEquals("Test message", exception.getMessage());
    }
}