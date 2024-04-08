package model;

public class Truong {
	private int id;
	private int ten,moTa;
	public Truong(int id, int ten, int moTa) {
		this.id = id;
		this.ten = ten;
		this.moTa = moTa;
	}
	public Truong() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTen() {
		return ten;
	}
	public void setTen(int ten) {
		this.ten = ten;
	}
	public int getMoTa() {
		return moTa;
	}
	public void setMoTa(int moTa) {
		this.moTa = moTa;
	}
	
}
