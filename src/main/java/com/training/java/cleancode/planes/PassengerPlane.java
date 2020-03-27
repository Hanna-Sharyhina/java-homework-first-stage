package com.training.java.cleancode.planes;

import com.training.java.cleancode.models.PassengerPlaneModel;

import java.util.Objects;

public class PassengerPlane extends Plane {
    private PassengerPlaneModel model;
    private int passengersCapacity;
    public PassengerPlane(){
    }
    public PassengerPlaneModel getModel() {
        return model;
    }
    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setModel(PassengerPlaneModel model) {
        this.model = model;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
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
