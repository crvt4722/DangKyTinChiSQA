package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.SinhVienDTO;

public class SinhVienDAO {
	private Connection connection;

    public SinhVienDAO() {
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
    
    public boolean addSinhVien(SinhVienDTO sinhVienDTO) {
    	String queryAddDiaChi = "INSERT INTO diachi(sonha, toanha, xompho, phuongxa, quanhuyen, tinhthanh) VALUES (?,?,?,?,?,?)";
    	String queryAddThanhVien = "INSERT INTO thanhvien(username, password, hodem, ten, ngaysinh, email, dt, ghichu, vaitro, DiaChiid) VALUES (?,?,?,?,?,?,?,?,?,?)";
    	String querySinhVien = "INSERT INTO sinhvien(masv, ThanhVienid) VALUES (?, ?)";
    	
    	try {
    		PreparedStatement psDiaChi = connection.prepareStatement(queryAddDiaChi, PreparedStatement.RETURN_GENERATED_KEYS);
    	
    		psDiaChi.setString(1, sinhVienDTO.getSoNha());
            psDiaChi.setString(2, sinhVienDTO.getToaNha());
            psDiaChi.setString(3, sinhVienDTO.getXomPho());
            psDiaChi.setString(4, sinhVienDTO.getPhuongXa());
            psDiaChi.setString(5, sinhVienDTO.getQuanHuyen());
            psDiaChi.setString(6, sinhVienDTO.getTinhThanh());
            
            int rowsAffectedDiaChi = psDiaChi.executeUpdate();
            if (rowsAffectedDiaChi == 0) {
                return false;
            }
            
            ResultSet rsDiaChi = psDiaChi.getGeneratedKeys();
            int diaChiId = -1;
            if (rsDiaChi.next()) {
                diaChiId = rsDiaChi.getInt(1);
            } else {
                return false;
            }
            
            PreparedStatement psThanhVien = connection.prepareStatement(queryAddThanhVien, PreparedStatement.RETURN_GENERATED_KEYS);
            psThanhVien.setString(1, sinhVienDTO.getUsername());
            psThanhVien.setString(2, sinhVienDTO.getPassword());
            psThanhVien.setString(3, sinhVienDTO.getHodem());
            psThanhVien.setString(4, sinhVienDTO.getTen());
            psThanhVien.setDate(5, sinhVienDTO.getNgaysinh());
            psThanhVien.setString(6, sinhVienDTO.getEmail());
            psThanhVien.setString(7, sinhVienDTO.getDt());
            psThanhVien.setString(8, sinhVienDTO.getGhichu());
            psThanhVien.setString(9, sinhVienDTO.getVaitro());
            psThanhVien.setInt(10, diaChiId);
            
            int rowsAffectedThanhVien = psThanhVien.executeUpdate();
            if (rowsAffectedThanhVien == 0) {
                return false;
            }

            ResultSet rsThanhVien = psThanhVien.getGeneratedKeys();
            int thanhVienId = -1;
            if (rsThanhVien.next()) {
                thanhVienId = rsThanhVien.getInt(1);
            } else {
                return false;
            }

            PreparedStatement psSinhVien = connection.prepareStatement(querySinhVien);
            psSinhVien.setString(1, sinhVienDTO.getMasv());
            psSinhVien.setInt(2, thanhVienId);

            int rowsAffectedSinhVien = psSinhVien.executeUpdate();
            return rowsAffectedSinhVien > 0;
            
    	}catch (SQLException e) {
    		e.printStackTrace();
    		return false;
    	}
    }
}


