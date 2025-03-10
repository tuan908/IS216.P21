package th.p1.bai3;

import java.util.Scanner;

public class THP1Bai3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        PhanSo ps = new PhanSo();
        PhanSo ps1 = new PhanSo();
        ps.input(sc);
        ps1.input(sc);

        var sum = ps.add(ps1);
        System.out.print("Sum: ");
        sum.output();
        sc.close();
    }
}
