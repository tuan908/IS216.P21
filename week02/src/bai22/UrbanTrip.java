package bai22;

class UrbanTrip extends Trip {
    private double distance;

    public UrbanTrip(String tripId, String driverName, String vehicleId, double cargoWeight, double distance, double revenue) {
        super(tripId, driverName, vehicleId, cargoWeight, revenue);
        this.distance = distance;
    }

    @Override
    public void display() {
        System.out.println("Urban Trip: " + tripId + ", Driver: " + driverName + ", Vehicle: " + vehicleId + ", Distance: " + distance + " km, Revenue: " + revenue);
    }
}