package bai24;

class Motorbike extends Vehicle {
    public Motorbike(double fuel) {
        super(fuel);
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = (2 * distance / 100) + (0.1 * (this.cargo / 10) * distance / 100);
        if (fuelNeeded > this.fuel) {
            System.out.println("Not enough fuel to drive " + distance + " km");
        } else {
            this.fuel -= fuelNeeded;
            System.out.println("Motorbike drove " + distance + " km");
        }
    }
}