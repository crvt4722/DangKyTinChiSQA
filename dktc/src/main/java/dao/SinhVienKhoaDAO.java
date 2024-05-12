package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Khoa;
import model.SinhVien;
import model.SinhVienKhoa;

public class SinhVienKhoaDAO extends DAO {
	public SinhVienKhoaDAO() {
		super();
	}

	public ArrayList<SinhVienKhoa> getNganhcuaSV(int idSV) {
		ArrayList<SinhVienKhoa> kq = null;
		String sql = "SELECT a.id as idkhoa, a.ten as tenkhoa, b.id as idsvk,\r\n" + " c.masv, d.* \r\n"
				+ "FROM khoa a, sinhvienkhoa b, sinhvien c, thanhvien d \r\n"
				+ "WHERE b.SinhVienid = ? AND b.Khoaid = a.id \r\n" + " AND b.danghoc = 1 AND c.ThanhVienid =? \r\n"
				+ " AND d.id = ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idSV);
			ps.setInt(2, idSV);
			ps.setInt(3, idSV);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (kq == null)
					kq = new ArrayList<SinhVienKhoa>();
				SinhVienKhoa svk = new SinhVienKhoa();
				svk.setId(rs.getInt("idsvk"));
				// sinh vien
				SinhVien sv = new SinhVien();
				sv.setId(rs.getInt("id"));
				sv.setMaSV(rs.getString("masv"));
				sv.setHodem(rs.getString("hodem"));
				sv.setTen(rs.getString("ten"));
				sv.setNgaysinh(rs.getDate("ngaysinh"));
				sv.setEmail(rs.getString("email"));
				sv.setDt(rs.getString("dt"));
				svk.setSinhVien(sv);
				svk.setDangHoc(1);
				// khoa
				Khoa k = new Khoa();
				k.setId(rs.getInt("idkhoa"));
				k.setTen(rs.getString("tenkhoa"));
				svk.setKhoa(k);
				kq.add(svk);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq = null;
		}
		return kq;
	}
	public SinhVienKhoa getSVK(int idSVK) {
		SinhVienKhoa svk = new SinhVienKhoa();
		String sql = "SELECT d.* ,a.ten as tenkhoa, c.masv\r\n"
				+ "FROM khoa a, sinhvienkhoa b, sinhvien c, thanhvien d \r\n"
				+ "WHERE b.id = ? AND b.Khoaid = a.id   AND b.SinhVienid = d.id";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idSVK);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				svk.setId(rs.getInt("id"));
				// sinh vien
				SinhVien sv = new SinhVien();
				sv.setMaSV(rs.getString("masv"));
				sv.setHodem(rs.getString("hodem"));
				sv.setTen(rs.getString("ten"));
				sv.setNgaysinh(rs.getDate("ngaysinh"));
				sv.setEmail(rs.getString("email"));
				sv.setDt(rs.getString("dt"));
				svk.setSinhVien(sv);
				// khoa
				Khoa k = new Khoa();
				k.setTen(rs.getString("tenkhoa"));
				svk.setKhoa(k);
			}
		}
		 catch (Exception e) {
				e.printStackTrace();
			}
		return svk;
	}

}
