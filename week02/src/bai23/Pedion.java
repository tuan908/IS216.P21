package bai23;

import java.util.Random;

class Pedion extends Robot {
    private int flexibility;

    public Pedion() {
        super(20);
        this.flexibility = new Random().nextInt(5) + 1; // 1 to 5
    }

    @Override
    public double getEnergyConsumption(int distance) {
        return weight * distance + (flexibility + 1) * distance / 2.0;
    }

    @Override
    public String toString() {
        return "Pedion (Flexibility: " + flexibility + ")";
    }
}