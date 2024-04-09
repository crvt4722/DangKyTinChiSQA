package model;

public class MonHoc {
	private int id;
	private String ten;
	private int stc;
	private String moTa;
	private BoMon boMon;
	public MonHoc(int id, String ten, int stc, String moTa, BoMon boMon) {
		super();
		this.id = id;
		this.ten = ten;
		this.stc = stc;
		this.moTa = moTa;
		this.boMon = boMon;
	}
	public MonHoc() {
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
	public int getStc() {
		return stc;
	}
	public void setStc(int stc) {
		this.stc = stc;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public BoMon getBoMon() {
		return boMon;
	}
	public void setBoMon(BoMon boMon) {
		this.boMon = boMon;
	}
	
}
