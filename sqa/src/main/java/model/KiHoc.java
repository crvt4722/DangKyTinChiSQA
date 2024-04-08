package model;

public class KiHoc {
	private Integer id;
	private int danghoc;
	private int dangdk;
	private HocKi hocki;
	private NamHoc namhoc;
	
	public KiHoc() {}

	public KiHoc(Integer id, int danghoc, int dangdk, HocKi hocki, NamHoc namhoc) {
		this.id = id;
		this.danghoc = danghoc;
		this.dangdk = dangdk;
		this.hocki = hocki;
		this.namhoc = namhoc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDanghoc() {
		return danghoc;
	}

	public void setDanghoc(int danghoc) {
		this.danghoc = danghoc;
	}

	public int getDangdk() {
		return dangdk;
	}

	public void setDangdk(int dangdk) {
		this.dangdk = dangdk;
	}

	public HocKi getHocki() {
		return hocki;
	}

	public void setHocki(HocKi hocki) {
		this.hocki = hocki;
	}

	public NamHoc getNamhoc() {
		return namhoc;
	}

	public void setNamhoc(NamHoc namhoc) {
		this.namhoc = namhoc;
	}

	@Override
	public String toString() {
		return "KiHoc [id=" + id + ", danghoc=" + danghoc + ", dangdk=" + dangdk + ", hocki=" + hocki + ", namhoc="
				+ namhoc + "]";
	}
}
