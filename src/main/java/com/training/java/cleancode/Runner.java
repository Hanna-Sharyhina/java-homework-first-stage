package com.training.java.cleancode;

import com.training.java.cleancode.models.MilitaryPlaneModel;
import com.training.java.cleancode.models.PassengerPlaneModel;
import com.training.java.cleancode.planes.Plane;
import com.training.java.cleancode.planes.builders.MilitaryPlaneBuilder;
import com.training.java.cleancode.planes.builders.PassengerPlaneBuilder;
import com.training.java.cleancode.types.MilitaryType;
import com.training.java.cleancode.types.PlaneType;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    static List<Plane> planes = new ArrayList<>();
    public static void main(String[] args) {
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

        SortingPlanes sortingPlanes = new SortingPlanes(planes);
        SortingPlanes militarySortingPlanes = new SortingPlanes(sortingPlanes.getMilitaryPlanes());
        SortingPlanes passengerSortingPlanes = new SortingPlanes(sortingPlanes.getPassengerPlane());

        System.out.println("Military planes sorted by max flight distance: " + militarySortingPlanes
                .sortByMaxFlightDistance()
                .toString());
        System.out.println("Passenger planes sorted by max speed: " + passengerSortingPlanes
                .sortByMaxSpeed()
                .toString());
        System.out.println("Plane with max passengers capacity: " + passengerSortingPlanes.getPassengerPlaneWithMaxPassengersCapacity());
    }
}