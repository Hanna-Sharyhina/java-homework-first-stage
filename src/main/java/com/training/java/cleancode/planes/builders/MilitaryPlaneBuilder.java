package com.training.java.cleancode.planes.builders;

import com.training.java.cleancode.models.MilitaryPlaneModel;
import com.training.java.cleancode.planes.MilitaryPlane;
import com.training.java.cleancode.types.MilitaryType;

public class MilitaryPlaneBuilder extends PlaneBuilder {

    public MilitaryPlaneBuilder(){
        plane = new MilitaryPlane();
    }


    public MilitaryPlaneBuilder setModel(MilitaryPlaneModel militaryPlaneModels){
        ((MilitaryPlane)plane).setModel(militaryPlaneModels);
        return this;
    }


    public MilitaryPlaneBuilder setMilitaryType(MilitaryType militaryType) {
        ((MilitaryPlane)plane).setMilitaryType(militaryType);
        return this;
    }
}