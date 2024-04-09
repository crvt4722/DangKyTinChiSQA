package model;

public class SinhVienKhoa {
	private int id;
	private String nienKhoa;
	private int dangHoc;
	private Khoa khoa;
	private SinhVien sinhVien;
	public SinhVienKhoa(int id, String nienKhoa, int dangHoc, Khoa khoa, SinhVien sinhVien) {
		this.id = id;
		this.nienKhoa = nienKhoa;
		this.dangHoc = dangHoc;
		this.khoa = khoa;
		this.sinhVien = sinhVien;
	}
	public SinhVienKhoa() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNienKhoa() {
		return nienKhoa;
	}
	public void setNienKhoa(String nienKhoa) {
		this.nienKhoa = nienKhoa;
	}
	public int getDangHoc() {
		return dangHoc;
	}
	public void setDangHoc(int dangHoc) {
		this.dangHoc = dangHoc;
	}
	public Khoa getKhoa() {
		return khoa;
	}
	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}
	public SinhVien getSinhVien() {
		return sinhVien;
	}
	public void setSinhVien(SinhVien sinhVien) {
		this.sinhVien = sinhVien;
	}
	
	
}
