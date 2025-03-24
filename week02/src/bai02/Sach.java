package bai02;

import java.util.Scanner;

public abstract class Sach {
  private long maSach;
  private String tenSach;
  private double donGia;
  private int soLuong;
  private String nxb;

  public Sach() {}

  public Sach(long ms, String ts, double dg, int sl, String nxb) {
    this.maSach = ms;
    this.tenSach = ts;
    this.donGia = dg;
    this.soLuong = sl;
    this.nxb = nxb;
  }

  public long getMaSach() {
    return maSach;
  }

  public void setMaSach(long maSach) {
    this.maSach = maSach;
  }

  public String getTenSach() {
    return tenSach;
  }

  public void setTenSach(String tenSach) {
    this.tenSach = tenSach;
  }

  public double getDonGia() {
    return donGia;
  }

  public void setDonGia(double donGia) {
    this.donGia = donGia;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(int soLuong) {
    this.soLuong = soLuong;
  }

  public String getNxb() {
    return nxb;
  }

  public void setNxb(String nxb) {
    this.nxb = nxb;
  }

  public void thongTinSach() {
    System.out.println("Ma sach: " + this.maSach);
    System.out.println("Ten sach: " + this.tenSach);
    System.out.println("Don gia sach: " + this.donGia);
    System.out.println("So luong sach: " + this.soLuong);
    System.out.println("NXB: " + this.nxb);
  }

  public double thanhTien() {
    return this.getSoLuong() * this.getDonGia();
  }

  public void input() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap Ma sach: ");
    this.maSach = sc.nextLong();
    sc.nextLine(); // Consume the newline character

    System.out.print("Nhap ten sach: ");
    this.tenSach = sc.nextLine();

    System.out.print("Nhap don gia sach: ");
    this.donGia = sc.nextDouble();
    sc.nextLine(); // Consume the newline character

    System.out.print("Nhap so luong sach: ");
    this.soLuong = sc.nextInt();
    sc.nextLine(); // Consume the newline character

    System.out.print("Nhap NXB: ");
    this.nxb = sc.nextLine();
  }

}
