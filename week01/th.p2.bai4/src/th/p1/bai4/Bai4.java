package th.p1.bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input matrix size: ");
        int n = sc.nextInt();

        TwoDimensionArray arr = new TwoDimensionArray(n);
        arr.input(sc);

        arr.output();

        System.out.println("Minimum value in matrix: " + arr.getMinValue());

        arr.sortEachRow();
        arr.sortDiagonal();

        sc.close();
    }
}
