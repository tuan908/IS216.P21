package bai01;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    TaiKhoan t1 = new TaiKhoan();
    TaiKhoan t2 = new TaiKhoan();

    try (Scanner sc = new Scanner(System.in)) {
      t1.input(sc);
      t2.input(sc);
      t1.chuyenKhoan(t2, 100000);
      t1.inTaiKhoan();
      t2.inTaiKhoan();
    }
  }
}
