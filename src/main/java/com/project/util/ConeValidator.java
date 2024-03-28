package com.project.util;

import com.project.exception.ValidationException;

public class ConeValidator {

    public static boolean isValidConeParameters(double radius, double height) throws ValidationException {
        if (radius <= 0 || height <= 0) {
            throw new ValidationException("Radius and height must be positive values.");
        }
        return true;
    }
}
