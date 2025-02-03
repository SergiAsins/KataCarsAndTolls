package kata.KataCarsAndTolls.vehicles;

import java.util.List;
import java.util.ArrayList;

public class TollStation {
    private String name;
    private String city;
    private int totalAmount;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalAmount = 0;
        this.vehicles = new ArrayList<>();
    }

    public int getTotalAmount(){
        return totalAmount;
    }

    public void reportVehicle(Vehicle vehicle){
        int costToll = vehicle.calculateToll();
        vehicles.add(vehicle);
        totalAmount += costToll;

        System.out.println("Vehículo registrado: " + vehicle.getPlate() +
                ", Type: " + vehicle.getClass().getSimpleName() +
                ", Toll Taz: $" + costToll +
                ", Total amount: $" + totalAmount);
    }
}
