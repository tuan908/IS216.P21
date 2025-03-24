package bai12;

import java.util.Scanner;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;

	public HinhChuNhat(double x, double y) {
		this.chieuDai = x;
		this.chieuRong = y;
	}

	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double x) {
		this.chieuDai = x;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double y) {
		this.chieuRong = y;
	}

	void output() {
		System.out.println("Chieu dai: " + chieuDai);
		System.out.println("Chieu rong: " + chieuRong);
	}

	public void input(Scanner sc) {
		System.out.print("Nhap chieu dai: ");
		this.chieuDai = sc.nextDouble();

		System.out.print("Nhap chieu rong: ");
		this.chieuRong = sc.nextDouble();
	}

	public double tinhChuVi() {
		return this.getChieuDai() + this.getChieuRong();
	}

	public double tinhDienTich() {
		return this.getChieuDai() * this.getChieuRong();
	}

	@Override
	public String toString() {
		return "HinhChuNhat [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", chuVi=" + tinhChuVi()
				+ ", dienTich=" + tinhDienTich() + "]";
	}

}
