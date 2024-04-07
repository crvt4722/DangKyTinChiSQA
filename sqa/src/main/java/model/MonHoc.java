package model;

public class MonHoc {
	private Integer id;
	private String ten;
	private int sotc;
	private String mota;
	private BoMon bomon;
	
	public MonHoc() {}
	
	public MonHoc(Integer id, String ten, int sotc, String mota, BoMon bomon) {
		this.id = id;
		this.ten = ten;
		this.sotc = sotc;
		this.mota = mota;
		this.bomon = bomon;
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

	public int getSotc() {
		return sotc;
	}

	public void setSotc(int sotc) {
		this.sotc = sotc;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public BoMon getBomon() {
		return bomon;
	}

	public void setBomon(BoMon bomon) {
		this.bomon = bomon;
	}

	@Override
	public String toString() {
		return "MonHoc [id=" + id + ", ten=" + ten + ", sotc=" + sotc + ", mota=" + mota + ", bomon=" + bomon + "]";
	}
}
