package com.project.observer.impl;

import com.project.model.Cone;
import com.project.model.Warehouse;
import com.project.service.ConeService;

public class ConeObserverImpl {


    public void update(Cone cone) {
        ConeService service = new ConeService();
        double lateralSurfaceArea = service.findLateralSurfaceArea(cone);
        double baseSurfaceArea = service.findBaseSurfaceArea(cone);
        double totalSurfaceArea = service.findTotalSurfaceArea(cone);
        double volume = service.findVolume(cone);
        int key = cone.getId();

        Warehouse warehouse = Warehouse.getInstance();

        Double[] coneValues = new Double[]{lateralSurfaceArea, baseSurfaceArea, totalSurfaceArea, volume};
        warehouse.put(key, coneValues);
    }
}