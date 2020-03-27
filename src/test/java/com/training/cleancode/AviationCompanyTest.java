package com.training.cleancode;

import com.training.java.cleancode.SortingPlanes;
import com.training.java.cleancode.models.ExperimentalPlaneModel;
import com.training.java.cleancode.models.MilitaryPlaneModel;
import com.training.java.cleancode.models.PassengerPlaneModel;
import com.training.java.cleancode.planes.ExperimentalPlane;
import com.training.java.cleancode.planes.MilitaryPlane;
import com.training.java.cleancode.planes.PassengerPlane;
import com.training.java.cleancode.planes.Plane;
import com.training.java.cleancode.planes.builders.ExperimentalPlaneBuilder;
import com.training.java.cleancode.planes.builders.MilitaryPlaneBuilder;
import com.training.java.cleancode.planes.builders.PassengerPlaneBuilder;
import com.training.java.cleancode.types.ConfidentialLevel;
import com.training.java.cleancode.types.ExperimentalType;
import com.training.java.cleancode.types.MilitaryType;
import com.training.java.cleancode.types.PlaneType;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;
public class AviationCompanyTest {
    private static List<Plane> planes = new ArrayList<>();
    private void addPlanesToTheList() {
        planes.add(new PassengerPlaneBuilder()
                .setModel(PassengerPlaneModel.BOEING_737)
                .setPassengersCapacity(164)
                .setPlaneType(PlaneType.PASSENGER)
                .setMaxSpeed(900)
                .setMaxFlightDistance(12000)
                .setMaxLoadCapacity(60500).build());
        planes.add(new PassengerPlaneBuilder()
                .setModel(PassengerPlaneModel.BOEING_737_800)
                .setPassengersCapacity(192)
                .setPlaneType(PlaneType.PASSENGER)
                .setMaxSpeed(940)
                .setMaxFlightDistance(12300)
                .setMaxLoadCapacity(63870).build());
        planes.add(new PassengerPlaneBuilder()
                .setModel(PassengerPlaneModel.BOEING_747)
                .setPassengersCapacity(242)
                .setPlaneType(PlaneType.PASSENGER)
                .setMaxSpeed(980)
                .setMaxFlightDistance(16100)
                .setMaxLoadCapacity(70500).build());
        planes.add(new PassengerPlaneBuilder()
                .setModel(PassengerPlaneModel.AIRBUS_A320)
                .setPassengersCapacity(188)
                .setPlaneType(PlaneType.PASSENGER)
                .setMaxSpeed(930)
                .setMaxFlightDistance(11800)
                .setMaxLoadCapacity(65500).build());
        planes.add(new PassengerPlaneBuilder()
                .setModel(PassengerPlaneModel.AIRBUS_A330)
                .setPassengersCapacity(222)
                .setPlaneType(PlaneType.PASSENGER)
                .setMaxSpeed(990)
                .setMaxFlightDistance(14800)
                .setMaxLoadCapacity(80500).build());
        planes.add(new PassengerPlaneBuilder()
                .setModel(PassengerPlaneModel.EMBRAER_190)
                .setPassengersCapacity(64)
                .setPlaneType(PlaneType.PASSENGER)
                .setMaxSpeed(870)
                .setMaxFlightDistance(8100)
                .setMaxLoadCapacity(30800).build());
        planes.add(new PassengerPlaneBuilder()
                .setModel(PassengerPlaneModel.SUKHOI_SUPERJET_100)
                .setPassengersCapacity(140)
                .setPlaneType(PlaneType.PASSENGER)
                .setMaxSpeed(870)
                .setMaxFlightDistance(11500)
                .setMaxLoadCapacity(50500).build());
        planes.add(new PassengerPlaneBuilder()
                .setModel(PassengerPlaneModel.BOMBARDIER_CS300)
                .setPassengersCapacity(196)
                .setPlaneType(PlaneType.PASSENGER)
                .setMaxSpeed(920)
                .setMaxFlightDistance(11000)
                .setMaxLoadCapacity(60700).build());
        planes.add(new MilitaryPlaneBuilder()
                .setModel(MilitaryPlaneModel.B_1B_LANCER)
                .setMilitaryType(MilitaryType.BOMBER)
                .setPlaneType(PlaneType.MILITARY)
                .setMaxSpeed(1050)
                .setMaxFlightDistance(21000)
                .setMaxLoadCapacity(80000).build());
        planes.add(new MilitaryPlaneBuilder()
                .setModel(MilitaryPlaneModel.B_2_SPIRIT)
                .setMilitaryType(MilitaryType.BOMBER)
                .setPlaneType(PlaneType.MILITARY)
                .setMaxSpeed(1030)
                .setMaxFlightDistance(22000)
                .setMaxLoadCapacity(70000).build());
        planes.add(new MilitaryPlaneBuilder()
                .setModel(MilitaryPlaneModel.B_52_STRATOFORTRESS)
                .setMilitaryType(MilitaryType.BOMBER)
                .setPlaneType(PlaneType.MILITARY)
                .setMaxSpeed(1000)
                .setMaxFlightDistance(20000)
                .setMaxLoadCapacity(80000).build());
        planes.add(new MilitaryPlaneBuilder()
                .setModel(MilitaryPlaneModel.F_15)
                .setMilitaryType(MilitaryType.FIGHTER)
                .setPlaneType(PlaneType.MILITARY)
                .setMaxSpeed(1500)
                .setMaxFlightDistance(12000)
                .setMaxLoadCapacity(10000).build());
        planes.add(new MilitaryPlaneBuilder()
                .setModel(MilitaryPlaneModel.F_22)
                .setMilitaryType(MilitaryType.FIGHTER)
                .setPlaneType(PlaneType.MILITARY)
                .setMaxSpeed(1550)
                .setMaxFlightDistance(13000)
                .setMaxLoadCapacity(11000).build());
        planes.add(new MilitaryPlaneBuilder()
                .setModel(MilitaryPlaneModel.C_130_HERCULES)
                .setMilitaryType(MilitaryType.TRANSPORT)
                .setPlaneType(PlaneType.MILITARY)
                .setMaxSpeed(650)
                .setMaxFlightDistance(5000)
                .setMaxLoadCapacity(110000).build());

        planes.add(new ExperimentalPlaneBuilder()
                .setModel(ExperimentalPlaneModel.BELL_X_14)
                .setConfidentialLevel(ConfidentialLevel.CONFIDENTIAL)
                .setExperimentalType(ExperimentalType.HIGH_ALTITUDE)
                .setPlaneType(PlaneType.EXPERIMENTAL)
                .setMaxSpeed(12)
                .setMaxFlightDistance(1222)
                .setMaxLoadCapacity(122).build());
    }
    private static Plane planeWithMaxPassengerCapacity = new PassengerPlaneBuilder()
            .setModel(PassengerPlaneModel.BOEING_747)
            .setPassengersCapacity(242)
            .setPlaneType(PlaneType.PASSENGER)
            .setMaxSpeed(980)
            .setMaxFlightDistance(16100)
            .setMaxLoadCapacity(70500).build();

    @Test
    public void testGetTransportMilitaryPlanes() {
        addPlanesToTheList();
        SortingPlanes airport = new SortingPlanes(planes);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        assertThat(transportMilitaryPlanes).extracting(MilitaryPlane::getMilitaryType).contains(MilitaryType.TRANSPORT);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        addPlanesToTheList();
        SortingPlanes airport = new SortingPlanes(planes);
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        assertThat(planeWithMaxPassengerCapacity).isEqualTo(expectedPlaneWithMaxPassengersCapacity);
    }

    @Test
    public void testIsSortedByMaxLoadCapacity() {
        addPlanesToTheList();
        SortingPlanes airport = new SortingPlanes(planes);
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        assertThat(planesSortedByMaxLoadCapacity).extracting(Plane::getMaxLoadCapacity).isSorted();
    }

    @Test
    public void testGetBomberMilitaryPlanes() {
        addPlanesToTheList();
        SortingPlanes airport = new SortingPlanes(planes);
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        assertThat(bomberMilitaryPlanes).extracting(MilitaryPlane::getMilitaryType).contains(MilitaryType.BOMBER);
    }

    @Test
    public void testExperimentalPlanesHasConfidentialLevelHigherThanUnclassified() {
        addPlanesToTheList();
        SortingPlanes airport = new SortingPlanes(planes);
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        assertThat(experimentalPlanes).extracting(ExperimentalPlane::getConfidentialLevel).doesNotContain(ConfidentialLevel.UNCLASSIFIED);
    }
}