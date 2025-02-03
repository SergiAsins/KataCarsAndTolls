package kata.KataCarsAndTolls.vehicles;

public class Truck extends Vehicle {
    private final Integer axles;

    public Truck(String plate, int axles) {
        super(plate);
        this.axles = axles;
    }

    @Override
    public int calculateToll(){
        return 50 * axles;
    }

    public Integer getAxles() {
        return axles;
    }
}
