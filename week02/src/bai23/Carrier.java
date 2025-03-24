package bai23;

import java.util.Random;

class Carrier extends Robot {
    private int energyStorage;

    public Carrier() {
        super(30);
        this.energyStorage = new Random().nextInt(51) + 50; // 50 to 100
    }

    @Override
    public double getEnergyConsumption(int distance) {
        return weight * distance + 4 * energyStorage * distance;
    }

    @Override
    public String toString() {
        return "Carrier (Energy: " + energyStorage + ")";
    }
}