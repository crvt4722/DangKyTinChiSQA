package model;

public class GiangVien {
	private ThanhVien thanhVien;
	private BoMon bomon;
	
	public GiangVien() {}
	
	public GiangVien(ThanhVien thanhVien, BoMon bomon) {
		this.thanhVien = thanhVien;
		this.bomon = bomon;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	public BoMon getBomon() {
		return bomon;
	}

	public void setBomon(BoMon bomon) {
		this.bomon = bomon;
	}

	@Override
	public String toString() {
		return "GiangVien [thanhVien=" + thanhVien + ", bomon=" + bomon + "]";
	}
	
}
