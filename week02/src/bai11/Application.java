package bai11;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        var p1 = new Point();
        var p2 = new Point();

        try (Scanner sc = new Scanner(System.in)) {
            p1.input(sc);
            p2.input(sc);
            p1.output();
            p2.output();

            System.out.print("Khoang cach giua diem 1 va 2: " + p1.tinhKhoangCach(p2));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
