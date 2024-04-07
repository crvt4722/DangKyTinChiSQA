package model;

public class NhanVien {
	private ThanhVien thanhVien;
	private String vitri;
	
	public NhanVien() {}
	
	public NhanVien(ThanhVien thanhVien, String vitri) {
		this.thanhVien = thanhVien;
		this.vitri = vitri;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	public String getVitri() {
		return vitri;
	}

	public void setVitri(String vitri) {
		this.vitri = vitri;
	}

	@Override
	public String toString() {
		return "NhanVien [thanhVien=" + thanhVien + ", vitri=" + vitri + "]";
	}

}
