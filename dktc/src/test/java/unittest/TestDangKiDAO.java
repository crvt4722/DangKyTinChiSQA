/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unittest;


import dao.DAO;
import dao.DangKiDAO;
import model.DangKiHoc;
import model.KiHoc;
import model.LopHocPhan;
import model.MonHoc;
import model.MonHocKiHoc;
import model.SinhVienKhoa;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestDangKiDAO {
	DangKiDAO dkhdao = new DangKiDAO();
	@Test
	public void getDKcuaSV_testChuan1() {
		//Sinh viên chưa có đăng kí
		int idSVK = 1;
		int idKihoc = 2;
		ArrayList<DangKiHoc> listDK = dkhdao.getDKcuaSV(idSVK, idKihoc);
		Assertions.assertNull(listDK);
		
	}
	@Test
	public void getDKcuaSV_testChuan2() {
		//Sinh viên đã đăng kí tối thiểu 13 tín chỉ
		int idSVK = 4;
		int idKihoc = 2;
		ArrayList<DangKiHoc> listDK = dkhdao.getDKcuaSV(idSVK, idKihoc);
		Assertions.assertNotNull(listDK);
		int tongTC = 0;
		for (int i = 0; i < listDK.size(); i++) {
			tongTC += listDK.get(i).getLopHP().getMonHocKiHoc().getMonHoc().getStc();
			Assertions.assertEquals(idSVK, listDK.get(i).getSvKhoa().getId());
			Assertions.assertEquals(idKihoc, listDK.get(i).getLopHP().getMonHocKiHoc().getKiHoc().getId());
		}
		Assertions.assertEquals(13, tongTC);
	}

	@Test
	public void getDKcuaSV_testNgoaile1() {
		//Kì học tồn tại, sinh viên không tồn tại
		int idSVK = 1000;
		int idKihoc = 2;
		ArrayList<DangKiHoc> listDK = dkhdao.getDKcuaSV(idSVK, idKihoc);
		Assertions.assertNull(listDK);
	}

	@Test
	public void getDKcuaSV_testNgoaile2() {
		//Kì học không tồn tại, sinh viên tồn tại
		int idSVK = 2;
		int idKihoc = 1000;
		ArrayList<DangKiHoc> listDK = dkhdao.getDKcuaSV(idSVK, idKihoc);
		Assertions.assertNull(listDK);
	}

	@Test
	public void getDKcuaSV_testNgoaile3() {
		//Kì học không tồn tại, sinh viên không tồn tại
		int idSVK = 1000;
		int idKihoc = 1000;
		ArrayList<DangKiHoc> listDK = dkhdao.getDKcuaSV(idSVK, idKihoc);
		Assertions.assertNull(listDK);
	}

	@Test
	public void luuDKcuaSV_testChuan1() {
		// Đăng kí 13 tín chỉ, chưa có đăng kí cũ
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 3 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(1);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(1);
		mh1.setStc(3);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(1);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(2);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 3 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(2);
		mh2.setStc(3);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(2);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(4);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 4 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(3);
		mh3.setStc(4);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(3);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(6);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 3 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(4);
		mh4.setStc(3);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(4);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(8);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNotNull(listDKnew);
			int tongTC = 0;
			for (int i = 0; i < listDK.size(); i++) {
				tongTC += listDK.get(i).getLopHP().getMonHocKiHoc().getMonHoc().getStc();
				Assertions.assertEquals(svk.getId(), listDK.get(i).getSvKhoa().getId());
				Assertions.assertEquals(listDK.get(i).getLopHP().getId(), listDKnew.get(i).getLopHP().getId());
			}
			Assertions.assertEquals(13, tongTC);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test
	public void luuDKcuaSV_testChuan2() {
		//Có đăng kí cũ gồm 13 tín chỉ, Đăng kí 13 tín chỉ gồm các môn học trùng với môn học của đăng kí cũ, khác lớp học phần với đăng kí cũ
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 3 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(4);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(1);
		mh1.setStc(3);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(1);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(1);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 3 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(2);
		mh2.setStc(3);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(2);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(3);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 4 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(3);
		mh3.setStc(4);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(3);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(5);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 3 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(4);
		mh4.setStc(3);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(4);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(7);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNotNull(listDKnew);
			int tongTC = 0;
			for (int i = 0; i < listDK.size(); i++) {
				tongTC += listDK.get(i).getLopHP().getMonHocKiHoc().getMonHoc().getStc();
				Assertions.assertEquals(svk.getId(), listDK.get(i).getSvKhoa().getId());
				Assertions.assertEquals(listDK.get(i).getLopHP().getId(), listDKnew.get(i).getLopHP().getId());
			}
			Assertions.assertEquals(13, tongTC);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test
	public void luuDKcuaSV_testChuan3() {
		//Có đăng kí cũ gồm 13 tín chỉ, Đăng kí 13 tín chỉ gồm các môn học khác với môn học của đăng kí cũ
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 4 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(4);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(3);
		mh1.setStc(4);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(3);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(6);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 3 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(4);
		mh2.setStc(3);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(4);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(8);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 3 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(5);
		mh3.setStc(3);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(5);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(10);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 3 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(6);
		mh4.setStc(3);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(6);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(12);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNotNull(listDKnew);
			int tongTC = 0;
			for (int i = 0; i < listDK.size(); i++) {
				tongTC += listDK.get(i).getLopHP().getMonHocKiHoc().getMonHoc().getStc();
				Assertions.assertEquals(svk.getId(), listDK.get(i).getSvKhoa().getId());
				Assertions.assertEquals(listDK.get(i).getLopHP().getId(), listDKnew.get(i).getLopHP().getId());
			}
			Assertions.assertEquals(13, tongTC);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test
	public void luuDKcuaSV_testChuan4() {
		//Có đăng kí cũ gồm 13 tín chỉ, Đăng kí mới nhiều hơn đăng kí cũ
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 4 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(4);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(3);
		mh1.setStc(4);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(3);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(6);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 3 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(4);
		mh2.setStc(3);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(4);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(8);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 3 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(5);
		mh3.setStc(3);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(5);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(10);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 3 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(6);
		mh4.setStc(3);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(6);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(12);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		//Tạo đăng kí môn 5 có 3 tín chỉ
		MonHocKiHoc mhkh5 = new MonHocKiHoc();
		MonHoc mh5 = new MonHoc();
		mh5.setId(1);
		mh5.setStc(3);
		mhkh5.setMonHoc(mh5);
		mhkh5.setId(1);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp5 = new LopHocPhan();
		lhp5.setId(1);
		lhp5.setMonHocKiHoc(mhkh5);
		DangKiHoc dk5 = new DangKiHoc();
		dk5.setSvKhoa(svk);
		dk5.setLopHP(lhp4);
		listDK.add(dk5);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNotNull(listDKnew);
			int tongTC = 0;
			for (int i = 0; i < listDK.size(); i++) {
				tongTC += listDK.get(i).getLopHP().getMonHocKiHoc().getMonHoc().getStc();
				Assertions.assertEquals(svk.getId(), listDK.get(i).getSvKhoa().getId());
				Assertions.assertEquals(listDK.get(i).getLopHP().getId(), listDKnew.get(i).getLopHP().getId());
			}
			Assertions.assertEquals(16, tongTC);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test
	public void luuDKcuaSV_testChuan5() {
		//Có đăng kí cũ nhiều hơn 13 tín chỉ, Đăng kí mới 13 tín chỉ 
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 4 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(3);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(3);
		mh1.setStc(4);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(3);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(6);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 3 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(4);
		mh2.setStc(3);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(4);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(8);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 3 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(5);
		mh3.setStc(3);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(5);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(10);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 3 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(6);
		mh4.setStc(3);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(6);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(12);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNotNull(listDKnew);
			int tongTC = 0;
			for (int i = 0; i < listDK.size(); i++) {
				tongTC += listDK.get(i).getLopHP().getMonHocKiHoc().getMonHoc().getStc();
				Assertions.assertEquals(svk.getId(), listDK.get(i).getSvKhoa().getId());
				Assertions.assertEquals(listDK.get(i).getLopHP().getId(), listDKnew.get(i).getLopHP().getId());
			}
			Assertions.assertEquals(13, tongTC);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test
	public void luuDKcuaSV_testNgoaile1() {
		//Đăng kí mới chưa đủ 13 tín chỉ
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 4 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(4);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(3);
		mh1.setStc(4);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(3);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(6);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertFalse(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNotNull(listDKnew);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	@Test
	public void luuDKcuaSV_testNgoaile2() {
		//Đăng kí mới không có lớp học phần nào
		ArrayList<DangKiHoc> listDK = null;
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertFalse(ok);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test
	public void luuDKcuaSV_testNgoaile3() {
		//Đăng kí mới trùng hoàn toàn đăng kí cũ
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 3 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(4);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(1);
		mh1.setStc(3);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(1);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(2);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 3 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(2);
		mh2.setStc(3);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(2);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(4);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 4 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(3);
		mh3.setStc(4);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(3);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(6);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 3 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(4);
		mh4.setStc(3);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(4);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(8);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNotNull(listDKnew);
			int tongTC = 0;
			for (int i = 0; i < listDK.size(); i++) {
				tongTC += listDK.get(i).getLopHP().getMonHocKiHoc().getMonHoc().getStc();
				Assertions.assertEquals(svk.getId(), listDK.get(i).getSvKhoa().getId());
				Assertions.assertEquals(listDK.get(i).getLopHP().getId(), listDKnew.get(i).getLopHP().getId());
			}
			Assertions.assertEquals(13, tongTC);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	@Test
	public void luuDKcuaSV_testNgoaile4() {
		//Đăng kí 13 tín chỉ có 2 lớp học phần trùng lịch học
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 4 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(4);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(3);
		mh1.setStc(4);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(3);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(6);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 3 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(4);
		mh2.setStc(3);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(4);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(8);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 3 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(5);
		mh3.setStc(3);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(5);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(10);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 3 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(6);
		mh4.setStc(3);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(6);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(13);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNull(listDKnew);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	@Test
	public void luuDKcuaSV_testNgoaile5() {
		//Đăng kí mới quá số tín quy định
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 6 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(4);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(1);
		mh1.setStc(6);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(1);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(2);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 6 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(2);
		mh2.setStc(6);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(2);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(4);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 6 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(3);
		mh3.setStc(6);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(3);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(6);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 6 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(4);
		mh4.setStc(6);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(4);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(8);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNull(listDKnew);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	

	
	@Test
	public void luuDKcuaSV_testNgoaile6() {
		//Đăng kí mới có 1 lớp học phần có sĩ số tối đa bằng sĩ số thực tế
		ArrayList<DangKiHoc> listDK = new ArrayList<>();
		//Tạo đăng kí môn 1 có 6 tín chỉ
		SinhVienKhoa svk = new SinhVienKhoa();
		svk.setId(4);
		KiHoc kh = new KiHoc();
		kh.setId(2);
		MonHocKiHoc mhkh1 = new MonHocKiHoc();
		MonHoc mh1 = new MonHoc();
		mh1.setId(1);
		mh1.setStc(6);
		mhkh1.setMonHoc(mh1);
		mhkh1.setId(1);
		mhkh1.setKiHoc(kh);
		LopHocPhan lhp1 = new LopHocPhan();
		lhp1.setId(2);
		lhp1.setSisotoida(60);
		lhp1.setSisothucte(60);
		lhp1.setMonHocKiHoc(mhkh1);
		DangKiHoc dk1 = new DangKiHoc();
		dk1.setSvKhoa(svk);
		dk1.setLopHP(lhp1);
		listDK.add(dk1);
		//Tạo đăng kí môn 2 có 6 tín chỉ
		MonHocKiHoc mhkh2 = new MonHocKiHoc();
		MonHoc mh2 = new MonHoc();
		mh2.setId(2);
		mh2.setStc(6);
		mhkh2.setMonHoc(mh2);
		mhkh2.setId(2);
		mhkh2.setKiHoc(kh);
		LopHocPhan lhp2 = new LopHocPhan();
		lhp2.setId(4);
		lhp2.setMonHocKiHoc(mhkh2);
		DangKiHoc dk2 = new DangKiHoc();
		dk2.setSvKhoa(svk);
		dk2.setLopHP(lhp2);
		listDK.add(dk2);
		//Tạo đăng kí môn 3 có 6 tín chỉ
		MonHocKiHoc mhkh3 = new MonHocKiHoc();
		MonHoc mh3 = new MonHoc();
		mh3.setId(3);
		mh3.setStc(6);
		mhkh3.setMonHoc(mh3);
		mhkh3.setId(3);
		mhkh3.setKiHoc(kh);
		LopHocPhan lhp3 = new LopHocPhan();
		lhp3.setId(6);
		lhp3.setMonHocKiHoc(mhkh3);
		DangKiHoc dk3 = new DangKiHoc();
		dk3.setSvKhoa(svk);
		dk3.setLopHP(lhp3);
		listDK.add(dk3);
		//Tạo đăng kí môn 4 có 6 tín chỉ
		MonHocKiHoc mhkh4 = new MonHocKiHoc();
		MonHoc mh4 = new MonHoc();
		mh4.setId(4);
		mh4.setStc(6);
		mhkh4.setMonHoc(mh4);
		mhkh4.setId(4);
		mhkh4.setKiHoc(kh);
		LopHocPhan lhp4 = new LopHocPhan();
		lhp4.setId(8);
		lhp4.setMonHocKiHoc(mhkh4);
		DangKiHoc dk4 = new DangKiHoc();
		dk4.setSvKhoa(svk);
		dk4.setLopHP(lhp4);
		listDK.add(dk4);
		try {
			DAO.con.setAutoCommit(false);
			boolean ok = dkhdao.luuDKcuaSV(listDK);
			Assertions.assertTrue(ok);
			//Lấy ra kiểm tra
			ArrayList<DangKiHoc> listDKnew = dkhdao.getDKcuaSV(svk.getId(), kh.getId());
			Assertions.assertNull(listDKnew);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DAO.con.rollback();
				DAO.con.setAutoCommit(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	}
