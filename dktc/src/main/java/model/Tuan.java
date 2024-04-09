package model;

public class Tuan {
	private int id;
	private String ten ,moTa;
	public Tuan(int id, String ten, String moTa) {
		this.id = id;
		this.ten = ten;
		this.moTa = moTa;
	}
	public Tuan() {
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
	
	
}
