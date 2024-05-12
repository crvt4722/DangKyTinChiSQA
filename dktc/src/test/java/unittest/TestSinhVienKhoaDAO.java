package unittest;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.SinhVienKhoaDAO;
import model.SinhVienKhoa;

public class TestSinhVienKhoaDAO {
	SinhVienKhoaDAO svkDao = new SinhVienKhoaDAO();
	@Test
	public void getNganhcuaSV_testChuan1() {
		//Sinh viên học 1 ngành
		int idSV = 4;
		ArrayList<SinhVienKhoa> svkList = svkDao.getNganhcuaSV(idSV);
		Assertions.assertNotNull(svkList);
		Assertions.assertEquals(1, svkList.size());
		Assertions.assertEquals(idSV, svkList.get(0).getSinhVien().getId());
		Assertions.assertEquals(1, svkList.get(0).getDangHoc());

	}
	@Test
	public void getNganhcuaSV_testChuan2() {
		//Sinh viên học  nhiều ngành
		int idSV = 12;
		ArrayList<SinhVienKhoa> svkList = svkDao.getNganhcuaSV(idSV);
		Assertions.assertNotNull(svkList);
		Assertions.assertEquals(2, svkList.size());
		for (int i=0;i<svkList.size();i++) {
			Assertions.assertEquals(idSV, svkList.get(i).getSinhVien().getId());
			Assertions.assertEquals(1, svkList.get(i).getDangHoc());
		}
	}
	@Test
	public void getNganhcuaSV_testNgoaile1() {
		//Sinh viên không tồn tại
		int idSV = 1000;
		ArrayList<SinhVienKhoa> svkList = svkDao.getNganhcuaSV(idSV);
		Assertions.assertNull(svkList);
		
	}
	@Test
	public void getSVK_testChuan1() {
		//Có 1 sinh viên khoa đang học
		int idSVK = 4;
		ArrayList<SinhVienKhoa> svkList = svkDao.getNganhcuaSV(idSVK);
		Assertions.assertNotNull(svkList);
		Assertions.assertEquals(1, svkList.size());
		Assertions.assertEquals(idSVK, svkList.get(0).getId());
		Assertions.assertEquals(1, svkList.get(0).getDangHoc());

	}
	@Test
	public void getSVK_testNgoaile1() {
		//Sinh viên khoa không tồn tại
		int idSVK = 1000;
		ArrayList<SinhVienKhoa> svkList = svkDao.getNganhcuaSV(idSVK);
		Assertions.assertNull(svkList);
	

	}
	
	
}
