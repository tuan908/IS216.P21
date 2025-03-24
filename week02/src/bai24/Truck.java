package bai24;

class Truck extends Vehicle {
    public Truck(double fuel) {
        super(fuel);
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = (20 * distance / 100) + (1 * (this.cargo / 100) * distance / 100);
        if (fuelNeeded > this.fuel) {
            System.out.println("Not enough fuel to drive " + distance + " km");
        } else {
            this.fuel -= fuelNeeded;
            System.out.println("Truck drove " + distance + " km");
        }
    }
}
