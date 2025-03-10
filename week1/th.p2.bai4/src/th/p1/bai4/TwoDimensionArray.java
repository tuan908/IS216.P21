package th.p1.bai4;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArray {
    private int n;
    private int[][] matrix;

    public TwoDimensionArray(int n) {
        this.n = n;
        this.matrix = new int[n][n];
    }

    // Nhập mảng từ bàn phím
    public void input(Scanner sc) {
        System.out.println("Input matrix size " + n + "x" + n + ": ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Input element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Xuất mảng 2 chiều ra màn hình
    public void output() {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%8d", num);
            }
            System.out.println();
        }
    }

    // Tìm giá trị nhỏ nhất trong mảng 2 chiều
    public int getMinValue() {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int num : row) {
                min = Math.min(min, num);
            }
        }
        return min;
    }

    // Sắp xếp các phần tử trên từng dòng tăng dần
    public void sortEachRow() {
        for (int i = 0; i < n; i++) {
            Arrays.sort(matrix[i]);
        }
        System.out.println("Matrix after sorting line by line:");
        output();
    }

    // Sắp xếp đường chéo chính tăng dần
    public void sortDiagonal() {
        int[] diagonal = new int[n];

        // Lưu đường chéo chính vào mảng tạm
        for (int i = 0; i < n; i++) {
            diagonal[i] = matrix[i][i];
        }

        // Sắp xếp mảng đường chéo chính
        Arrays.sort(diagonal);

        // Gán lại vào ma trận
        for (int i = 0; i < n; i++) {
            matrix[i][i] = diagonal[i];
        }

        System.out.println("Matrix after sorting by diagonal:");
        output();
    }


}
