package com.project.util;

import com.project.model.Cone;
import com.project.model.Point;

import com.project.exception.ValidationException;


public class Factory {

    public static Cone createCone(double x, double y, double z, double radius, double height) throws ValidationException {
        if (ConeValidator.isValidConeParameters(radius, height)) {
            Point vertex = new Point(x, y, z);
            return new Cone(vertex, radius, height);
        }
        throw new ValidationException("Invalid cone parameters");
    }
}