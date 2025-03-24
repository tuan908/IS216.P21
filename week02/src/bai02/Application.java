package bai02;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    List<Sach> books = new ArrayList<>();
    Sach tt1 = new SachTieuThuyet();
    tt1.input();
    books.add(tt1);

    Sach tt2 = new SachTieuThuyet();
    tt2.input();
    books.add(tt2);

    Sach trinhTham1 = new SachTrinhTham();
    trinhTham1.input();
    books.add(trinhTham1);

    double balance1 = 0, balance2 = 0;

    for (Sach s : books) {
      if (s instanceof SachTieuThuyet s1) {
        balance1 += s1.thanhTien();
      }

      if (s instanceof SachTrinhTham s2) {
        balance2 += s2.thanhTien();
      }
    }

    for (var s : books) {
      s.thongTinSach();
    }

    System.out.println("Thanh tien sach tieu thuyet: " + balance1);
    System.out.println("Thanh tien sach trinh tham: " + balance2);
  }
}
