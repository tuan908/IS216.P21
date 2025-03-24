package bai23;

abstract class Robot {
    protected int weight;

    public Robot(int weight) {
        this.weight = weight;
    }

    public abstract double getEnergyConsumption(int distance);
}