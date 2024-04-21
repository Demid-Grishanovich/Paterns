package com.project.model;

import com.project.util.IdGenerator;

import java.util.Objects;

public class Cone {

    private final int id;
    private final Point vertex;
    private final double radius;
    private final double height;

    public Cone( Point vertex, double radius, double height) {
        this.id = IdGenerator.increment();
        this.vertex = vertex;
        this.radius = radius;
        this.height = height;
    }


    public int getId() {
        return id;
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
        return "Cone{" +
                "id=" + id +
                ", vertex=" + vertex +
                ", radius=" + radius +
                ", height=" + height +
                '}';
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
        return Objects.hash(id, vertex, radius, height);
    }
}