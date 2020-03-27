package com.training.java.cleancode.planes.builders;

import com.training.java.cleancode.models.ExperimentalPlaneModel;
import com.training.java.cleancode.planes.ExperimentalPlane;
import com.training.java.cleancode.types.ConfidentialLevel;
import com.training.java.cleancode.types.ExperimentalType;

public class ExperimentalPlaneBuilder extends PlaneBuilder {

    public ExperimentalPlaneBuilder(){
        plane = new ExperimentalPlane();
    }

    public ExperimentalPlaneBuilder setModel(ExperimentalPlaneModel model){
        ((ExperimentalPlane)plane).setModel(model);
        return this;
    }

    public ExperimentalPlaneBuilder setConfidentialLevel(ConfidentialLevel confidentialLevel){
        ((ExperimentalPlane)plane).setConfidentialLevel(confidentialLevel);
        return this;
    }
    public ExperimentalPlaneBuilder setExperimentalType(ExperimentalType experimentalType){
        ((ExperimentalPlane)plane).setExperimentalType(experimentalType);
        return this;
    }
}
