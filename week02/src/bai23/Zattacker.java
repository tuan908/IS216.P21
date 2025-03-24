package bai23;

import java.util.Random;

class Zattacker extends Robot {
    private int power;

    public Zattacker() {
        super(50);
        this.power = new Random().nextInt(11) + 20; // 20 to 30
    }

    @Override
    public double getEnergyConsumption(int distance) {
        return weight * distance + power * power * distance;
    }

    @Override
    public String toString() {
        return "Zattacker (Power: " + power + ")";
    }
}