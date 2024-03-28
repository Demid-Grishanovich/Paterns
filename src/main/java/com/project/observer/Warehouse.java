package com.project.observer;

import com.project.model.Cone;
import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private final Map<Cone, Double> coneProperties = new HashMap<>();

    public void updateConeProperty(Cone cone, double propertyValue) {
        coneProperties.put(cone, propertyValue);
    }

    public Double getConeProperty(Cone cone) {
        return coneProperties.get(cone);
    }

    // Демонстрация шаблона Singleton
    private static Warehouse instance;

    private Warehouse() {}

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }
}
