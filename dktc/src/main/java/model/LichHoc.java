package model;

public class LichHoc {
	private int id;
	private String ten,moTa;
	private PhongHoc phongHoc;
	private KipHoc kip;
	private Ngay ngay;
	private Tuan tuan;
	private GiangVien giangVien;
	private LopHocPhan lopHP;
	public LichHoc(int id, String ten, String moTa, PhongHoc phongHoc, KipHoc kip, Ngay ngay, Tuan tuan,
			GiangVien giangVien, LopHocPhan lopHP) {
		this.id = id;
		this.ten = ten;
		this.moTa = moTa;
		this.phongHoc = phongHoc;
		this.kip = kip;
		this.ngay = ngay;
		this.tuan = tuan;
		this.giangVien = giangVien;
		this.lopHP = lopHP;
	}
	public LichHoc() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public PhongHoc getPhongHoc() {
		return phongHoc;
	}
	public void setPhongHoc(PhongHoc phongHoc) {
		this.phongHoc = phongHoc;
	}
	public KipHoc getKip() {
		return kip;
	}
	public void setKip(KipHoc kip) {
		this.kip = kip;
	}
	public Ngay getNgay() {
		return ngay;
	}
	public void setNgay(Ngay ngay) {
		this.ngay = ngay;
	}
	public Tuan getTuan() {
		return tuan;
	}
	public void setTuan(Tuan tuan) {
		this.tuan = tuan;
	}
	public GiangVien getGiangVien() {
		return giangVien;
	}
	public void setGiangVien(GiangVien giangVien) {
		this.giangVien = giangVien;
	}
	public LopHocPhan getLopHP() {
		return lopHP;
	}
	public void setLopHP(LopHocPhan lopHP) {
		this.lopHP = lopHP;
	}
	
	
	
}
