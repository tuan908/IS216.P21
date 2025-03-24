package th.p1.bai1;

import java.util.Scanner;

public class THP1Bai1 {
	static double tinhChuViDuongTron(double r) {
		return 2 * r * Math.PI;
	}

	public static void main(String[] args) {
		try (Scanner scanIn = new Scanner(System.in)) {
			double r = 0;
			System.out.print("Nhap ban kinh: ");
			r = scanIn.nextDouble();
			System.out.print("Chu vi: " + tinhChuViDuongTron(r));
		}
	}
}
