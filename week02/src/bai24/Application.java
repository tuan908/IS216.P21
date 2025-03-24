package bai24;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motorbike bike = new Motorbike(5);
        Truck truck = new Truck(50);

        bike.addCargo(20);
        truck.addCargo(500);

        bike.drive(50);
        truck.drive(100);

        bike.displayFuel();
        truck.displayFuel();

        sc.close();
    }
}
