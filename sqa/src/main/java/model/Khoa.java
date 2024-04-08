package model;

public class Khoa {
	private Integer id;
	private String ten;
	private String mota;
	private Truong truong;

	public Khoa() {}
	
	public Khoa(Integer id, String ten, String mota, Truong truong) {
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.truong = truong;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Truong getTruong() {
		return truong;
	}

	public void setTruong(Truong truong) {
		this.truong = truong;
	}

	@Override
	public String toString() {
		return "Khoa [id=" + id + ", ten=" + ten + ", mota=" + mota + ", truong=" + truong + "]";
	}
	
}
