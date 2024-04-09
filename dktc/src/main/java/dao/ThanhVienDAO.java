package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.DiaChi;
import model.ThanhVien;

public class ThanhVienDAO extends DAO {

	public ThanhVienDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	 public boolean checkLogin(ThanhVien tv) {
	        boolean ok = false;
	        String sql = "select * from thanhvien where username = ? and password =? "; 
	        try {

	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, tv.getUsername());
	            ps.setString(2, tv.getPassword());

	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                tv.setId(rs.getInt("id"));
	                tv.setHodem(rs.getString("hodem"));
	                tv.setTen(rs.getString("ten"));
	                tv.setHodem(rs.getString("hodem"));
	                tv.setNgaysinh(rs.getDate("ngaysinh"));
	                tv.setEmail(rs.getString("email"));
	                tv.setDt(rs.getString("dt"));
	                tv.setGhichu(rs.getString("ghichu"));
	                tv.setVaitro(rs.getString("vaitro"));
	                DiaChi diaChi = new DiaChi();
	                diaChi.setId(rs.getInt("DiaChiid"));
	                tv.setDiachi(diaChi);
	                System.out.println(tv.getHodem()+" "+tv.getTen());
	                ok  = true;
	                
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return ok;
	    }
	 

}
