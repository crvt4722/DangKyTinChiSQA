package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SinhVienDAO;
import dto.SinhVienDTO;

@WebServlet(urlPatterns = "/saveSinhVien")
public class SaveSinhVienController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy dữ liệu từ form
		request.setCharacterEncoding("UTF-8");
        String masv = request.getParameter("masv");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String hodem = request.getParameter("hodem");
        String ten = request.getParameter("ten");
        String ngaysinhStr = request.getParameter("ngaysinh");
        Date ngaysinh = Date.valueOf(ngaysinhStr);
        String email = request.getParameter("email");
        String dt = request.getParameter("dt");
        String ghichu = request.getParameter("ghichu");
        String vaitro = request.getParameter("vaitro");
        String soNha = request.getParameter("soNha");
        String toaNha = request.getParameter("toaNha");
        String xomPho = request.getParameter("xomPho");
        String phuongXa = request.getParameter("phuongXa");
        String quanHuyen = request.getParameter("quanHuyen");
        String tinhThanh = request.getParameter("tinhThanh");

        SinhVienDTO sinhVienDTO = new SinhVienDTO(masv, username, password, hodem, ten, ngaysinh,
                                                   email, dt, ghichu, vaitro, soNha, toaNha,
                                                   xomPho, phuongXa, quanHuyen, tinhThanh);
        System.out.println(sinhVienDTO);
        SinhVienDAO sinhVienDAO = new SinhVienDAO();
        boolean success = sinhVienDAO.addSinhVien(sinhVienDTO);
        if (success) {
            response.sendRedirect("/sqa");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
