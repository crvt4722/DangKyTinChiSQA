package unittest;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dao.KiHocDAO;
import model.HocKi;
import model.KiHoc;
import model.NamHoc;

public class TestKiHocDAO {
	KiHocDAO khdao = new KiHocDAO();
	@Test
	public void getKihocdangki_testChuan1() {
		//Có 1 kì học mở đăng kí
		ArrayList<KiHoc> khdk = new ArrayList<>();
		int idKiHoc = 2;
		khdk = khdao.getKihocdangki();
		Assertions.assertNotNull(khdk);
		Assertions.assertEquals(1, khdk.size());
		Assertions.assertEquals(idKiHoc, khdk.get(0).getId());
		Assertions.assertEquals(1, khdk.get(0).getDangdk());

	}
	
}
