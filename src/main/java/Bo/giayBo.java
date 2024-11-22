package Bo;

import java.util.ArrayList;

import Bean.giayBean;
import Dao.giayDao;

public class giayBo {
	giayDao gdao = new giayDao();
	ArrayList<giayBean> ds;
	public ArrayList<giayBean> getgiay() throws Exception{
		ds=gdao.getgiay();
		return ds;
	}
	//viet ham de tim giay theo ma loai
	public ArrayList<giayBean> TimMa(String maloai) throws Exception{
		ArrayList<giayBean> tam=new ArrayList<giayBean>();
		for(giayBean s:ds)
			if(s.getMaloai().equals(maloai))
				tam.add(s);
		return tam;
	}
	//viet ham de tim giay theo tengiay vs tieu de
	public ArrayList<giayBean> Tim(String key) throws Exception{
		ArrayList<giayBean> tam = new ArrayList<giayBean>();
		for(giayBean s:ds)
			if(s.getTengiay().toLowerCase().contains(key.toLowerCase()) 
					|| s.getTieude().toLowerCase().contains(key.toLowerCase()))
				tam.add(s);
		return tam;
}
}
