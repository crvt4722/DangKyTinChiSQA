package model;

public class SinhVien {
	private ThanhVien thanhVien;
	private String masv;
	
	public SinhVien() {}
	
	public SinhVien(ThanhVien thanhVien, String masv) {
		super();
		this.thanhVien = thanhVien;
		this.masv = masv;
	}




	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	@Override
	public String toString() {
		return "SinhVien [thanhVien=" + thanhVien + ", masv=" + masv + "]";
	}
	
	
}
