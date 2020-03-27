package com.training.java.cleancode.planes;

import com.training.java.cleancode.models.MilitaryPlaneModel;
import com.training.java.cleancode.types.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane {
    private MilitaryPlaneModel model;
    private MilitaryType militaryType;

    public MilitaryPlaneModel getModel(){
        return model;
    }
    public MilitaryType getMilitaryType(){
        return militaryType;
    }

    public void setModel(MilitaryPlaneModel model) {
        this.model = model;
    }

    public void setMilitaryType(MilitaryType militaryType) {
        this.militaryType = militaryType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MilitaryPlane that = (MilitaryPlane) o;

        if (model != that.model) return false;
        return militaryType == that.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, militaryType);
    }


    @Override
    public String toString() {
        return " Plane {" + "planeType = " + getPlaneType() +
                ", model = " + model +
                ", maxSpeed = " + getMaxSpeed() +
                ", maxFlightDistance = " + getMaxFlightDistance() +
                ", maxLoadCapacity = " + getMaxLoadCapacity() +
                ", MilitaryType = " + militaryType +
                '}';
    }
}