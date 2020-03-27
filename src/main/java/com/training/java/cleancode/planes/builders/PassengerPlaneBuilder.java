package com.training.java.cleancode.planes.builders;

import com.training.java.cleancode.models.PassengerPlaneModel;
import com.training.java.cleancode.planes.PassengerPlane;

public class PassengerPlaneBuilder extends PlaneBuilder {

    public PassengerPlaneBuilder(){
        plane = new PassengerPlane();
    }


    public PassengerPlaneBuilder setModel(PassengerPlaneModel passengerPlaneModel) {
        ((PassengerPlane)plane).setModel(passengerPlaneModel);
        return this;
    }

    public PassengerPlaneBuilder setPassengersCapacity(int passengersCapacity){
        ((PassengerPlane)plane).setPassengersCapacity(passengersCapacity);
        return this;
    }
}