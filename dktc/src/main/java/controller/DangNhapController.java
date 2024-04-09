package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ThanhVienDAO;
import model.ThanhVien;
@WebServlet("/")
public class DangNhapController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher  requestDispatcher= req.getRequestDispatcher("view/login.jsp")	;
		requestDispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
        String password = req.getParameter("password");
		ThanhVien tv = new ThanhVien();
		tv.setUsername(username);
		tv.setPassword(password);
		ThanhVienDAO dao = new ThanhVienDAO();
		boolean kq = dao.checkLogin(tv);
		HttpSession httpSession = req.getSession();
		if (kq == false) {
            req.setAttribute("messageLogin", "Wrong username or password");
            req.getRequestDispatcher("view/login.jsp").forward(req, resp);
        } else {
            httpSession.setAttribute("sinhvien", tv);
            resp.sendRedirect("home");
        }

	}
}
