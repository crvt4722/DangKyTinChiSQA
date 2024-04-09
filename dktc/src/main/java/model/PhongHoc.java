package model;

public class PhongHoc {
	private int id;
	private String ten;
	private int sucChua;
	private String moTa;
	private ToaNha toaNha;
	public PhongHoc(int id, String ten, int sucChua, String moTa, ToaNha toaNha) {
		this.id = id;
		this.ten = ten;
		this.sucChua = sucChua;
		this.moTa = moTa;
		this.toaNha = toaNha;
	}
	public PhongHoc() {
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
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public ToaNha getToaNha() {
		return toaNha;
	}
	public void setToaNha(ToaNha toaNha) {
		this.toaNha = toaNha;
	}
	
}
