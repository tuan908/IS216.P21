package th.p2.bai3;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionArray {
    private int n;
    private int[] elements;

    public OneDimensionArray() {
        super();
        this.n = 0;
        this.elements = new int[0];
    }

    public OneDimensionArray(int n) {
        super();
        this.n = n;
        this.elements = new int[n];
    }

    public int getN() {
        return n;
    }

    public int[] getElements() {
        return elements;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap kich thuoc mang: ");
        this.n = sc.nextInt();
        this.elements = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            this.elements[i] = sc.nextInt();
        }
    }

    public void output() {
        System.out.print("Elements: " + Arrays.toString(this.elements));
    }

    public void getMaxMin() {
        var max = this.elements[0];
        var min = this.elements[0];
        for (var i = 0; i < n; i++) {
            max = Math.max(max, this.elements[i]);
            min = Math.min(min, this.elements[i]);
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }

    public void isXExist(Scanner sc) {

        int x;
        System.err.print("Nhap x: ");
        x = sc.nextInt();
        this.sort();
        var ans = Arrays.binarySearch(elements, x);
        if (ans < 0) {
            System.out.println(x + " does not exist");
        } else {
            System.out.println(x + " exists");
        }

    }

    public void countElementEqualX(Scanner sc) {

        int x;
        System.err.print("Nhap x: ");
        x = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (this.elements[i] == x) {
                count++;
            }
        }

        System.out.println("So phan tu co gia tri bang x: " + count);

    }

    public void sort() {
        Arrays.sort(this.elements);
    }
}
