package Bo;

import java.util.ArrayList;

import Bean.giohangBean;

public class giohangBo {
	public ArrayList<giohangBean> ds = new ArrayList<giohangBean>();
	public void Them(String magiay, String tengiay, long gia,
			long soluongmua, String anh) throws Exception{
		//kiem tra hang da co chua, neu co thi tang so luong
		for(giohangBean h:ds)
			if(h.getMagiay().equals(magiay)) {
				h.setSoluongmua(h.getSoluongmua() + soluongmua);
			return;	
			}
		giohangBean g=new giohangBean(magiay, tengiay, gia, soluongmua, soluongmua, anh);
		ds.add(g);
	}
	public void Xoa(String magiay) throws Exception{
		for(giohangBean h:ds)
			if(h.getMagiay().equals(magiay)) {
				ds.remove(h);
			return;	
			}
	}
	public void Sua(String magiay, long slmoi) throws Exception{
	int n =ds.size();
	for(int i=0;i<n;i++)
	{
		giohangBean h = ds.get(i);
		if(h.getMagiay().equals(magiay)) {
			h.setSoluongmua(slmoi);
			ds.set(i, h);
			return;
		}
	}
	}
	public long Tong() throws Exception{
		long s=0;
		for(giohangBean h:ds)
			s+= h.getThanhtien();
		return s;	
	}
}
