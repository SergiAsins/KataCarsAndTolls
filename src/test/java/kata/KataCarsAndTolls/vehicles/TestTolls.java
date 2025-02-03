package kata.KataCarsAndTolls.vehicles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestTolls {

    @Test
    public void testMultipleTrucks() {
        TollStation tollStation = new TollStation("Bridge Station", "Seattle");
        Truck renault = new Truck("TRK123", 3);
        Truck scania = new Truck("TRK456", 6);

        tollStation.reportVehicle(renault);
        tollStation.reportVehicle(scania);

        assertEquals(450, tollStation.getTotalAmount());
    }

    @Test
    public void testNoVehicles() {
        TollStation tollStation = new TollStation("Empty Clouds", "Ghost Town");
        assertEquals(0, tollStation.getTotalAmount());
    }

    @Test
    public void testSequentialReporting() {
        TollStation tollStation = new TollStation("Highway 101", "California");
        Car car = new Car("CAR001");
        Moto moto = new Moto("MOTO001");

        tollStation.reportVehicle(car);
        assertEquals(100, tollStation.getTotalAmount(), "After reporting car");

        tollStation.reportVehicle(moto);
        assertEquals(150, tollStation.getTotalAmount(), "After reporting moto");
    }

    @Test
    public void testReportVehicles(){
        TollStation tollStation = new TollStation("Coffee Avenue", "Lollipop City");
        Car car = new Car("V6411GL");
        Moto moto = new Moto("B1234PL");
        Truck truck = new Truck("A1239WY", 4);

        tollStation.reportVehicle(car);
        tollStation.reportVehicle(moto);
        tollStation.reportVehicle(truck);

        assertEquals(350, tollStation.getTotalAmount());
    }

    @Test
    public void testCarToll(){
        TollStation tollStation = new TollStation("Margarita Street", "Lollipop City");
        Car car = new Car("L6612YV");
        assertEquals(100, car.calculateToll());
    }

    @Test
    public void testMotoToll(){
        TollStation tollStation = new TollStation("Route 53", "NY");
        Moto moto = new Moto("Y2221MJ");
        assertEquals(50, moto.calculateToll());
    }

    @Test
    public void testTruckToll(){
        TollStation tollStation = new TollStation("Essaouira Road", "Marrakech");
        Truck truck = new Truck("A1234XY", 5);
        assertEquals(250, truck.calculateToll());
    }



}