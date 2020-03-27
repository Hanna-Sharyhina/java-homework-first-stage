package com.training.java.cleancode.planes;

import com.training.java.cleancode.types.PlaneType;

public abstract class Plane {
    private PlaneType planeType;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane() {
    }

    public PlaneType getPlaneType(){
        return planeType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxFlightDistance(int maxFlightDistance) {
        this.maxFlightDistance = maxFlightDistance;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (maxSpeed != plane.maxSpeed) return false;
        if (maxFlightDistance != plane.maxFlightDistance) return false;
        if (maxLoadCapacity != plane.maxLoadCapacity) return false;
        return planeType == plane.planeType;
    }

    @Override
    public int hashCode() {
        int result = planeType != null ? planeType.hashCode() : 0;
        result = 31 * result + maxSpeed;
        result = 31 * result + maxFlightDistance;
        result = 31 * result + maxLoadCapacity;
        return result;
    }

    @Override
    public String toString() {
        return  "Plane { planeType = " + planeType +
                ", maxSpeed = " + maxSpeed +
                ", maxFlightDistance = " + maxFlightDistance +
                ", maxLoadCapacity = " + maxLoadCapacity +
                '}';
    }
}
