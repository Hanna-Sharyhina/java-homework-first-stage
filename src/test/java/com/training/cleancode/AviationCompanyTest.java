package com.training.cleancode;

import com.training.java.firstStage.cleancode.SortingPlanes;
import com.training.java.firstStage.cleancode.models.ExperimentalPlaneModel;
import com.training.java.firstStage.cleancode.models.MilitaryPlaneModel;
import com.training.java.firstStage.cleancode.models.PassengerPlaneModel;
import com.training.java.firstStage.cleancode.planes.ExperimentalPlane;
import com.training.java.firstStage.cleancode.planes.MilitaryPlane;
import com.training.java.firstStage.cleancode.planes.PassengerPlane;
import com.training.java.firstStage.cleancode.planes.Plane;
import com.training.java.firstStage.cleancode.types.ConfidentialLevel;
import com.training.java.firstStage.cleancode.types.ExperimentalType;
import com.training.java.firstStage.cleancode.types.MilitaryType;
import com.training.java.firstStage.cleancode.types.PlaneType;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class AviationCompanyTest {
    private static List<Plane> planes = new ArrayList<>();

    private void addPlanesToTheList() {
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
        planes.add(new ExperimentalPlane(PlaneType.EXPERIMENTAL, ExperimentalPlaneModel.BELL_X_14, 277, 482, 500, ConfidentialLevel.CONFIDENTIAL, ExperimentalType.HIGH_ALTITUDE));
        planes.add(new ExperimentalPlane(PlaneType.EXPERIMENTAL, ExperimentalPlaneModel.RYAN_X_13_VERTIJET, 560, 307, 500, ConfidentialLevel.TOP_SECRET, ExperimentalType.VTOL));
    }

    private static Plane planeWithMaxPassengerCapacity = new PassengerPlane(PlaneType.PASSENGER, PassengerPlaneModel.BOEING_747, 980, 16100, 70500, 242);

    @Test
    public void testGetTransportMilitaryPlanes() {
        addPlanesToTheList();
        SortingPlanes airport = new SortingPlanes(planes);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        assertThat(transportMilitaryPlanes).extracting(MilitaryPlane::getType).contains(MilitaryType.TRANSPORT);
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
        assertThat(bomberMilitaryPlanes).extracting(MilitaryPlane::getType).contains(MilitaryType.BOMBER);
    }

    @Test
    public void testExperimentalPlanesHasConfidentialLevelHigherThanUnclassified() {
        addPlanesToTheList();
        SortingPlanes airport = new SortingPlanes(planes);
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        assertThat(experimentalPlanes).extracting(ExperimentalPlane::getConfidentialLevel).doesNotContain(ConfidentialLevel.UNCLASSIFIED);
    }
}