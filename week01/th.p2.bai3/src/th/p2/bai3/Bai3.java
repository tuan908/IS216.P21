package th.p2.bai3;

import java.util.Scanner;

public class Bai3 {
public static void main(String[] args) {
    var sc = new Scanner(System.in);
    var arr = new OneDimensionArray();
    arr.input(sc);
    arr.getMaxMin();
    arr.isXExist(sc);
    arr.countElementEqualX(sc);
    arr.sort();
    arr.output();

    sc.close();
}
}
