package bai11;

import java.util.Scanner;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	void output() {
		System.out.println("Hoanh do: " + x);
		System.out.println("Tung do: " + y);
	}

	public void input(Scanner sc) {
		System.out.print("Nhap hoanh do: ");
		this.x = sc.nextDouble();

		System.out.print("Nhap tung do: ");
		this.y = sc.nextDouble();
	}

	public double tinhKhoangCach(Point p2) {
		var x1 = (p2.getX() * p2.getX() - 2 * p2.getX() * this.getX() + this.getX() * this.getX());
		var x2 = (p2.getY() * p2.getY() - 2 * p2.getY() * this.getY() + this.getY() * this.getY());

		return Math.sqrt(x1 + x2);
	}
}
