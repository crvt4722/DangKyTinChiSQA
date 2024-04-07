package model;

public class Truong {
	private Integer id;
	private String mota;
	
	private DiaChi diachi;

	public Truong() {
	}

	public Truong(Integer id, String mota, DiaChi diachi) {
		this.id = id;
		this.mota = mota;
		this.diachi = diachi;
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

	public DiaChi getDiachi() {
		return diachi;
	}

	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}

	@Override
	public String toString() {
		return "Truong [id=" + id + ", mota=" + mota + ", diachi=" + diachi + "]";
	}

	
	
}
