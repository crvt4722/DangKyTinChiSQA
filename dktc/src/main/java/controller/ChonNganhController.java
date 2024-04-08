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

import dao.KiHocDAO;
import dao.SinhVienKhoaDAO;
import dao.ThanhVienDAO;
import model.KiHoc;
import model.SinhVienKhoa;
import model.ThanhVien;
@WebServlet ("/nganh-kihoc")
public class ChonNganhController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		ThanhVien sv = (ThanhVien) httpSession.getAttribute("sinhvien");
		ArrayList<SinhVienKhoa> listNganh = (new SinhVienKhoaDAO()).getNganhcuaSV(sv.getId());
		req.setAttribute("listSVK", listNganh);
		ArrayList<KiHoc> listKi = (new KiHocDAO()).getKihocdangki();
		req.setAttribute("listKiHoc", listKi);
		RequestDispatcher  requestDispatcher= req.getRequestDispatcher("view/chonNganh.jsp");
		requestDispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idSVK = Integer.parseInt(req.getParameter("nganh"));
		int idKihoc = Integer.parseInt(req.getParameter("kihoc"));
		HttpSession session = req.getSession();
		session.setAttribute("idSVK", idSVK);
		session.setAttribute("idKihoc", idKihoc);
		SinhVienKhoa svk = (new SinhVienKhoaDAO()).getSVK(idSVK);
		session.setAttribute("infoSVK", svk);
		resp.sendRedirect("dangky");
	}
	
}