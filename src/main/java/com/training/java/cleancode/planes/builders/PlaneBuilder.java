package com.training.java.cleancode.planes.builders;

import com.training.java.cleancode.planes.Plane;
import com.training.java.cleancode.types.PlaneType;

public abstract class PlaneBuilder {

    protected Plane plane;

    public PlaneBuilder setPlaneType(PlaneType planeType){
        plane.setPlaneType(planeType);
        return this;
    }
    public PlaneBuilder setMaxSpeed(int maxSpeed){
        plane.setMaxSpeed(maxSpeed);
        return this;
    }
    public PlaneBuilder setMaxFlightDistance(int maxFlightDistance){
        plane.setMaxFlightDistance(maxFlightDistance);
        return this;
    }
    public PlaneBuilder setMaxLoadCapacity(int maxLoadCapacity){
        plane.setMaxLoadCapacity(maxLoadCapacity);
        return this;
    }

    public Plane build(){
        return plane;
    }
}
