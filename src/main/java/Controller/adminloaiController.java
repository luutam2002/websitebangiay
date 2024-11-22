package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.loaiBean;
import Bo.loaiBo;

/**
 * Servlet implementation class adminloaiController
 */
@WebServlet("/adminloaiController")
public class adminloaiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminloaiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			HttpSession session = request.getSession();
			if (session.getAttribute("admindn")==null) response.sendRedirect("admindangnhapController");

			String maloai = request.getParameter("txtmaloai");
			String tenloai = request.getParameter("txttenloai");

			String butadd = request.getParameter("butadd");
			String butupdate = request.getParameter("butupdate");
			loaiBo lbo = new loaiBo();
			ArrayList<loaiBean> ds = lbo.getloai();
			if (butadd != null) {
				lbo.Them(maloai, tenloai);
			} else {
				if (butupdate != null) {
					lbo.Sua(maloai, tenloai);
				} else {
					String ml = request.getParameter("ml");
					String tab = request.getParameter("tab");
					if (ml != null && tab.equals("select")) {
						lbo.Tim(ml);
						request.setAttribute("maloaisua", ml);
						request.setAttribute("tenloaisua", lbo.Tim(ml));
					}
					if (ml != null && tab.equals("delete")) {
						lbo.Xoa(ml);
					}
				}
			}
			request.setAttribute("ds", lbo.getloai());
			RequestDispatcher rd = request.getRequestDispatcher("adminloai.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
