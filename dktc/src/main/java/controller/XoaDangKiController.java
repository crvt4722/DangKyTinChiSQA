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

@WebServlet("/xoadangki")
public class XoaDangKiController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		ArrayList<DangKiHoc> arrayList = (ArrayList<DangKiHoc>) session.getAttribute("listDk");
		ArrayList<DangKiHoc> listDk = arrayList;
		if (listDk == null)
			listDk = new ArrayList<DangKiHoc>();
		int idSVK = (int) session.getAttribute("idSVK");
		SinhVienKhoa svk =new SinhVienKhoa();
		svk.setId(idSVK);
		int idLHP = Integer.parseInt(req.getParameter("idLHP"));
		for (DangKiHoc dk : listDk)
			if (dk.getLopHP().getId() == idLHP) {
				listDk.remove(dk);
				break;
			}

		session.setAttribute("listDk", listDk);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/dangki.jsp");
		requestDispatcher.forward(req, resp);

	}
}
