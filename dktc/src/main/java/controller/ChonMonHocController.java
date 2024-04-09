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

import dao.DangKiDAO;
import dao.MonHocKiHocDAO;
import model.DangKiHoc;
import model.MonHocKiHoc;
@WebServlet("/chon-monhoc")
public class ChonMonHocController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int idSVK = (int) session.getAttribute("idSVK");
		int idKiHoc = (int) session.getAttribute("idKihoc");
		ArrayList<DangKiHoc> arrayList = (ArrayList<DangKiHoc>) session.getAttribute("listDk");
		ArrayList<DangKiHoc> listDk = arrayList;
		ArrayList<MonHocKiHoc> listMHKH = (new MonHocKiHocDAO()).getMHcuaSV(idSVK, idKiHoc);
		if(listDk != null)
		for (int i = 0; i < listMHKH.size(); i++) {
			boolean daDK = false;
			for (DangKiHoc dk : listDk)
				if (dk.getLopHP().getMonHocKiHoc().getId() == listMHKH.get(i).getId()) {
					daDK = true;
					break;
				}
			if (daDK) {
				listMHKH.remove(i);
				i--;
			}
		}
		req.setAttribute("listMHKH", listMHKH);
		RequestDispatcher  requestDispatcher= req.getRequestDispatcher("view/chonMonHoc.jsp");
		requestDispatcher.forward(req, resp);

	}
}
