package model;

public class Khoa {
	private int id;
	private String ten,moTa;
	private Truong truong;
	public Khoa(int id, String ten, String moTa, Truong truong) {
		this.id = id;
		this.ten = ten;
		this.moTa = moTa;
		this.truong = truong;
	}
	public Khoa() {
		
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
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	
	
}
