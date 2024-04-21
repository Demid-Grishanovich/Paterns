package com.project.service;

import com.project.model.Cone;
import com.project.model.Point;

public class ConeService {
    // Method to calculate the slant height of the cone
    private double calculateSlantHeight(Cone cone) {
        // Pythagorean theorem to find the slant height
        return Math.sqrt(Math.pow(cone.getRadius(), 2) + Math.pow(cone.getHeight(), 2));
    }

    public double findLateralSurfaceArea(Cone cone) {
        double slantHeight = calculateSlantHeight(cone);
        // Formula for lateral surface area of a cone
        return Math.PI * cone.getRadius() * slantHeight;
    }

    public double findBaseSurfaceArea(Cone cone) {
        // Formula for the area of a circle (base of the cone)
        return Math.PI * Math.pow(cone.getRadius(), 2);
    }

    public double findTotalSurfaceArea(Cone cone) {
        // Sum of lateral surface area and base area
        return findLateralSurfaceArea(cone) + findBaseSurfaceArea(cone);
    }

    public double findVolume(Cone cone) {
        // Formula for the volume of a cone (1/3 * base area * height)
        return (1.0 / 3) * findBaseSurfaceArea(cone) * cone.getHeight();
    }
}