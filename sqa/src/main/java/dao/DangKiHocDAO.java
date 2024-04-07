package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.DangKiHocDTO;
import dto.LichHocDTO;

public class DangKiHocDAO {
	
	private Connection connection;
	
	public DangKiHocDAO() {
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.connection = DAO.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<DangKiHocDTO> getDangKiCuaSinhVien(int sinhvienId) {
		LichHocDAO lichHocDAO = new LichHocDAO();
		List<DangKiHocDTO> list = new ArrayList<>();
		String query = "SELECT dkh.id AS dangkihoc_id, dkh.ghichu, dkh.Lophocphanid, lhp.sisotoida,"
				+ " lhp.ten as tenLHP, mhkh.id as mhkhId, mh.id as monhocId, mh.ten as tenMonHoc, mh.sotc as sotc,\r\n"
				+ " kh.id as kihocId, hk.id as hockiId, hk.ten as tenHocKi, namhoc.id as namhocId, namhoc.ten as namhoc,\r\n"
				+ " svk.nienkhoa, k.id as khoaId, k.ten as khoa, sv.masv as msv, tv.ten"
				+ " FROM dangkihoc dkh\r\n"
				+ " JOIN lophocphan lhp ON dkh.LopHocPhanid = lhp.id"
				+ " JOIN monhockihoc mhkh ON lhp.MonHocKiHocid = mhkh.id"
				+ " JOIN monhoc mh ON mhkh.MonHocid = mh.id"
				+ " JOIN kihoc kh ON mhkh.KiHocid = kh.id"
				+ " JOIN hocki hk ON kh.HocKiid = hk.id"
				+ " JOIN namhoc ON kh.NamHocid = namhoc.id"
				+ " JOIN sinhvienkhoa svk ON dkh.SinhVienKhoaid = svk.id"
				+ " JOIN khoa k ON svk.Khoaid = k.id"
				+ " JOIN sinhvien sv ON svk.SinhVienid = sv.ThanhVienid"
				+ " JOIN thanhvien tv on sv.ThanhVienid = tv.id"
				+ " WHERE tv.id = ?";
		
		 try (PreparedStatement statement = connection.prepareStatement(query)) {
             statement.setInt(1, sinhvienId);
             ResultSet resultSet = statement.executeQuery();

             while (resultSet.next()) {
                 int dangkihocId = resultSet.getInt("dangkihoc_id");
                 String ghichu = resultSet.getString("ghichu");
                 int lophocphanId = resultSet.getInt("Lophocphanid");
                 List<LichHocDTO> dsLichHoc = lichHocDAO.getLichHocByLHPId(lophocphanId);
                 int sisotoida = resultSet.getInt("sisotoida");
                 String tenLHP = resultSet.getString("tenLHP");
                 int mhkhId = resultSet.getInt("mhkhId");
                 int monhocId = resultSet.getInt("monhocId");
                 String tenMonHoc = resultSet.getString("tenMonHoc");
                 int sotc = resultSet.getInt("sotc");
                 int kihocId = resultSet.getInt("kihocId");
                 int hockiId = resultSet.getInt("hockiId");
                 String tenHocKi = resultSet.getString("tenHocKi");
                 int namhocId = resultSet.getInt("namhocId");
                 String namhoc = resultSet.getString("namhoc");
                 String nienkhoa = resultSet.getString("nienkhoa");
                 int khoaId = resultSet.getInt("khoaId");
                 String khoa = resultSet.getString("khoa");
                 String masv = resultSet.getString("msv");
                 
                 DangKiHocDTO dangKiHocDTO = new DangKiHocDTO(dangkihocId, ghichu, lophocphanId, sisotoida, tenLHP, mhkhId, monhocId, tenMonHoc, sotc, kihocId, hockiId, tenHocKi, namhocId, namhoc, nienkhoa, khoaId, khoa, masv, dsLichHoc);
                 
                 System.out.println(dangKiHocDTO);
                 list.add(dangKiHocDTO);
                 
             }
         } catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
