package bai24;

abstract class Vehicle {
    protected double fuel; // Fuel in liters
    protected double cargo; // Cargo in kg

    public Vehicle(double fuel) {
        this.fuel = fuel;
        this.cargo = 0;
    }

    public void addCargo(double weight) {
        this.cargo += weight;
        System.out.println("Added cargo: " + weight + " kg");
    }

    public void removeCargo(double weight) {
        if (weight > this.cargo) {
            System.out.println("Not enough cargo to remove");
        } else {
            this.cargo -= weight;
            System.out.println("Removed cargo: " + weight + " kg");
        }
    }

    public void refuel(double liters) {
        this.fuel += liters;
        System.out.println("Added fuel: " + liters + " liters");
    }

    public abstract void drive(double distance);

    public boolean isOutOfFuel() {
        return this.fuel <= 0;
    }

    public void displayFuel() {
        System.out.println("Remaining fuel: " + this.fuel + " liters");
    }
}