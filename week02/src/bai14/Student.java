package bai14;

class Xe {
    private String tenChuXe;
    private String loaiXe;
    private double triGiaXe;
    private int dungTichXyLanh;

    public Xe(String tenChuXe, String loaiXe, double triGiaXe, int dungTichXyLanh) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.triGiaXe = triGiaXe;
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public double tinhThue() {
        if (dungTichXyLanh < 100) {
            return triGiaXe * 0.01;
        } else if (dungTichXyLanh <= 175) {
            return triGiaXe * 0.03;
        } else {
            return triGiaXe * 0.05;
        }
    }

    public void display() {
        System.out.printf("%-20s %-15s %12.2f %10d %12.2f\n", tenChuXe, loaiXe, triGiaXe, dungTichXyLanh, tinhThue());
    }
}