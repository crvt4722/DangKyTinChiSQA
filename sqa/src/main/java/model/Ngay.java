package model;

public class Ngay {
	private Integer id;
	private String ten;
	private String mota;
	
	public Ngay() {}

	public Ngay(Integer id, String ten, String mota) {
		this.id = id;
		this.ten = ten;
		this.mota = mota;
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

	@Override
	public String toString() {
		return "Ngay [id=" + id + ", ten=" + ten + ", mota=" + mota + "]";
	}
}