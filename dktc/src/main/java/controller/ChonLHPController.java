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
import dao.LichHocDAO;
import dao.LopHocPhanDAO;
import model.DangKiHoc;
import model.LichHoc;
import model.LopHocPhan;
import model.SinhVienKhoa;

@WebServlet("/chonLHP")
public class ChonLHPController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int idSVK = (int) session.getAttribute("idSVK");
		int idKiHoc = (int) session.getAttribute("idKihoc");
		int idMHKH = Integer.parseInt(req.getParameter("idMH"));
		// lay danh sach mon hoc duoc dang ki trong ki
		ArrayList<LopHocPhan> listLHP = (new LopHocPhanDAO()).getLHPtheoMH(idMHKH);
		// loai cac LHP trung lich voi cac lop da hoc
		ArrayList<DangKiHoc> listDk = (ArrayList<DangKiHoc>)session.getAttribute("listDk");
		if ((listDk != null) && (listLHP != null)) {
			ArrayList<LichHoc> lichdachon = new ArrayList<LichHoc>();
			LichHocDAO lhdao = new LichHocDAO();
			for (DangKiHoc dk : listDk) {
				lichdachon.addAll(lhdao.getLHcuaLHP(dk.getLopHP().getId()));
			}
			for (int i = 0; i < listLHP.size(); i++) {
				ArrayList<LichHoc> listLH = lhdao.getLHcuaLHP(listLHP.get(i).getId());
				boolean ok = true;
				for (LichHoc lhmoi : listLH) {
					for (LichHoc lhdk : lichdachon)
						if (lhmoi.getTuan().equals(lhdk.getTuan()) && lhmoi.getNgay().equals(lhdk.getNgay())
								&& lhmoi.getKip().equals(lhdk.getKip())) {
							ok = false;
							break;
						}
					if (!ok)
						break;
				}
				if (!ok) {
					listLHP.remove(i);
					i--;
				}
			}
		}
		session.setAttribute("listLHP", listLHP);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/chonLHP.jsp");
		requestDispatcher.forward(req, resp);

	}

	
}
