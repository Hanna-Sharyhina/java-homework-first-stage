package com.training.java.cleancode;

import com.training.java.cleancode.models.MilitaryPlaneModel;
import com.training.java.cleancode.models.PassengerPlaneModel;
import com.training.java.cleancode.planes.MilitaryPlane;
import com.training.java.cleancode.types.PlaneType;
import com.training.java.cleancode.planes.PassengerPlane;
import com.training.java.cleancode.planes.Plane;
import com.training.java.cleancode.types.MilitaryType;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    static List<Plane> planes = new ArrayList<>();

    public static void main(String[] args) {
        planes.add(new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.BOEING_737, 900, 12000, 60500, 164));
        planes.add(new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.BOEING_737_800, 940, 12300, 63870, 192));
        planes.add(new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.BOEING_747, 980, 16100, 70500, 242));
        planes.add(new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.AIRBUS_A320, 930, 11800, 65500, 188));
        planes.add(new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.AIRBUS_A330, 990, 14800, 80500, 222));
        planes.add(new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.EMBRAER_190, 870, 8100, 30800, 64));
        planes.add(new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.SUKHOI_SUPERJET_100, 870, 11500, 50500, 140));
        planes.add(new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.BOMBARDIER_CS300, 920, 11000, 60700, 196));
        planes.add(new MilitaryPlane(PlaneType.MILITARY, MilitaryPlaneModel.B_1B_LANCER, 1050, 21000, 80000, MilitaryType.BOMBER));
        planes.add(new MilitaryPlane(PlaneType.MILITARY, MilitaryPlaneModel.B_2_SPIRIT, 1030, 22000, 70000, MilitaryType.BOMBER));
        planes.add(new MilitaryPlane(PlaneType.MILITARY, MilitaryPlaneModel.B_52_STRATOFORTRESS, 1000, 20000, 80000, MilitaryType.BOMBER));
        planes.add(new MilitaryPlane(PlaneType.MILITARY, MilitaryPlaneModel.F_15, 1500, 12000, 10000, MilitaryType.FIGHTER));
        planes.add(new MilitaryPlane(PlaneType.MILITARY, MilitaryPlaneModel.F_22, 1550, 13000, 11000, MilitaryType.FIGHTER));
        planes.add(new MilitaryPlane(PlaneType.MILITARY, MilitaryPlaneModel.C_130_HERCULES, 650, 5000, 110000, MilitaryType.TRANSPORT));

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