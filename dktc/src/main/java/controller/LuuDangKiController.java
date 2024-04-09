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
import model.DangKiHoc;

@WebServlet("/luudangki")
public class LuuDangKiController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		ArrayList<DangKiHoc> arrayList = (ArrayList<DangKiHoc>) session.getAttribute("listDk");
		if (arrayList != null) {
			ArrayList<DangKiHoc> listDk = arrayList;
			int tongTC =   (int) session.getAttribute("tongTcSession");
			if (tongTC < 13) {
				System.out.println("tongTC"+ tongTC);
				req.setAttribute("error", "Số tín phải tối thiểu 13 tín");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/dangki.jsp");
				requestDispatcher.forward(req, resp);
				
			} else {
				boolean kq = (new DangKiDAO()).luuDKcuaSV(listDk);
				if(kq) {
					req.setAttribute("ok", "ok");
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/success.jsp");
					requestDispatcher.forward(req, resp);
				}
				else {
					req.setAttribute("error", "Đăng kí thất bại");
					RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/dangki.jsp");
					requestDispatcher.forward(req, resp);
				}
				
			}
		} 
		else {
			req.setAttribute("error", "Số tín phải tối thiểu 13 tín");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/dangki.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
