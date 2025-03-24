package bai23;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Pedion robots: ");
        int a = sc.nextInt();
        System.out.print("Enter number of Zattacker robots: ");
        int b = sc.nextInt();
        System.out.print("Enter number of Carrier robots: ");
        int c = sc.nextInt();

        Robot[] robots = new Robot[a + b + c];
        int index = 0;
        for (int i = 0; i < a; i++) robots[index++] = new Pedion();
        for (int i = 0; i < b; i++) robots[index++] = new Zattacker();
        for (int i = 0; i < c; i++) robots[index++] = new Carrier();

        double totalPedion = 0, totalZattacker = 0, totalCarrier = 0;
        int distance = 10;

        for (Robot robot : robots) {
            double energy = robot.getEnergyConsumption(distance);
            System.out.println(robot.toString() + " - Energy Used: " + energy);

            if (robot instanceof Pedion) totalPedion += energy;
            else if (robot instanceof Zattacker) totalZattacker += energy;
            else if (robot instanceof Carrier) totalCarrier += energy;
        }

        System.out.println("Total Energy Used:");
        System.out.println("Pedion: " + totalPedion);
        System.out.println("Zattacker: " + totalZattacker);
        System.out.println("Carrier: " + totalCarrier);

        double maxEnergy = Math.max(totalPedion, Math.max(totalZattacker, totalCarrier));
        String maxRobotType = maxEnergy == totalPedion ? "Pedion" : maxEnergy == totalZattacker ? "Zattacker" : "Carrier";

        System.out.println("Robot type that used the most energy: " + maxRobotType);
        sc.close();
    }
}
