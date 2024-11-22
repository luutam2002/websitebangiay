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

import Bean.khachHangBean;
import Bean.lichsuBean;
import Bo.lichsuBo;

/**
 * Servlet implementation class lichsuController
 */
@WebServlet("/lichsuController")
public class lichsuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lichsuController() {
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
			if (session.getAttribute("dn") == null) {
				response.sendRedirect("HomeController");
			} else {

				khachHangBean kh = (khachHangBean) session.getAttribute("dn");
				lichsuBo lsbo1 = new lichsuBo();
				ArrayList<lichsuBean> dslsdm = new ArrayList<lichsuBean>();
				dslsdm = lsbo1.getLichSu(kh.getMakh(), 1);
				request.setAttribute("dslichsudm", dslsdm);

				lichsuBo lsbo2 = new lichsuBo();
				ArrayList<lichsuBean> dslscm = new ArrayList<lichsuBean>();
				dslscm = lsbo2.getLichSu(kh.getMakh(), 0);
				request.setAttribute("dslichsucm", dslscm);
				RequestDispatcher rd = request.getRequestDispatcher("lichsu.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
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
