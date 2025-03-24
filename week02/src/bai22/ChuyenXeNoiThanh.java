package bai22;

class IntercityTrip extends Trip {
    private String destination;
    private int travelDays;

    public IntercityTrip(String tripId, String driverName, String vehicleId, double cargoWeight, String destination, int travelDays, double revenue) {
        super(tripId, driverName, vehicleId, cargoWeight, revenue);
        this.destination = destination;
        this.travelDays = travelDays;
    }

    @Override
    public void display() {
        System.out.println("Intercity Trip: " + tripId + ", Driver: " + driverName + ", Vehicle: " + vehicleId + ", Destination: " + destination + ", Days: " + travelDays + ", Revenue: " + revenue);
    }
}