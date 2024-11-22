package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bo.giohangBo;

/**
 * Servlet implementation class gioController
 */
@WebServlet("/gioController")
public class gioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession();
			String ms = request.getParameter("ms");
			String ts = request.getParameter("ts");
			String giatam = request.getParameter("giatam");
			String sl = request.getParameter("soluong");
			String anh = request.getParameter("anh");
			//Kiem tra neu chua tao session("gh") thi
			if(ms!= null && ts != null && giatam != null){
			giohangBo gh=null;
			long gia = Long.parseLong(giatam);//Doi giatam tu chuoi ra so 
			if(session.getAttribute("gh")==null){
				gh = new giohangBo();//new giohangBo()
				session.setAttribute("gh", gh);//tao session("gh")
			}
			gh=(giohangBo)session.getAttribute("gh");	//Luu session("gh") vao bien gh
			gh.Them(ms, ts, Long.parseLong(giatam), Long.parseLong(sl), anh);	//goi ham them de them hang voa bien gh
			session.setAttribute("gh", gh);	//luu gh vao lai session("gh")
			response.sendRedirect("htgioController");	//dieu huong sang trang htgio.jsp
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
