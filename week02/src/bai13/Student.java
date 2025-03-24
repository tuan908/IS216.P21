package bai13;

import java.util.Scanner;

public class Student {
	private String maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;

	public Student() {
		this.maSV = "";
		this.hoTen = "";
		this.diemLT = 0;
		this.diemTH = 0;
	}

	public Student(String maSV, String ten, float diemLT, float diemTH) {
		this.maSV = maSV;
		this.hoTen = ten;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getTen() {
		return hoTen;
	}

	public void setTen(String ten) {
		this.hoTen = ten;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	void output() {
		System.out.printf("%-10s %-20s %8.2f %8.2f %8.2f\n", maSV, hoTen, diemLT, diemTH, this.getDtb());
	}

	public void input(Scanner sc) {
		System.out.print("Nhap chieu dai: ");
		this.maSV = sc.nextLine();

		System.out.print("Nhap chieu rong: ");
		this.hoTen = sc.nextLine();

		System.out.print("Nhap chieu dai: ");
		this.diemLT = sc.nextFloat();

		System.out.print("Nhap chieu rong: ");
		this.diemTH = sc.nextFloat();
	}

	public float getDtb() {
		return (this.getDiemLT() + this.getDiemTH()) / 2;
	}

}
