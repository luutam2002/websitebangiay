package Bo;

import java.util.ArrayList;
import java.util.Date;

import Bean.adminXNHoaDonbean;
import Dao.hoadonDao;

public class hoadonBo {
	hoadonDao hddao = new hoadonDao();

	public int themhoadon(long makh, Date ngaymua, Boolean damua) throws Exception {
		return hddao.themhoadon(makh, ngaymua, damua);
	}

	public long getMaHoaDon() throws Exception {
		return hddao.getmahoadon();
	}

	public int SuaHD(long mahd) throws Exception {
		return hddao.SuaHD(mahd);
	}

//	public ArrayList<adminXNHoaDonbean> getdsHoaDon() throws Exception {
//		
//		return hddao.getdshoadon(); 
//	}

}

