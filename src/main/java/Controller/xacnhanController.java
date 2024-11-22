package Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.giohangBean;
import Bean.khachHangBean;
import Bo.chitiethoadonBo;
import Bo.hoadonBo;



/**
 * Servlet implementation class xacnhanController
 */
@WebServlet("/xacnhanController")
public class xacnhanController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public xacnhanController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			HttpSession session = request.getSession();
			String xacnhan = request.getParameter("txtxacnhan");
			if (xacnhan != null) {

				khachHangBean kh = (khachHangBean) session.getAttribute("dn");
				if (kh != null) {
					ArrayList<giohangBean> gh = (ArrayList<giohangBean>) session.getAttribute("gh");
					Date a = new Date();
					SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
					String ns = f.format(a);
					Date ngaymua = f.parse(ns);
					hoadonBo hdbo = new hoadonBo();
					hdbo.themhoadon(kh.getMakh(), ngaymua, false);
					long maHD = hdbo.getMaHoaDon();
					chitiethoadonBo cthdbo = new chitiethoadonBo();
					for (giohangBean h : gh) {
						cthdbo.themchitiethoadon(h.getMagiay(), (int) h.getSoluongmua(), maHD, false);
					}
					session.removeAttribute("gh");
					response.sendRedirect("lichsuController");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
