package bai02;

import java.util.Scanner;

public class SachTrinhTham extends Sach {
  private double thue;

  public SachTrinhTham() {
    super();
  }

  public SachTrinhTham(long ma, String ten, double dG, int sL, String nxb, double thue) {
    super(ma, ten, dG, sL, nxb);
    this.thue = thue;
  }


  public double getThue() {
    return thue;
  }

  public void setThue(double thue) {
    this.thue = thue;
  }

  @Override
  public void thongTinSach() {
    super.thongTinSach();
    System.out.println("Thue: " + this.getThue());
  }

  @Override
  public double thanhTien() {
    return super.thanhTien() + this.getThue();
  }

  @Override
  public void input() {
    super.input();
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap thue: ");
    this.thue = sc.nextDouble();
  }
}
