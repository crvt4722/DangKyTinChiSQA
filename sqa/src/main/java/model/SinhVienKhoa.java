package model;

public class SinhVienKhoa {
	private Integer id;
	private String nienKhoa;
	private int danghoc;
	
	private SinhVien sinhvien;
	private Khoa khoa;
	
	public SinhVienKhoa() {}
	
	public SinhVienKhoa(Integer id, String nienKhoa, int danghoc, SinhVien sinhvien, Khoa khoa) {
		this.id = id;
		this.nienKhoa = nienKhoa;
		this.danghoc = danghoc;
		this.sinhvien = sinhvien;
		this.khoa = khoa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNienKhoa() {
		return nienKhoa;
	}

	public void setNienKhoa(String nienKhoa) {
		this.nienKhoa = nienKhoa;
	}

	public int getDanghoc() {
		return danghoc;
	}

	public void setDanghoc(int danghoc) {
		this.danghoc = danghoc;
	}

	public SinhVien getSinhvien() {
		return sinhvien;
	}

	public void setSinhvien(SinhVien sinhvien) {
		this.sinhvien = sinhvien;
	}

	public Khoa getKhoa() {
		return khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	@Override
	public String toString() {
		return "SinhVienKhoa [id=" + id + ", nienKhoa=" + nienKhoa + ", danghoc=" + danghoc + ", sinhvien=" + sinhvien
				+ ", khoa=" + khoa + "]";
	}	

}
