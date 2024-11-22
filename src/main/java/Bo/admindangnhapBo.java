package Bo;

import Bean.admindangnhapBean;
import Dao.admindangnhapDao;

public class admindangnhapBo {
	admindangnhapDao adminDNdao = new admindangnhapDao();

	public admindangnhapBean getAdmin(String tendn, String matkhau) throws Exception {
		return adminDNdao.getAdmin(tendn, matkhau);
	}
	public long getDoanhThuThang() throws Exception {
		return adminDNdao.getDoanhThuThang();
	}
	public long getDoanhThuNam() throws Exception {
		return adminDNdao.getDoanhThuNam();
	}
	public long getSoHoaDonChuaXN() throws Exception {
		return adminDNdao.getSoHoaDonChuaXN();
	}
	public String getTKDT() throws Exception {
		return adminDNdao.getTKDT();
	}
}
