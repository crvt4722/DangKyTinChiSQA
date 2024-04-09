package dto;

public class LichHocDTO {
	private Integer id;
	private String phonghoc;
	private String tuan;
	private String ngay;
	private String kip;
	private String hodemgiangvien;
	private String tengiangvien;

	public LichHocDTO() {}

	
	public LichHocDTO(Integer id, String phonghoc, String tuan, String ngay, String kip, String hodemgiangvien,
			String tengiangvien) {
		this.id = id;
		this.phonghoc = phonghoc;
		this.tuan = tuan;
		this.ngay = ngay;
		this.kip = kip;
		this.hodemgiangvien = hodemgiangvien;
		this.tengiangvien = tengiangvien;
	}
	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPhonghoc() {
		return phonghoc;
	}


	public void setPhonghoc(String phonghoc) {
		this.phonghoc = phonghoc;
	}


	public String getTuan() {
		return tuan;
	}


	public void setTuan(String tuan) {
		this.tuan = tuan;
	}


	public String getNgay() {
		return ngay;
	}


	public void setNgay(String ngay) {
		this.ngay = ngay;
	}


	public String getKip() {
		return kip;
	}


	public void setKip(String kip) {
		this.kip = kip;
	}


	public String getHodemgiangvien() {
		return hodemgiangvien;
	}


	public void setHodemgiangvien(String hodemgiangvien) {
		this.hodemgiangvien = hodemgiangvien;
	}


	public String getTengiangvien() {
		return tengiangvien;
	}


	public void setTengiangvien(String tengiangvien) {
		this.tengiangvien = tengiangvien;
	}


	@Override
	public String toString() {
		return "LichHocDTO [id=" + id + ", phonghoc=" + phonghoc + ", tuan=" + tuan + ", ngay=" + ngay + ", kip=" + kip
				+ ", giangvien=" + hodemgiangvien+tengiangvien + "]";
	}
	
}
