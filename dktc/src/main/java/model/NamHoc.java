package model;

public class NamHoc {
	private int id;
	private String ten,mota;
	public NamHoc(int id, String ten, String mota) {
		this.id = id;
		this.ten = ten;
		this.mota = mota;
	}
	public NamHoc() {
		
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
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	
}
