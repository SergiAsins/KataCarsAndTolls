package kata.KataCarsAndTolls.vehicles;

public class Moto extends Vehicle {
    public Moto(String plate) {
        super(plate);
    }

    @Override
    public int calculateToll(){
        return 50;
    }
}
