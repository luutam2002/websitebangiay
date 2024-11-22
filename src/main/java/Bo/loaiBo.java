package Bo;

import java.util.ArrayList;

import Bean.loaiBean;
import Dao.loaiDao;

public class loaiBo {
	loaiDao ldao = new loaiDao();
	ArrayList<loaiBean> ds;
	public ArrayList<loaiBean> getloai() throws Exception{
		ds=ldao.getloai();
		return ds;
		
	}
	public int Them(String maloai,String tenloai) throws Exception {
		for(loaiBean loai : ds) {
			if(loai.getMaloai().equals(maloai)) {
				return 0;
			}		
		}
		return ldao.Them(maloai, tenloai);
	}
	public String Tim(String maloai) throws Exception {
		for(loaiBean loai : ds) {
			if(loai.getMaloai().equals(maloai)) {
				return loai.getTenloai();
			}		
		}
		return null;
	}
	public int Xoa(String maloai) throws Exception {
		return ldao.Xoa(maloai);
	}
	public int Sua(String maloai,String tenloai) throws Exception {
		return ldao.Sua(maloai, tenloai);
	}
}
