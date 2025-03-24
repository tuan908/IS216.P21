package bai22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Trip> trips = new ArrayList<>();

        System.out.print("Enter number of trips: ");
        int n = sc.nextInt() > 19 ? 19 : sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= n; i++) {
            System.out.print("Enter trip type (1 for Urban, 2 for Intercity): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter trip ID: ");
            String tripId = sc.nextLine();
            System.out.print("Enter driver name: ");
            String driverName = sc.nextLine();
            System.out.print("Enter vehicle ID: ");
            String vehicleId = sc.nextLine();
            System.out.print("Enter cargo weight: ");
            double cargoWeight = sc.nextDouble();
            System.out.print("Enter revenue: ");
            double revenue = sc.nextDouble();

            if (type == 1) {
                System.out.print("Enter distance: ");
                double distance = sc.nextDouble();
                trips.add(new UrbanTrip(tripId, driverName, vehicleId, cargoWeight, distance, revenue));
            } else {
                sc.nextLine();
                System.out.print("Enter destination: ");
                String destination = sc.nextLine();
                System.out.print("Enter travel days: ");
                int travelDays = sc.nextInt();
                trips.add(new IntercityTrip(tripId, driverName, vehicleId, cargoWeight, destination, travelDays,
                        revenue));
            }
        }

        double totalUrbanRevenue = 0, totalIntercityRevenue = 0;
        Trip highestUrbanTrip = null, highestIntercityTrip = null;

        for (Trip trip : trips) {
            trip.display();
            if (trip instanceof UrbanTrip) {
                totalUrbanRevenue += trip.getRevenue();
                if (highestUrbanTrip == null || trip.getRevenue() > highestUrbanTrip.getRevenue()) {
                    highestUrbanTrip = trip;
                }
            } else {
                totalIntercityRevenue += trip.getRevenue();
                if (highestIntercityTrip == null || trip.getRevenue() > highestIntercityTrip.getRevenue()) {
                    highestIntercityTrip = trip;
                }
            }
        }

        System.out.println("Total urban trip revenue: " + totalUrbanRevenue);
        System.out.println("Total intercity trip revenue: " + totalIntercityRevenue);

        System.out.println("Highest revenue urban trip: ");
        if (highestUrbanTrip != null)
            highestUrbanTrip.display();

        System.out.println("Highest revenue intercity trip: ");
        if (highestIntercityTrip != null)
            highestIntercityTrip.display();

        sc.close();
    }
}
