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
import dao.KiHocDAO;
import dao.SinhVienKhoaDAO;
import dao.ThanhVienDAO;
import model.DangKiHoc;
import model.KiHoc;
import model.LichHoc;
import model.SinhVienKhoa;
import model.ThanhVien;
@WebServlet ("/dangky")
public class DangKiController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		int idSVK = (int) session.getAttribute("idSVK");
		int idKiHoc = (int ) session.getAttribute("idKihoc");
		ArrayList<DangKiHoc> listDk = (new DangKiDAO()).getDKcuaSV(idSVK, idKiHoc);
		session.setAttribute("listDk", listDk);
		RequestDispatcher  requestDispatcher= req.getRequestDispatcher("view/dangki.jsp");
		requestDispatcher.forward(req, resp);
	}
}
