package bai12;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        var p1 = new HinhChuNhat();

        try (Scanner sc = new Scanner(System.in)) {
            p1.input(sc);
            System.out.println(p1.toString());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
