package th.p1.bai2;

import java.util.Scanner;

public class THP1Bai2 {
    static double tinhThuong(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a;
            double b;

            System.out.print("Nhap so thu nhat: ");
            a = sc.nextDouble();

            System.out.print("Nhap so thu hai: ");
            b = sc.nextDouble();

            if (b == 0) {
                System.out.print("So thu hai khong hop le, moi nhap lai!");
                System.out.print("Nhap lai so thu hai");
                b = sc.nextDouble();
            }

            System.out.print("Thuong cua a va b: " + tinhThuong(a, b));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
