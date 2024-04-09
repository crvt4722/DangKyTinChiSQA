package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LichHocDAO;
import dto.DangKiHocDTO;
import dto.LichHocDTO;

@WebServlet(urlPatterns = "/xemtkb")
public class XemTKBController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idLHP = Integer.parseInt(req.getParameter("idLHP"));
		String tenLHP = req.getParameter("tenLHP");
		LichHocDAO lichHocDAO = new LichHocDAO();
		List<LichHocDTO> lichHocDTOs = lichHocDAO.getLichHocByLHPId(idLHP);
		HttpSession session = req.getSession();
		session.setAttribute("lichHocDTOs", lichHocDTOs);
		req.setAttribute("tenLHP", tenLHP);
		RequestDispatcher  requestDispatcher= req.getRequestDispatcher("view/xemLich.jsp");
		requestDispatcher.forward(req, resp);
	}
}
