package bai01;

import java.util.Scanner;

public class TaiKhoan {
  private long soTk;
  private String tenTk;
  private double soTien;

  public TaiKhoan() {}

  public TaiKhoan(long stk, String tenTk, double balance) {
    this.soTk = stk;
    this.tenTk = "";
    this.soTien = balance;
  }

  public long getSoTk() {
    return soTk;
  }

  public void setSoTk(long soTk) {
    this.soTk = soTk;
  }

  public String getTenTk() {
    return tenTk;
  }

  public void setTenTk(String tenTk) {
    this.tenTk = tenTk;
  }

  public double getSoTien() {
    return soTien;
  }

  public void setSoTien(double soTien) {
    this.soTien = soTien;
  }

  public void input(Scanner sc) {
    System.out.print("Nhap so tai khoan: ");
    this.soTk = sc.nextLong();
    System.out.print("Nhap ten tai khoan: ");
    this.tenTk = sc.nextLine();
    System.out.print("Nhap so du tai khoan: ");
    this.soTien = sc.nextDouble();
  }

  public void inTaiKhoan() {
    System.out.println("So tai khoan: " + this.getSoTk());
    System.out.println("Ten tai khoan: " + this.getTenTk());
    System.out.println("So du tai khoan: " + this.getSoTien());
  }

  public boolean napTien(double st) {
    this.soTien += st;
    return true;
  }

  public boolean chuyenKhoan(TaiKhoan a, double st) {
    if (this.getSoTien() == 0 || st > this.getSoTien())
      return false;
    this.setSoTien(this.getSoTien() - st);
    a.setSoTien(a.getSoTien() + st);
    return true;
  }
}
