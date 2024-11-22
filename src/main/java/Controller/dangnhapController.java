package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.khachHangBean;
import Bo.khachhangBo;

/**
 * Servlet implementation class dangnhapController
 */
@WebServlet("/dangnhapController")
public class dangnhapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhapController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8"); // gửi dữ liệu lên kiểu unicode
			response.setCharacterEncoding("utf-8"); // nhận dữ liệu kiểu unicode
			String un = request.getParameter("txttk");
            String pass = request.getParameter("txtmk");
            if(un == null && pass == null) {
  	          RequestDispatcher rd =
  						request.getRequestDispatcher("Login.jsp");
  				rd.forward(request, response);
            	}else {
                	khachhangBo kh = new khachhangBo();
                	khachHangBean t = kh.ktdn(un, pass) ;
                		if (t!=null) {
                			
                    		HttpSession session = request.getSession();
                            session.setAttribute("dn", t);
                            response.sendRedirect("HomeController");
                            
                        }else {
                        	RequestDispatcher rd =
              						request.getRequestDispatcher("Login.jsp?tb=dangnhapsai");
                        	//Driver.switchTo().alert().getText();
                        	
      				rd.forward(request, response);
                }
            }
            
		}catch (Exception e) {
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
