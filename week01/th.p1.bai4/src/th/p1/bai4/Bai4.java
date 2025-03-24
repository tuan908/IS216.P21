package th.p1.bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        String x, y;
        try (var sc = new Scanner(System.in)) {
            System.out.print("Nhap x");
            x = sc.nextLine();

            System.out.print("Nhap x");
            y = sc.nextLine();

            System.out.print("Tong chieu dai chuoi x: " + StringUtils.getLength(x));
            System.out.print("3 ki tu dau tien cua chuoi x: " + StringUtils.firstThreeCharacters(x));
            System.out.print("3 ki tu cuoi chuoi x: " + StringUtils.lastThreeCharacters(x));
            System.out.print("Chuoi ket hop: " + StringUtils.concatFromXAndY(x, y));
            System.out.print("2 chuoi x y bang nhau: " + StringUtils.isXYEquals(x, y));
            System.out.print(
                    "2 chuoi x y bang nhau khong phan biet hoa thuong: " + StringUtils.isXYEqualsIgnoreCase(x, y));
            System.out.print("Y xuat hien trong x tai vi tri nao: " + StringUtils.isYExistsInX(x, y));
            System.out.print("Vi tri y trong x" + StringUtils.getAllYPositionInX(x, y));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
