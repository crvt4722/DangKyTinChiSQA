package model;

public class KiHoc {
	private int id, danghoc,dangdk;
	private NamHoc namHoc;
	private HocKi hocKi;
	
	public KiHoc() {
	}
	public KiHoc(int id, int danghoc, int dangdk, NamHoc namHoc, HocKi hocKi) {
		this.id = id;
		this.danghoc = danghoc;
		this.dangdk = dangdk;
		this.namHoc = namHoc;
		this.hocKi = hocKi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public NamHoc getNamHoc() {
		return namHoc;
	}
	public void setNamHoc(NamHoc namHoc) {
		this.namHoc = namHoc;
	}
	public HocKi getHocKi() {
		return hocKi;
	}
	public void setHocKi(HocKi hocKi) {
		this.hocKi = hocKi;
	}
	
	
}
