package dto;

import java.util.List;

public class DangKiHocDTO {
	private Integer id;
	private String ghichu;
	private int lophocphanId;
	private int sisotoida;
	private String tenLHP;
	private int monhocId;
	private String tenMonHoc;
	private int sotc;
	private String tenHocKi;
	private String namhoc;
	private List<LichHocDTO> dsLichHoc;
	public DangKiHocDTO() {}
	public DangKiHocDTO(Integer id, String ghichu, int lophocphanId, int sisotoida, String tenLHP, int monhocId,
			String tenMonHoc, int sotc, String tenHocKi, String namhoc, List<LichHocDTO> dsLichHoc) {
		this.id = id;
		this.ghichu = ghichu;
		this.lophocphanId = lophocphanId;
		this.sisotoida = sisotoida;
		this.tenLHP = tenLHP;
		this.monhocId = monhocId;
		this.tenMonHoc = tenMonHoc;
		this.sotc = sotc;
		this.tenHocKi = tenHocKi;
		this.namhoc = namhoc;
		this.dsLichHoc = dsLichHoc;
	}
	@Override
	public String toString() {
		return "DangKiHocDTO [id=" + id + ", ghichu=" + ghichu + ", lophocphanId=" + lophocphanId + ", sisotoida="
				+ sisotoida + ", tenLHP=" + tenLHP + ", monhocId=" + monhocId + ", tenMonHoc=" + tenMonHoc + ", sotc="
				+ sotc + ", tenHocKi=" + tenHocKi + ", namhoc=" + namhoc + ", dsLichHoc=" + dsLichHoc + "]";
	}
}
