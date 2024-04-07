package model;

public class DangKiHoc {
	private Integer id;
	private String ghichu;
	private SinhVienKhoa sinhVienKhoa;
	private LopHocPhan lopHocPhan;
	
	public DangKiHoc() {}

	public DangKiHoc(Integer id, String ghichu, SinhVienKhoa sinhVienKhoa, LopHocPhan lopHocPhan) {
		super();
		this.id = id;
		this.ghichu = ghichu;
		this.sinhVienKhoa = sinhVienKhoa;
		this.lopHocPhan = lopHocPhan;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public SinhVienKhoa getSinhVienKhoa() {
		return sinhVienKhoa;
	}

	public void setSinhVienKhoa(SinhVienKhoa sinhVienKhoa) {
		this.sinhVienKhoa = sinhVienKhoa;
	}

	public LopHocPhan getLopHocPhan() {
		return lopHocPhan;
	}

	public void setLopHocPhan(LopHocPhan lopHocPhan) {
		this.lopHocPhan = lopHocPhan;
	}

	@Override
	public String toString() {
		return "DangKyHoc [id=" + id + ", ghichu=" + ghichu + ", sinhVienKhoa=" + sinhVienKhoa + ", lopHocPhan="
				+ lopHocPhan + "]";
	}
}
