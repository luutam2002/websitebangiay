package Bo;

import Dao.chitiethoadonDao;

public class chitiethoadonBo {
	chitiethoadonDao cthdDao = new chitiethoadonDao();

	public int themchitiethoadon(String magiay, int soLuongmua, long mahoadon, Boolean damua) throws Exception {
		return cthdDao.themchitiethoadon(magiay, soLuongmua, mahoadon, damua);
	}

	public int Sua(long mact) throws Exception {
		return cthdDao.Sua(mact);
	}

	public int SuaTheoMaHD(long mahd) throws Exception {
		return cthdDao.SuaTheoMaHD(mahd);
	}

//	public ArrayList<adminXacNhanbean> getdsXacNhan() throws Exception {
//		return cthdDao.getdsXacNhan();
//	}
}

