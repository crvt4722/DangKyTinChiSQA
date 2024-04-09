package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.KiHoc;
import model.LopHocPhan;
import model.MonHoc;
import model.MonHocKiHoc;

public class LopHocPhanDAO extends DAO {

	public LopHocPhanDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<LopHocPhan> getLHPtheoMH(int idMHKH) {
		ArrayList<LopHocPhan> kq = null;
		String sql = " SELECT  a.id, a.ten, a.sisotoida, a.sisothucte, b.KiHocid, c.id as idmh, c.ten as tenmh, c.sotc\r\n"
				+ "				FROM lophocphan a , monhockihoc b, monhoc c\r\n"
				+ "				WHERE a.MonHocKiHocid = c.id and b.MonHocid = c.id and a.MonHocKiHocid = ? ";
		try {
			PreparedStatement cs = con.prepareStatement(sql);
			cs.setInt(1, idMHKH);
			ResultSet rs = cs.executeQuery();
			LichHocDAO ld = new LichHocDAO();
			while (rs.next()) {
				if (kq == null)
					kq = new ArrayList<LopHocPhan>();
				LopHocPhan lhp = new LopHocPhan();
				lhp.setId(rs.getInt("id"));
				lhp.setTen(rs.getString("ten"));
				lhp.setSisotoida(rs.getInt("sisotoida"));
				lhp.setSisothucte(rs.getInt("sisothucte"));
				lhp.setDslh(ld.getLHcuaLHP(lhp.getId()));
				// monhockihoc
				MonHocKiHoc mhkh = new MonHocKiHoc();
				mhkh.setId(idMHKH);
				// monhoc
				MonHoc monhoc = new MonHoc();
				monhoc.setId(rs.getInt("idmh"));
				monhoc.setTen(rs.getString("tenmh"));
				monhoc.setStc(rs.getInt("sotc"));
				mhkh.setMonHoc(monhoc);
				// kihoc
				KiHoc kihoc = new KiHoc();
				kihoc.setId(rs.getInt("KiHocid"));
				mhkh.setKiHoc(kihoc);
				lhp.setMonHocKiHoc(mhkh);
				kq.add(lhp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq = null;
		}
		return kq;
	}
}
