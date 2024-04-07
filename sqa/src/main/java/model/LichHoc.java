package model;

public class LichHoc {
	private Integer id;
	private String ten;
	private String mota;
	private PhongHoc phongHoc;
	private Kip kip;
	private Ngay ngay;
	private Tuan tuan;
	private GiangVien giangVien;
	private LopHocPhan lopHocPhan;
	
	public LichHoc() {}
	
	public LichHoc(Integer id, String ten, String mota, PhongHoc phongHoc, Kip kip, Ngay ngay, Tuan tuan,
			GiangVien giangVien, LopHocPhan lopHocPhan) {
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.phongHoc = phongHoc;
		this.kip = kip;
		this.ngay = ngay;
		this.tuan = tuan;
		this.giangVien = giangVien;
		this.lopHocPhan = lopHocPhan;
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

	public PhongHoc getPhongHoc() {
		return phongHoc;
	}

	public void setPhongHoc(PhongHoc phongHoc) {
		this.phongHoc = phongHoc;
	}

	public Kip getKip() {
		return kip;
	}

	public void setKip(Kip kip) {
		this.kip = kip;
	}

	public Ngay getNgay() {
		return ngay;
	}

	public void setNgay(Ngay ngay) {
		this.ngay = ngay;
	}

	public Tuan getTuan() {
		return tuan;
	}

	public void setTuan(Tuan tuan) {
		this.tuan = tuan;
	}

	public GiangVien getGiangVien() {
		return giangVien;
	}

	public void setGiangVien(GiangVien giangVien) {
		this.giangVien = giangVien;
	}

	public LopHocPhan getLopHocPhan() {
		return lopHocPhan;
	}

	public void setLopHocPhan(LopHocPhan lopHocPhan) {
		this.lopHocPhan = lopHocPhan;
	}

	@Override
	public String toString() {
		return "LichHoc [id=" + id + ", ten=" + ten + ", mota=" + mota + ", phongHoc=" + phongHoc + ", kip=" + kip
				+ ", ngay=" + ngay + ", tuan=" + tuan + ", giangVien=" + giangVien + ", lopHocPhan=" + lopHocPhan + "]";
	}


	
}
