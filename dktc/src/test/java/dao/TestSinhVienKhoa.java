package dao;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import model.SinhVien;
import model.SinhVienKhoa;

class TestSinhVienKhoa {

	SinhVienKhoaDAO sinhVienKhoaDAO = new SinhVienKhoaDAO();
	
	@Test
	void testGetNganhcuaSV() {
		int idSinhVien = 1;
		// kiem tra ds nganh hoc cua sinh vien id 1
		List<SinhVienKhoa> dssinhvien = sinhVienKhoaDAO.getNganhcuaSV(idSinhVien);
		Assert.assertNotNull(dssinhvien);
		Assert.assertEquals(1, dssinhvien.size());
		Assert.assertEquals(idSinhVien, dssinhvien.get(0).getId());
	}

	@Test
	void testGetNganhcuaSV_test2() {
		int idSinhVien = 100;
		// kiem tra ds nganh hoc cua sinh vien khong ton tai
	    List<SinhVienKhoa> dssinhvien = sinhVienKhoaDAO.getNganhcuaSV(idSinhVien);
	    Assert.assertNotNull(dssinhvien);
	    Assert.assertEquals(0, dssinhvien.size());
	}
	
	@Test
	void testGetSVK() {
		int idSinhvien = 1;
		// Kiem tra thong tin sinh vien co id 1
		SinhVienKhoa sinhvien = sinhVienKhoaDAO.getSVK(idSinhvien);
		Assert.assertNotNull(sinhvien);
		Assert.assertEquals(idSinhvien, sinhvien.getId());
	}

	@Test
	void testGetSVK_test2() {
		int idSinhvien = 100;
		// Kiem tra thong tin sinh vien khong co trong he thong
		SinhVienKhoa sinhvien = sinhVienKhoaDAO.getSVK(idSinhvien);
		System.out.println(sinhvien);
		Assert.assertNotNull(sinhvien);
		Assert.assertEquals(idSinhvien, sinhvien.getId());
	}
}
