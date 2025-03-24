package bai22;

abstract class Trip {
    protected String tripId;
    protected String driverName;
    protected String vehicleId;
    protected double cargoWeight;
    protected double revenue;

    public Trip(String tripId, String driverName, String vehicleId, double cargoWeight, double revenue) {
        this.tripId = tripId;
        this.driverName = driverName;
        this.vehicleId = vehicleId;
        this.cargoWeight = cargoWeight;
        this.revenue = revenue;
    }

    public double getRevenue() {
        return revenue;
    }

    public abstract void display();
}