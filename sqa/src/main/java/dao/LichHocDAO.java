package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.LichHocDTO;
import model.LichHoc;

public class LichHocDAO {
	private Connection connection;

	public LichHocDAO() {
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

	public List<LichHocDTO> getLichHocByLHPId(int lhpId) {
		List<LichHocDTO> list = new ArrayList<>();
		String query = "SELECT lhp.id,"
				+ "	lh.id as Lichhocid, lh.ten as tenLH,"
				+ "	lh.GiangVienThanhVienid, gvv.ten as giangvien,"
				+ " lh.PhongHocid, ph.ten as phonghoc,"
				+ " lh.Tuanid, tuan.ten as tuan, lh.Ngayid, ngay.ten as ngay, lh.Kipid, kip.ten as kip"
				+ " FROM lophocphan lhp"
				+ " JOIN lichhoc lh on lhp.id = lh.LopHocPhanid"
				+ " JOIN giangvien gv on lh.GiangVienThanhVienid = gv.ThanhVienid"
				+ " JOIN thanhvien gvv on gv.ThanhVienid = gvv.id"
				+ " JOIN phonghoc ph on lh.PhongHocid = ph.id"
				+ " JOIN tuan on lh.Tuanid = tuan.id"
				+ " JOIN ngay on lh.Ngayid = ngay.id"
				+ " JOIN kip on lh.Kipid = kip.id"
				+ " WHERE lhp.id = ?";

		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, lhpId);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int lophocphanId = resultSet.getInt("id");
				int Lichhocid = resultSet.getInt("Lichhocid");
				String tenLH = resultSet.getString("tenLH");
				int giangvienId = resultSet.getInt("GiangVienThanhVienid");
				String tenGiangvien = resultSet.getString("giangvien");
				int phonghocId = resultSet.getInt("PhongHocid");
				String tenPH = resultSet.getString("phonghoc");
				int tuanId = resultSet.getInt("Tuanid");
				String tuan = resultSet.getString("tuan");
				int ngayId = resultSet.getInt("Ngayid");
				String ngay = resultSet.getString("ngay");
				int kipId = resultSet.getInt("Kipid");
				String kip = resultSet.getString("kip");

				LichHocDTO lichHoc = new LichHocDTO(Lichhocid, tenPH, tuan, ngay, kip, tenGiangvien);
				System.out.println(lichHoc);
				list.add(lichHoc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
