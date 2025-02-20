package vn.uit.is216p21.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstJavaApp {

	double tinhChuViDuongTron(double r) {
		return 2 * r * Math.PI;
	}

	double tinhThuong(double a, double b) {
		return a / b;
	}

	class PhanSo {
		private double tuSo;
		private double mauSo;

		public PhanSo() {
			super();
		}

		public PhanSo(double tuSo, double mauSo) {
			super();
			this.tuSo = tuSo;
			this.mauSo = mauSo;
		}

		public double getTuSo() {
			return tuSo;
		}

		public void setTuSo(double tuSo) {
			this.tuSo = tuSo;
		}

		public double getMauSo() {
			return mauSo;
		}

		public void setMauSo(double mauSo) {
			this.mauSo = mauSo;
		}

		public PhanSo tinhTong(PhanSo ps) {
			double tuSo = this.getTuSo() * ps.getMauSo() + this.getMauSo() * ps.getTuSo();
			double mauSo = this.getMauSo() * ps.getMauSo();
			return new PhanSo(tuSo, mauSo);
		}

		public PhanSo tinhHieu(PhanSo ps) {
			double tuSo = this.getTuSo() * ps.getMauSo() - this.getMauSo() * ps.getTuSo();
			double mauSo = this.getMauSo() * ps.getMauSo();
			return new PhanSo(tuSo, mauSo);
		}

		public PhanSo tinhTich(PhanSo ps) {
			double tuSo = this.getTuSo() * ps.getMauSo();
			double mauSo = this.getMauSo() * ps.getMauSo();
			return new PhanSo(tuSo, mauSo);
		}

		public PhanSo tinhThuong(PhanSo ps) {
			double tuSo = this.getTuSo() * ps.getMauSo();
			double mauSo = this.getMauSo() * ps.getTuSo();
			return new PhanSo(tuSo, mauSo);
		}

	}

	int tinhTongChieuDaiChuoi(String x) {
		return x.length();
	}

	String firstThreeCharacters(String x) {
		return x.substring(0, 3);
	}

	String lastThreeCharacters(String x) {
		return x.substring(x.length() - 4, 3);
	}

	String characterAtSixthPosition(String x) {
		if (x.length() < 6)
			return "Invalid string";
		else
			return Character.toString(x.charAt(6));
	}

	String concatFromXAndY(String x, String y) {
		return firstThreeCharacters(x) + lastThreeCharacters(y);
	}

	Boolean isXYEquals(String x, String y) {
		return x.equals(y);
	}

	Boolean isXYEqualsIgnoreCase(String x, String y) {
		return x.equalsIgnoreCase(y);
	}

	Integer isYExistsInX(String x, String y) {
		Boolean isExists = x.contains(y);
		if (!isExists)
			return -1;
		else
			return x.indexOf(y);
	}

	String getAllYPositionInX(String x, String y) {
		List<Integer> l = new ArrayList<Integer>();
		
		
		return l.stream().map(String::valueOf).collect(Collectors.joining(", "));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("""
				##################################
				1. Bài 1
				2. Bài 2
				3. Bài 3
				4. Bài 4
				5. Bài 5
				6. Thoát
				##################################
								""");
	}

}
