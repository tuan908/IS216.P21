package th.p2.bai2;

public class Bai2 {
    public static void main(String[] args) {
        int size = 10; // Kích thước bảng nhân (10x10)

        System.out.println("Bảng tính Pythagoras:");

        // In tiêu đề cột
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n" + "    " + "-".repeat(size * 4));

        // In nội dung bảng nhân
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i); // In tiêu đề hàng
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j); // In kết quả phép nhân
            }
            System.out.println();
        }
    }
}
