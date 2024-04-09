package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.KiHoc;
import model.MonHoc;
import model.MonHocKiHoc;

public class MonHocKiHocDAO extends DAO {

	public MonHocKiHocDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<MonHocKiHoc> getMHcuaSV(int idSVK, int idKihoc) {
		ArrayList<MonHocKiHoc> kq = null;
		String sql = "SELECT a.id as idmhkh, b.id as idmh, b.ten as tenmh, b.sotc as stc \r\n"
				+ "				FROM monhockihoc a, monhoc b, sinhvienkhoa c , bomon d, khoa e\r\n"
				+ "				WHERE d.Khoaid = e.id and c.id =? and a.KiHocid = ? AND b.id = a.MonHocid and  d.id = b.BoMonid "; 
		try {
			PreparedStatement cs = con.prepareStatement(sql);
			cs.setInt(1, idSVK);
			cs.setInt(2, idKihoc);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				if (kq == null)
					kq = new ArrayList<MonHocKiHoc>();
				MonHocKiHoc mhkh = new MonHocKiHoc();
				mhkh.setId(rs.getInt("idmhkh"));
				// mon hoc
				MonHoc mh = new MonHoc();
				mh.setId(rs.getInt("idmh"));
				mh.setTen(rs.getString("tenmh"));
				mh.setStc(rs.getInt("stc" ));
				mhkh.setMonHoc(mh);
				// ki hoc
				KiHoc kh = new KiHoc();
				kh.setId(idKihoc);
				mhkh.setKiHoc(kh);
				kq.add(mhkh);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq = null;
		}
		return kq;
	}

}
