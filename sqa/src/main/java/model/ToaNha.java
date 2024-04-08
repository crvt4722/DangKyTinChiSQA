package model;

public class ToaNha {
	private Integer id;
	private String mota;
	private Truong truong;

	public ToaNha() {
	}
	
	public ToaNha(Integer id, String mota, Truong truong) {
		this.id = id;
		this.mota = mota;
		this.truong = truong;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "ToaNha [id=" + id + ", mota=" + mota + ", truong=" + truong + "]";
	}
}
