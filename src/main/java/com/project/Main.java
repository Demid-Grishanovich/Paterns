package com.project;

import com.project.exception.ValidationException;
import com.project.model.Cone;
import com.project.util.DataReader;
import com.project.util.Factory;

public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        try {
            for (String line : dataReader.readValidLinesFromFile("src/main/resources/figures.txt")) {
                String[] parts = line.split(";");
                double x = Double.parseDouble(parts[0].trim());
                double y = Double.parseDouble(parts[1].trim());
                double z = Double.parseDouble(parts[2].trim());
                double radius = Double.parseDouble(parts[3].trim());
                double height = Double.parseDouble(parts[4].trim());

                try {
                    Cone cone = Factory.createCone(x, y, z, radius, height);
                    System.out.println("Created cone: " + cone);
                } catch (ValidationException e) {
                    System.err.println("Failed to create a cone: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }
}
