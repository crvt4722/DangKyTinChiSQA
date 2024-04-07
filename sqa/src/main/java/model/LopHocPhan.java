package model;

public class LopHocPhan {
	private Integer id;
	private String ten;
	private int sisotoida;
	private String mota;
	private MonHocKiHoc monHocKiHoc;
	
	public LopHocPhan() {}
	
	public LopHocPhan(Integer id, String ten, int sisotoida, String mota, MonHocKiHoc monHocKiHoc) {
		this.id = id;
		this.ten = ten;
		this.sisotoida = sisotoida;
		this.mota = mota;
		this.monHocKiHoc = monHocKiHoc;
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

	public int getSisotoida() {
		return sisotoida;
	}

	public void setSisotoida(int sisotoida) {
		this.sisotoida = sisotoida;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public MonHocKiHoc getMonHocKiHoc() {
		return monHocKiHoc;
	}

	public void setMonHocKiHoc(MonHocKiHoc monHocKiHoc) {
		this.monHocKiHoc = monHocKiHoc;
	}

	@Override
	public String toString() {
		return "LopHocPhan [id=" + id + ", ten=" + ten + ", sisotoida=" + sisotoida + ", mota=" + mota
				+ ", monHocKiHoc=" + monHocKiHoc + "]";
	}
}
