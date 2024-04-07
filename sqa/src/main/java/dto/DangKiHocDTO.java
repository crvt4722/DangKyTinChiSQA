package dto;

import java.util.List;

public class DangKiHocDTO {
	private Integer id;
	private String ghichu;
	private int lophocphanId;
	private int sisotoida;
	private String tenLHP;
	private int mhkhId;
	private int monhocId;
	private String tenMonHoc;
	private int sotc;
	private int kihocId;
	private int hockiId;
	private String tenHocKi;
	private int namhocId;
	private String namhoc;
	private String nienkhoa;
	private int khoaId;
	private String khoa;
	private String masv;
	private List<LichHocDTO> dsLichHoc;
	public DangKiHocDTO() {}
	public DangKiHocDTO(Integer id, String ghichu, int lophocphanId, int sisotoida, String tenLHP, int mhkhId,
			int monhocId, String tenMonHoc, int sotc, int kihocId, int hockiId, String tenHocKi, int namhocId,
			String namhoc, String nienkhoa, int khoaId, String khoa, String masv, List<LichHocDTO> dsLichHoc) {
		this.id = id;
		this.ghichu = ghichu;
		this.lophocphanId = lophocphanId;
		this.sisotoida = sisotoida;
		this.tenLHP = tenLHP;
		this.mhkhId = mhkhId;
		this.monhocId = monhocId;
		this.tenMonHoc = tenMonHoc;
		this.sotc = sotc;
		this.kihocId = kihocId;
		this.hockiId = hockiId;
		this.tenHocKi = tenHocKi;
		this.namhocId = namhocId;
		this.namhoc = namhoc;
		this.nienkhoa = nienkhoa;
		this.khoaId = khoaId;
		this.khoa = khoa;
		this.masv = masv;
		this.dsLichHoc = dsLichHoc;
	}
	@Override
	public String toString() {
		return "DangKiHocDTO [id=" + id + ", ghichu=" + ghichu + ", lophocphanId=" + lophocphanId + ", sisotoida="
				+ sisotoida + ", tenLHP=" + tenLHP + ", mhkhId=" + mhkhId + ", monhocId=" + monhocId + ", tenMonHoc="
				+ tenMonHoc + ", sotc=" + sotc + ", kihocId=" + kihocId + ", hockiId=" + hockiId + ", tenHocKi="
				+ tenHocKi + ", namhocId=" + namhocId + ", namhoc=" + namhoc + ", nienkhoa=" + nienkhoa + ", khoaId="
				+ khoaId + ", khoa=" + khoa + ", masv=" + masv + ", dsLichHoc=" + dsLichHoc + "]";
	}
	
	
	
}
