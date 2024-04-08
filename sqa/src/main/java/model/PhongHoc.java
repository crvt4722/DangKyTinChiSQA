package model;

public class PhongHoc {
	private Integer id;
	private String ten;
	private String succhua;
	private String mota;
	private ToaNha toaNha;
	
	public PhongHoc() {
	}

	public PhongHoc(Integer id, String ten, String succhua, String mota, ToaNha toaNha) {
		this.id = id;
		this.ten = ten;
		this.succhua = succhua;
		this.mota = mota;
		this.toaNha = toaNha;
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

	public String getSucchua() {
		return succhua;
	}

	public void setSucchua(String succhua) {
		this.succhua = succhua;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public ToaNha getToaNha() {
		return toaNha;
	}

	public void setToaNha(ToaNha toaNha) {
		this.toaNha = toaNha;
	}

	@Override
	public String toString() {
		return "PhongHoc [id=" + id + ", ten=" + ten + ", succhua=" + succhua + ", mota=" + mota + ", toaNha=" + toaNha
				+ "]";
	}
}
