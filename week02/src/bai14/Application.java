package bai14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Xe> danhSachXe = new ArrayList<>();

        // Nhập danh sách xe
        while (true) {
            System.out.print("Nhập tên chủ xe (Nhấn Enter để kết thúc): ");
            String tenChuXe = sc.nextLine();
            if (tenChuXe.isEmpty()) {
                break;
            }

            System.out.print("Nhập loại xe: ");
            String loaiXe = sc.nextLine();
            System.out.print("Nhập trị giá xe: ");
            double triGiaXe = sc.nextDouble();
            System.out.print("Nhập dung tích xy lanh: ");
            int dungTichXyLanh = sc.nextInt();
            sc.nextLine(); // Xóa bộ nhớ đệm

            danhSachXe.add(new Xe(tenChuXe, loaiXe, triGiaXe, dungTichXyLanh));
        }

        // Xuất bảng kê khai thuế
        System.out.println("\nBảng kê khai thuế:");
        System.out.printf("%-20s %-15s %12s %10s %12s\n", "Tên Chủ Xe", "Loại Xe", "Trị Giá", "Dung Tích", "Thuế");
        System.out.println("------------------------------------------------------------------");
        for (Xe xe : danhSachXe) {
            xe.display();
        }

        // Tìm thuế phải đóng theo chủ xe và loại xe
        System.out.print("\nNhập tên chủ xe cần tra cứu: ");
        String tenChuXeTraCuu = sc.nextLine();
        System.out.print("Nhập loại xe: ");
        String loaiXeTraCuu = sc.nextLine();
        boolean found = false;

        for (Xe xe : danhSachXe) {
            if (xe.getTenChuXe().equalsIgnoreCase(tenChuXeTraCuu) && xe.getLoaiXe().equalsIgnoreCase(loaiXeTraCuu)) {
                System.out.printf("Thuế phải đóng của %s với xe %s là: %.2f\n", tenChuXeTraCuu, loaiXeTraCuu, xe.tinhThue());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy thông tin xe phù hợp.");
        }

        sc.close();
    }
}
