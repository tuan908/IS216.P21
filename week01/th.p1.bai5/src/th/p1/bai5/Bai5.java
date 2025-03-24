package th.p1.bai5;

import java.util.Scanner;

public class Bai5 {

    static float tinhGiaDien(float soDien) {
        if (soDien <= 50) {
            return soDien * 2000;
        } else if (soDien > 50 && soDien <= 100) {
            return (50 * 2000) + (soDien - 50) * 2500;
        } else {
            return 50 * 2000 + (soDien - 50) * 3500;
        }
    }

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            float soDien;

            System.out.print("Nhap so dien: ");
            soDien = sc.nextFloat();

            System.out.print("Tien dien: " + tinhGiaDien(soDien));

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
