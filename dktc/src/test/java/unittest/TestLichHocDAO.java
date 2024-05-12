package unittest;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.LichHocDAO;
import model.LichHoc;

public class TestLichHocDAO {
	LichHocDAO lhdao = new LichHocDAO();
	@Test
	public void getLHcuaLHP_testChuan1() {
		//Có 1 lịch học của 1 lớp học phần
		int idLHP = 10;
		ArrayList<LichHoc> lichHoc = new ArrayList<>();
		lichHoc = lhdao.getLHcuaLHP(idLHP);
		Assertions.assertNotNull(lichHoc);
		Assertions.assertEquals(1, lichHoc.size());
		Assertions.assertEquals(idLHP, lichHoc.get(0).getLopHP().getId());
		
	}
	@Test
	public void getLHcuaLHP_testChuan2() {
		//Có nhieu lịch học của 1 lớp học phần
		int idLHP = 2;
		ArrayList<LichHoc> lichHoc = new ArrayList<>();
		lichHoc = lhdao.getLHcuaLHP(idLHP);
		Assertions.assertNotNull(lichHoc);
		Assertions.assertEquals(6, lichHoc.size());
		for (int i=0;i<lichHoc.size();i++) {
			Assertions.assertEquals(idLHP, lichHoc.get(i).getLopHP().getId());

		}
		
	}
	@Test
	public void getLHcuaLHP_testNgoaile1() {
		//Lớp học phần không tồn tại
		int idLHP = 1000;
		ArrayList<LichHoc> lichHoc = new ArrayList<>();
		lichHoc = lhdao.getLHcuaLHP(idLHP);
		Assertions.assertNull(lichHoc);	
	}
	@Test
	public void getLHcuaLHP_testNgoaile2() {
		//Lớp học phần không có lịch học
		int idLHP = 14;
		ArrayList<LichHoc> lichHoc = new ArrayList<>();
		lichHoc = lhdao.getLHcuaLHP(idLHP);
		Assertions.assertNull(lichHoc);	
	}
}
