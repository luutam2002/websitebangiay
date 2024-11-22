package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.loaiBean;
import Bean.giayBean;
import Bo.loaiBo;
import Bo.giayBo;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
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
			//sai loaiBo lay ve dsloai
			loaiBo lBo = new loaiBo();
			ArrayList<loaiBean> dsloai = lBo.getloai();
			giayBo sBo = new giayBo();
			ArrayList<giayBean> dsgiay = sBo.getgiay();
			//lay ve ml va txttim tu htgiay.jsp 
			String ml = request.getParameter("ml");
			String key = request.getParameter("txttim");
			if(ml!=null)
			{
				dsgiay = sBo.TimMa(ml);
			}else{
					if(key!= null){
						dsgiay = sBo.Tim(key);
						}
			}
			//chuyen dsloai va dsgiay ve ht.giay
			request.setAttribute("dsloai", dsloai);
			request.setAttribute("dsgiay", dsgiay);
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
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
