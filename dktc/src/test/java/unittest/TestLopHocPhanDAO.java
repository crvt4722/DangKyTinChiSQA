package unittest;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.LopHocPhanDAO;
import model.DangKiHoc;
import model.LopHocPhan;

public class TestLopHocPhanDAO {
	LopHocPhanDAO lhpdao = new LopHocPhanDAO();
	@Test
	public void getLHPtheoMH_testChuan1() {
		//Môn học kì học có 1 lớp học phần
		int idMHKH = 5;
		ArrayList<LopHocPhan> listLHP = lhpdao.getLHPtheoMH(idMHKH);
		Assertions.assertNotNull(listLHP);
		Assertions.assertEquals(1, listLHP.size());
		Assertions.assertEquals(idMHKH, listLHP.get(0).getMonHocKiHoc().getId());

	}
	@Test
	public void getLHPtheoMH_testChuan2() {
		//Môn học kì học có nhiều lớp học phần
		int idMHKH = 1;
		ArrayList<LopHocPhan> listLHP = lhpdao.getLHPtheoMH(idMHKH);
		Assertions.assertNotNull(listLHP);
		Assertions.assertEquals(2, listLHP.size());
		for (int i=0;i<listLHP.size();i++) {
			Assertions.assertEquals(idMHKH, listLHP.get(i).getMonHocKiHoc().getId());

		}

	}
	@Test
	public void getLHPtheoMH_testNgoaile1() {
		//Môn học kì học không tồn tại
		int idMHKH = 1000;
		ArrayList<LopHocPhan> listLHP = lhpdao.getLHPtheoMH(idMHKH);
		Assertions.assertNull(listLHP);

	}
	@Test
	public void getLHPtheoMH_testNgoaile2() {
		//Môn học kì học không có lớp học phần nào
		int idMHKH = 9;
		ArrayList<LopHocPhan> listLHP = lhpdao.getLHPtheoMH(idMHKH);
		Assertions.assertNull(listLHP);

	}
	
}
