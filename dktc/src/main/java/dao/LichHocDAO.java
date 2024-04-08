package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.GiangVien;
import model.KipHoc;
import model.LichHoc;
import model.LopHocPhan;
import model.Ngay;
import model.PhongHoc;
import model.Tuan;
import dto.LichHocDTO;

public class LichHocDAO extends DAO {
	public LichHocDAO() {
		super();
// TODO Auto-generated constructor stub
	}
	public ArrayList<LichHoc> getLHcuaLHP(int idLHP) {
		ArrayList<LichHoc> kq = null;
		String sql = "SELECT a.*,b.hodem as hodemgv, b.ten as tengv,  c.ten as tenphong, \r\n"
				+ " d.ten as tentuan, e.ten as tenngay, f.ten as tenkip \r\n"
				+ " FROM lichhoc a, thanhvien b, phonghoc c,\r\n"
				+ " tuan d, ngay e, kip f \r\n"
				+ " WHERE a.LopHocPhanid = ? AND b.id = a.GiangVienThanhVienid\r\n"
				+ " AND c.id = a.PhongHocid AND d.id = a.Tuanid\r\n"
				+ " AND e.id = a.Ngayid AND f.id = a.Kipid;";// 
		try {
			PreparedStatement cs = con.prepareStatement(sql);
			cs.setInt(1, idLHP);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				if (kq == null)
					kq = new ArrayList<LichHoc>();
					LichHoc lichhoc = new LichHoc();
					lichhoc.setId(rs.getInt("id"));
					lichhoc.setTen(rs.getString("ten"));
					//lop hoc phan
					LopHocPhan lhp = new LopHocPhan();
					lhp.setId(idLHP);
					lichhoc.setLopHP(lhp);
					//giang vien
					GiangVien gv = new GiangVien();
					gv.setId(rs.getInt("GiangVienThanhVienid"));
					gv.setHodem(rs.getString("hodemgv"));
					gv.setTen(rs.getString("tengv"));
					lichhoc.setGiangVien(gv);
					//Phong hoc
					PhongHoc ph = new PhongHoc();
					ph.setId(rs.getInt("PhongHocid"));
					ph.setTen(rs.getString("tenphong"));
					lichhoc.setPhongHoc(ph);
					//Tuan hoc
					Tuan tu = new Tuan();
					tu.setId(rs.getInt("Tuanid"));
					tu.setTen(rs.getString("tentuan"));
					lichhoc.setTuan(tu);
					//Ngay hoc
					Ngay ng = new Ngay();
					ng.setId(rs.getInt("Ngayid"));
					ng.setTen(rs.getString("tenngay"));
					lichhoc.setNgay(ng);
					//Kip hoc
					KipHoc ki = new KipHoc();
					ki.setId(rs.getInt("Kipid"));
					ki.setTen(rs.getString("tenkip"));
					lichhoc.setKip(ki);
					System.out.println(lichhoc);
					kq.add(lichhoc);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq = null;
		}
		return kq;
	}
	public List<LichHocDTO> getLichHocByLHPId(int lhpId) {
		List<LichHocDTO> list = new ArrayList<>();
		String query = "SELECT lhp.id,"
				+ "	lh.id as Lichhocid, lh.ten as tenLH,"
				+ "	lh.GiangVienThanhVienid, gvv.hodem as hodemgiangvien ,gvv.ten as tengiangvien,"
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

		try (PreparedStatement statement = con.prepareStatement(query)) {
			statement.setInt(1, lhpId);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int lophocphanId = resultSet.getInt("id");
				int Lichhocid = resultSet.getInt("Lichhocid");
				String tenLH = resultSet.getString("tenLH");
				int giangvienId = resultSet.getInt("GiangVienThanhVienid");
				String hodemGiangvien = resultSet.getString("hodemgiangvien");
				String tenGiangvien = resultSet.getString("tengiangvien");
				int phonghocId = resultSet.getInt("PhongHocid");
				String tenPH = resultSet.getString("phonghoc");
				int tuanId = resultSet.getInt("Tuanid");
				String tuan = resultSet.getString("tuan");
				int ngayId = resultSet.getInt("Ngayid");
				String ngay = resultSet.getString("ngay");
				int kipId = resultSet.getInt("Kipid");
				String kip = resultSet.getString("kip");

				LichHocDTO lichHoc = new LichHocDTO(Lichhocid, tenPH, tuan, ngay, kip, hodemGiangvien,tenGiangvien);
				System.out.println(lichHoc);
				list.add(lichHoc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
