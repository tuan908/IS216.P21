package th.p2.bai1;

import java.util.Scanner;

public class Bai1 {

    Boolean laSoNguyenTo() {
        var ok = true;
        try (var sc = new Scanner(System.in)) {
            int n;
            System.err.print("Nhap n: ");
            n = sc.nextInt();

            for (int i = 2; i < n - 1; i++) { // n là số nguyên dương nhập từ bàn phím
                if (n % i == 0) { // n chia hết cho I
                    ok = false;
                    break;
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        return ok;
    }

    public static void main(String[] args) {

    }
}
