package model;

public class DangKiHoc {
	private int id;
	private String ghiChu;
	private SinhVienKhoa svKhoa;
	private LopHocPhan lopHP;
	public DangKiHoc(int id, String ghiChu, SinhVienKhoa svKhoa, LopHocPhan lopHP) {
		super();
		this.id = id;
		this.ghiChu = ghiChu;
		this.svKhoa = svKhoa;
		this.lopHP = lopHP;
	}
	public DangKiHoc() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public SinhVienKhoa getSvKhoa() {
		return svKhoa;
	}
	public void setSvKhoa(SinhVienKhoa svKhoa) {
		this.svKhoa = svKhoa;
	}
	public LopHocPhan getLopHP() {
		return lopHP;
	}
	public void setLopHP(LopHocPhan lopHP) {
		this.lopHP = lopHP;
	}
	
}
