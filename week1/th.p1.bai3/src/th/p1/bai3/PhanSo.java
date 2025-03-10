package th.p1.bai3;

import java.util.Scanner;

class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        super();
    }

    public PhanSo(int tuSo, int mauSo) {
        super();
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo add(PhanSo ps) {
        int tuSo = this.getTuSo() * ps.getMauSo() + this.getMauSo() * ps.getTuSo();
        int mauSo = this.getMauSo() * ps.getMauSo();
        return new PhanSo(tuSo, mauSo);
    }

    public PhanSo subtract(PhanSo ps) {
        int tuSo = this.getTuSo() * ps.getMauSo() - this.getMauSo() * ps.getTuSo();
        int mauSo = this.getMauSo() * ps.getMauSo();
        return new PhanSo(tuSo, mauSo);
    }

    public PhanSo time(PhanSo ps) {
        int tuSo = this.getTuSo() * ps.getMauSo();
        int mauSo = this.getMauSo() * ps.getMauSo();
        return new PhanSo(tuSo, mauSo);
    }

    public PhanSo division(PhanSo ps) {
        int tuSo = this.getTuSo() * ps.getMauSo();
        int mauSo = this.getMauSo() * ps.getTuSo();
        return new PhanSo(tuSo, mauSo);
    }

    public void input(Scanner sc) {
        System.out.print("Nhap tu so: ");
        this.tuSo = sc.nextInt();

        System.out.print("Nhap mau so: ");

        this.mauSo = sc.nextInt();

        do {
            System.out.print("Mau so bang 0, hay nhap lai!");
            this.mauSo = sc.nextInt();
        } while (this.mauSo == 0);

    }

    void output() {
        System.out.print(this.tuSo + "/" + this.mauSo);
    }
}