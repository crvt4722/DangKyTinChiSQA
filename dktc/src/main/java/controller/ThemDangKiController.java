package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DangKiHoc;
import model.LopHocPhan;
import model.SinhVienKhoa;
@WebServlet("/themdangki")
public class ThemDangKiController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		ArrayList<DangKiHoc> arrayList = (ArrayList<DangKiHoc>) session.getAttribute("listDk");
		ArrayList<DangKiHoc> listDk = arrayList;
		if (listDk == null)
			listDk = new ArrayList<DangKiHoc>();
		ArrayList<LopHocPhan> listLHP = (ArrayList<LopHocPhan>) session.getAttribute("listLHP");
		int idLHP = Integer.parseInt(req.getParameter("idLHP"));
		int idSVK = (int) session.getAttribute("idSVK");
		boolean daTontaiLHP = false;
		for (DangKiHoc dk : listDk) {
			if (dk.getLopHP().getId() == idLHP) {
				daTontaiLHP = true;
				break;
			}
		}
		if (!daTontaiLHP) {
			// tao dang ki moi
			DangKiHoc dkMoi = null;
			for (LopHocPhan lhp : listLHP)
				if (lhp.getId() == idLHP) {
					dkMoi = new DangKiHoc();
					dkMoi.setLopHP(lhp);
					SinhVienKhoa svk =new SinhVienKhoa();
					svk.setId(idSVK);
					dkMoi.setSvKhoa(svk);
				}
			// kiem tra co phai sua dang ki cu khong
			boolean daTontaiMHKH = false;
			int index = 0;
			for (DangKiHoc dk : listDk) {
				if (dk.getLopHP().getMonHocKiHoc().getId() == dkMoi.getLopHP().getMonHocKiHoc().getId()) {
					listDk.remove(dk);
					break;
				}
				index++;
			}
			// them dang ki moi vao danh sach
			listDk.add(index, dkMoi);
		}
		session.setAttribute("listDk", listDk);
			RequestDispatcher  requestDispatcher= req.getRequestDispatcher("view/dangki.jsp");
			requestDispatcher.forward(req, resp);


		
		

	}
}
