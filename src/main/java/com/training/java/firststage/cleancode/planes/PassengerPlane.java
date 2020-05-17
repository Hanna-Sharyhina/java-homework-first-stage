package com.training.java.firststage.cleancode.planes;

import com.training.java.firststage.cleancode.models.PassengerPlaneModel;
import com.training.java.firststage.cleancode.types.PlaneType;

import java.util.Objects;

public class PassengerPlane extends Plane {
    private PassengerPlaneModel model;
    private int passengersCapacity;

    public PassengerPlane(PlaneType planeType, PassengerPlaneModel model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(planeType, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.model = model;
        this.passengersCapacity = passengersCapacity;
    }

    public PassengerPlaneModel getModel() {
        return model;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerPlane that = (PassengerPlane) o;

        if (passengersCapacity != that.passengersCapacity) return false;
        return model == that.model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, passengersCapacity);
    }

    @Override
    public String toString() {
        return " Plane {" + "planeType = " + getPlaneType() +
                ", model = " + model +
                ", maxSpeed = " + getMaxSpeed() +
                ", maxFlightDistance = " + getMaxFlightDistance() +
                ", maxLoadCapacity = " + getMaxLoadCapacity() +
                ", passengerCapacity = " + passengersCapacity +
                '}';
    }
}
