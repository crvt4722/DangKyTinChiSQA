package model;

public class BoMon {
	private int id;
	private String ten,moTa;
	private Khoa khoa;
	public BoMon(int id, String ten, String moTa, Khoa khoa) {
		super();
		this.id = id;
		this.ten = ten;
		this.moTa = moTa;
		this.khoa = khoa;
	}
	public BoMon() {
		super();
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
	public Khoa getKhoa() {
		return khoa;
	}
	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}
	
}	
