package bai02;

import java.util.Scanner;

public class SachTieuThuyet extends Sach {
  private Boolean tinhTrang;

  public SachTieuThuyet() {
    super();
  }

  public SachTieuThuyet(long ma, String ten, double dG, int sL, String nxb, Boolean tTrang) {
    super(ma, ten, dG, sL, nxb);
    this.tinhTrang = tTrang;
  }

  public Boolean getTinhTrang() {
    return tinhTrang;
  }

  public void setTinhTrang(Boolean tinhTrang) {
    this.tinhTrang = tinhTrang;
  }

  @Override
  public void thongTinSach() {
    super.thongTinSach();

    if (this.tinhTrang == true)
      System.out.println("Tinh trang sach: Moi");
    System.out.println("Tinh trang: Cu");
  }

  @Override
  public double thanhTien() {
    if (this.tinhTrang == true)
      return super.thanhTien();
    return super.thanhTien() * 0.2;
  }
  
  @Override
  public void input() {
    super.input();
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap tinh trang (moi = true, cu = false): ");
    this.tinhTrang = sc.nextBoolean();
  }
}
