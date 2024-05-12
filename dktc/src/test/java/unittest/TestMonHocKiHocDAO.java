package unittest;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.MonHocKiHocDAO;
import model.KiHoc;
import model.MonHocKiHoc;

public class TestMonHocKiHocDAO {
	MonHocKiHocDAO mhkhDao = new MonHocKiHocDAO();
	@Test
	public void getMHcuaSV_testChuan1() {
		//Danh sach môn học trong Kì học của sinh viên có 1 môn học
		ArrayList<MonHocKiHoc> mhkhList = new ArrayList<>();
		int idSVK = 5;
		int idKiHoc = 2;
		mhkhList = mhkhDao.getMHcuaSV(idSVK,idKiHoc);
		Assertions.assertNotNull(mhkhList);
		Assertions.assertEquals(1, mhkhList.size());
		Assertions.assertEquals(idKiHoc, mhkhList.get(0).getKiHoc().getId());
	}
	
	@Test
	public void getMHcuaSV_testChuan2() {
		//Danh sach môn học trong Kì học của sinh viên có nhiều môn học
		ArrayList<MonHocKiHoc> mhkhList = new ArrayList<>();
		int idSVK = 1;
		int idKiHoc = 2;
		mhkhList = mhkhDao.getMHcuaSV(idSVK,idKiHoc);
		Assertions.assertNotNull(mhkhList);
		Assertions.assertEquals(6, mhkhList.size());
		for (int i=0;i<mhkhList.size();i++) {
			Assertions.assertEquals(idKiHoc, mhkhList.get(i).getKiHoc().getId());
		}
	}
	@Test
	public void getMHcuaSV_testNgaoile1() {
		//Sinh viên khoa hợp lệ , kì học không hợp lệ
		ArrayList<MonHocKiHoc> mhkhList = new ArrayList<>();
		int idSVK = 1;
		int idKiHoc = 1000;
		mhkhList = mhkhDao.getMHcuaSV(idSVK,idKiHoc);
		Assertions.assertNull(mhkhList);

	}
	@Test
	public void getMHcuaSV_testNgaoile2() {
		//Sinh viên khoa không hợp lệ , kì học hợp lệ
		ArrayList<MonHocKiHoc> mhkhList = new ArrayList<>();
		int idSVK = 1000;
		int idKiHoc = 2;
		mhkhList = mhkhDao.getMHcuaSV(idSVK,idKiHoc);
		Assertions.assertNull(mhkhList);

	}
	@Test
	public void getMHcuaSV_testNgaoile3() {
		//Sinh viên khoa không hợp lệ , kì học không hợp lệ
		ArrayList<MonHocKiHoc> mhkhList = new ArrayList<>();
		int idSVK = 1000;
		int idKiHoc = 1000;
		mhkhList = mhkhDao.getMHcuaSV(idSVK,idKiHoc);
		Assertions.assertNull(mhkhList);
		
	}
}
