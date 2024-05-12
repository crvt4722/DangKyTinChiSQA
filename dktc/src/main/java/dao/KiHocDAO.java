package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.HocKi;
import model.KiHoc;
import model.NamHoc;

public class KiHocDAO extends DAO {
	public KiHocDAO() {
	super();
	}
	
	public ArrayList<KiHoc> getKihocdangki(){
		ArrayList<KiHoc> kq=null;
		String sql = "SELECT a.id as idnamhoc, a.ten as namhoc, b.id as idhocki, \r\n"
				+ "b.ten as hocki, c.id as idkihoc \r\n"
				+ "FROM namhoc a, hocki b, kihoc c \r\n"
				+ "WHERE c.NamHocid = a.id AND c.HocKiid = b.id AND c.dangdk = 1";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				if(kq == null) kq = new ArrayList<KiHoc>();
				KiHoc kihoc = new KiHoc();
				kihoc.setId(rs.getInt("idkihoc"));
				kihoc.setDangdk(1);
				//năm học
				NamHoc nh = new NamHoc();
				nh.setId(rs.getInt("idnamhoc"));
				nh.setTen(rs.getString("namhoc"));
				kihoc.setNamHoc(nh);
				//hoc ki
				HocKi hk = new HocKi();
				hk.setId(rs.getInt("idhocki"));
				hk.setTen(rs.getString("hocki"));
				kihoc.setHocKi(hk);
				kq.add(kihoc);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			kq = null;
		}
		return kq;
	}
}
