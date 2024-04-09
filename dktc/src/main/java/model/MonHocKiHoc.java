package model;

public class MonHocKiHoc {
	private int id;
	private MonHoc monHoc;
	private KiHoc kiHoc;
	public MonHocKiHoc(int id, MonHoc monHoc, KiHoc kiHoc) {
		super();
		this.id = id;
		this.monHoc = monHoc;
		this.kiHoc = kiHoc;
	}
	public MonHocKiHoc() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MonHoc getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}
	public KiHoc getKiHoc() {
		return kiHoc;
	}
	public void setKiHoc(KiHoc kiHoc) {
		this.kiHoc = kiHoc;
	}
	
}
