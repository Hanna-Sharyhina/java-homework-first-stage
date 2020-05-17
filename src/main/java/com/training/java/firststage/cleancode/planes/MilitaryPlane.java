package com.training.java.firststage.cleancode.planes;

import com.training.java.firststage.cleancode.models.MilitaryPlaneModel;
import com.training.java.firststage.cleancode.types.MilitaryType;
import com.training.java.firststage.cleancode.types.PlaneType;

import java.util.Objects;

public class MilitaryPlane extends Plane {
    private MilitaryPlaneModel model;
    private MilitaryType type;

    public MilitaryPlane(PlaneType planeType, MilitaryPlaneModel model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(planeType, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.model = model;
        this.type = type;
    }

    public MilitaryPlaneModel getModel() {
        return model;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MilitaryPlane that = (MilitaryPlane) o;

        if (model != that.model) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, type);
    }


    @Override
    public String toString() {
        return " Plane {" + "planeType = " + getPlaneType() +
                ", model = " + model +
                ", maxSpeed = " + getMaxSpeed() +
                ", maxFlightDistance = " + getMaxFlightDistance() +
                ", maxLoadCapacity = " + getMaxLoadCapacity() +
                ", MilitaryType = " + type +
                '}';
    }
}