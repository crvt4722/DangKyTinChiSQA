package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DangKiHocDAO;
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
		DangKiHocDAO dangKiHocDAO = new DangKiHocDAO();
		List<DangKiHocDTO> dangKiHocDTOs = dangKiHocDAO.getDangKiCuaSinhVien(1);

		System.out.println(dangKiHocDTOs);
	}
}
