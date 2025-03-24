package hdc.bai2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class HDCBai2 {

	static void cach1() {
		// Tạo đối tượng BufferedReader
		BufferedReader nhap = new BufferedReader(new InputStreamReader(System.in));
		String ten = "";
		System.out.print("Nhập tên: ");// Nhập từ bàn phím dùng BufferedReader
		try {
			ten = nhap.readLine();
		} catch (IOException ex) {
			System.out.println("loi");
		}
		// Hiển thị tên
		System.out.println("Hello " + ten + " !");
	}

	static void cach2() {
		try (Scanner scanIn = new Scanner(System.in)) {
			String ten = ""; // Tên
			int tuoi; // Tuổi
			System.out.println("Nhập tên và tuổi: ");
			ten = scanIn.nextLine();
			tuoi = scanIn.nextInt();
			System.out.println("Tên " + ten + "!");
			System.out.println("Tuổi " + tuoi + "!");
		}
	}

	static void cach3() {
		String ten = "";
		ten = JOptionPane.showInputDialog("Please enter your name");
		String msg = "Hello " + ten + " !";
		JOptionPane.showMessageDialog(null, msg);
		System.out.println("Xin chào : " + msg);
	}

	public static void main(String[] args) {
		cach1();
		cach2();
		cach3();
	}

}
