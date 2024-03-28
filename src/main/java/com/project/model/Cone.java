package com.project.model;

public class Cone {
    private final Point vertex;
    private final double radius;
    private final double height;

    public Cone(Point vertex, double radius, double height) {
        this.vertex = vertex;
        this.radius = radius;
        this.height = height;
    }

    public Point getVertex() {
        return vertex;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Cone(vertex=%s, radius=%s, height=%s)", vertex, radius, height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cone cone = (Cone) obj;
        return Double.compare(cone.radius, radius) == 0 &&
                Double.compare(cone.height, height) == 0 &&
                vertex.equals(cone.vertex);
    }

    @Override
    public int hashCode() {
        int result = vertex.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

