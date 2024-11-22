package Bo;

import java.util.ArrayList;

import Bean.khachHangBean;
import Dao.khachhangDao;

public class khachhangBo {
	khachhangDao kdao = new khachhangDao();
	ArrayList<khachHangBean> ds;
	public ArrayList<khachHangBean> getKH() throws Exception {
		ds = kdao.getKH();
		return ds;
	}
	
	public khachHangBean ktdn(String tendn,String pass) throws Exception{
		return kdao.ktdn(tendn, pass);
	}
	
	
	public int ThemKH(String hoten,String diachi,String sodt,String email,String tendn,String pass) throws Exception{
		for(khachHangBean t :ds) {
			if(tendn == null||t.getTendn().equals(tendn)) {
				return 0;
			}
		}
		return kdao.ThemKH(hoten, diachi, sodt, email, tendn, pass);
	}

		
}
