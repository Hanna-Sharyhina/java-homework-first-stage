package com.training.java.firstStage.cleancode.planes;

import com.training.java.firstStage.cleancode.models.ExperimentalPlaneModel;
import com.training.java.firstStage.cleancode.types.ConfidentialLevel;
import com.training.java.firstStage.cleancode.types.ExperimentalType;
import com.training.java.firstStage.cleancode.types.PlaneType;

import java.util.Objects;

public class ExperimentalPlane extends Plane {
    private ExperimentalPlaneModel model;
    private ConfidentialLevel confidentialLevel;
    private ExperimentalType experimentalType;

    public ExperimentalPlane(PlaneType planeType, ExperimentalPlaneModel model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ConfidentialLevel confidentialLevel, ExperimentalType type) {
        super(planeType, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.model = model;
        this.confidentialLevel = confidentialLevel;
        this.experimentalType = type;
    }

    public ExperimentalPlaneModel getModel() {
        return model;
    }

    public ConfidentialLevel getConfidentialLevel() {
        return confidentialLevel;
    }

    public ExperimentalType getExperimentalType() {
        return experimentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ExperimentalPlane that = (ExperimentalPlane) o;

        if (model != that.model) return false;
        if (confidentialLevel != that.confidentialLevel) return false;
        return experimentalType == that.experimentalType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, confidentialLevel, experimentalType);
    }


    @Override
    public String toString() {
        return " Plane {" + "planeType = " + getPlaneType() +
                ", model = " + model +
                ", maxSpeed = " + getMaxSpeed() +
                ", maxFlightDistance = " + getMaxFlightDistance() +
                ", maxLoadCapacity = " + getMaxLoadCapacity() +
                ", confidentialLevel = " + confidentialLevel +
                ", ExperimentalType = " + experimentalType +
                '}';
    }
}
