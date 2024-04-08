package model;

public class KipHoc {
	private int id;
	private String ten ,moTa;
	public KipHoc(int id, String ten, String moTa) {
		this.id = id;
		this.ten = ten;
		this.moTa = moTa;
	}
	public KipHoc() {
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
