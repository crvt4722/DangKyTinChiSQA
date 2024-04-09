package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.DangKiHoc;
import model.Khoa;
import model.KiHoc;
import model.LopHocPhan;
import model.MonHoc;
import model.MonHocKiHoc;
import model.SinhVien;
import model.SinhVienKhoa;

public class DangKiDAO extends DAO {

	public DangKiDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<DangKiHoc> getDKcuaSV(int idSVK, int idKihoc) {
		ArrayList<DangKiHoc> kq = null;
		String sql = "SELECT a.id,a.SinhVienKhoaid,e.Khoaid,\r\n"
				+ " e.nienkhoa, e.SinhVienid, f.masv, g.hodem, g.ten as tensv, c.id as idmhkh, b.id as idlhp, b.ten as tenlhp, d.id as idmh, d.ten as tenmh, d.sotc \r\n"
				+ "\r\n" + " FROM dangkihoc a, lophocphan b, monhockihoc c, \r\n"
				+ " monhoc d, sinhvienkhoa e, sinhvien f, thanhvien g,\r\n" + " khoa h \r\n"
				+ " WHERE a.SinhVienKhoaid = ? AND b.id = a.LopHocPhanid \r\n"
				+ " AND c.id = b.MonHocKiHocid AND c.KiHocid = ?\r\n"
				+ " AND d.id = c.MonHocid AND e.id=a.SinhVienKhoaid \r\n"
				+ " AND f.ThanhVienid = e.SinhVienid AND g.id=e.SinhVienid \r\n" + " AND h.id = e.Khoaid;";
		LichHocDAO ld = new LichHocDAO();
		try {
			PreparedStatement cs = con.prepareStatement(sql);
			cs.setInt(1, idSVK);
			cs.setInt(2, idKihoc);
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				if (kq == null)
					kq = new ArrayList<DangKiHoc>();
				DangKiHoc dk = new DangKiHoc();
				dk.setId(rs.getInt("id"));
				// lop hoc phan
				LopHocPhan lhp = new LopHocPhan();
				lhp.setId(rs.getInt("idlhp"));
				lhp.setTen(rs.getString("tenlhp"));
				lhp.setDslh(ld.getLHcuaLHP(lhp.getId()));
				// monhockihoc
				MonHocKiHoc mhkh = new MonHocKiHoc();
				mhkh.setId(rs.getInt("idmhkh"));
				// monhoc
				MonHoc mh = new MonHoc();
				mh.setId(rs.getInt("idmh"));
				mh.setTen(rs.getString("tenmh"));
				mh.setStc(rs.getInt("sotc"));
				mhkh.setMonHoc(mh);
				// kihoc
				KiHoc kh = new KiHoc();
				kh.setId(idKihoc);
				mhkh.setKiHoc(kh);
				lhp.setMonHocKiHoc(mhkh);
				dk.setLopHP(lhp);
				// sinhvienkhoa
				SinhVienKhoa svk = new SinhVienKhoa();
				svk.setId(idSVK);
				// sinh vien
				SinhVien sv = new SinhVien();
				sv.setId(rs.getInt("SinhVienid"));
				svk.setSinhVien(sv);
				// khoa
				Khoa k = new Khoa();
				k.setId(rs.getInt("Khoaid"));
				svk.setKhoa(k);
				dk.setSvKhoa(svk);
				System.out.print(dk.getId() + " " + dk.getLopHP().getTen());
				kq.add(dk);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq = null;
		}
		return kq;
	}

	public boolean luuDKcuaSV(ArrayList<DangKiHoc> listDK){
		if((listDK == null)|| (listDK.size() ==0)) return false;
		boolean kq = false;
		String sqlXoa = "DELETE FROM dangkihoc WHERE SinhVienKhoaid=? AND LopHocPhanid IN (SELECT a.id FROM lophocphan a, monhockihoc b WHERE b.KiHocid = ? AND a.MonHocKiHocid=b.id)";
		String sqlThem = "INSERT INTO dangkihoc(SinhVienKhoaid,LopHocPhanid) VALUES(?,?)";
		String sqlUpdateLHP = "update lophocphan set lophocphan.sisothucte = lophocphan.sisothucte+1 where lophocphan.id = ?";
		String sqlXoaSiSoLHP ="update lophocphan set sisothucte = sisothucte-1 where id =?" ;
		try{
			this.con.setAutoCommit(false);
		//xoa het dang ki cu
			int idSVK = listDK.get(0).getSvKhoa().getId();
			int idKihoc = listDK.get(0).getLopHP().getMonHocKiHoc().getKiHoc().getId();
			ArrayList<DangKiHoc> listDKcu = (ArrayList<DangKiHoc>)(new DangKiDAO()).getDKcuaSV(idSVK, idKihoc);
			PreparedStatement psXoa = con.prepareStatement(sqlXoa);
			psXoa.setInt(1, idSVK);
			psXoa.setInt(2, idKihoc);
			psXoa.executeUpdate();
			if(listDKcu!=null) {
				for(DangKiHoc dkhcu : listDKcu) {
					PreparedStatement psXoaSiSoLHP = con.prepareStatement(sqlXoaSiSoLHP);
					psXoaSiSoLHP.setInt(1, dkhcu.getLopHP().getId());
					
					psXoaSiSoLHP.executeUpdate();
				}
				
			}
				
		//them lai dang ki nhu dang ki moi
			for(DangKiHoc dk : listDK){
				PreparedStatement psThem = con.prepareStatement(sqlThem);
				PreparedStatement psUpdateLHP = con.prepareStatement(sqlUpdateLHP);
				psUpdateLHP.setInt(1, dk.getLopHP().getId());
				psThem.setInt(1, dk.getSvKhoa().getId());
				psThem.setInt(2, dk.getLopHP().getId());
				psThem.executeUpdate();
				psUpdateLHP.executeUpdate();
		}
		this.con.commit();
		kq=true;
		}
		catch(Exception e){
			try{
				this.con.rollback();
			}
			catch(Exception ee){
				kq=false;
				ee.printStackTrace();
			}
			e.printStackTrace();
		}finally{
		try{
			this.con.setAutoCommit(true);
		}catch(Exception e){
		kq=false;
		e.printStackTrace();
		}
		}
		return kq;
		}

}
