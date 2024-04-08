package model;

public class BoMon {
	private Integer id;
	private String ten;
	private String mota;
	private Khoa khoa;
	
	public BoMon() {}
	
	public BoMon(Integer id, String ten, String mota, Khoa khoa) {
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.khoa = khoa;
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

	public Khoa getKhoa() {
		return khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	@Override
	public String toString() {
		return "BoMon [id=" + id + ", ten=" + ten + ", mota=" + mota + ", khoa=" + khoa + "]";
	}
}
