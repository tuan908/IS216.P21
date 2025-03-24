package bai13;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ": ");
            System.out.print("Ma sinh vien: ");
            String maSV = sc.nextLine();
            System.out.print("Ho ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Diem Ly thuyet: ");
            float diemLT = sc.nextFloat();
            System.out.print("Diem Thuc hanh: ");
            float diemTH = sc.nextFloat();
            sc.nextLine(); // Clear buffer

            students[i] = new Student(maSV, hoTen, diemLT, diemTH);
        }

        System.out.println("\nDanh sach sinh vien:");
        System.out.printf("%-10s %-20s %8s %8s %8s\n", "Mã SV", "Họ tên", "LT", "TH", "TB");
        System.out.println("----------------------------------------------------------");
        for (Student s : students) {
            s.output();
        }

        sc.close();
    }
}
