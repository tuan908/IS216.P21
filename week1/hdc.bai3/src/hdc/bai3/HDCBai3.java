package hdc.bai3;

import java.util.Scanner;

public class HDCBai3 {

	public static void main(String[] args) {
		try (Scanner scanIn = new Scanner(System.in)) {
			String hoTen;
			String diaChi;
			System.out.println("Nhập họ và tên: ");
			hoTen = scanIn.nextLine();
			System.out.println("Nhập địa chỉ: ");
			diaChi = scanIn.nextLine();
			System.out.println("Họ và tên sinh viên: " + hoTen);
			System.out.println("Địa chỉ của sinh viên: " + diaChi);
		}
	}

}
