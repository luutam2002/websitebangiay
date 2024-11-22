package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import Bean.lichsuBean;

public class lichsuDao {
	public ArrayList<lichsuBean> ds = new ArrayList<lichsuBean>();

	public ArrayList<lichsuBean> getLichSu(long ma, int check) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();;
		String sql = "select * from chitiethoadon join hoadon on chitiethoadon.mahoadon=hoadon.mahoadon\r\n"
				+ "join giay on giay.magiay=chitiethoadon.magiay join KhachHang on hoadon.makh=KhachHang.makh\r\n"
				+ "where KhachHang.makh = ? and chitiethoadon.damua = ? order by hoadon.mahoadon desc";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setLong(1, ma);
		cmd.setInt(2, check);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String magiay = rs.getString("magiay");
			String tengiay = rs.getString("tengiay");
			int soluongmua = rs.getInt("soluongmua");
			long gia = rs.getLong("gia");
			long makh = rs.getLong("makh");
//			long thanhtien = rs.getLong("thanhtien");
			Date ngaymua = rs.getDate("ngaymua");
			Boolean damua = rs.getBoolean("damua");
			String anh = rs.getString("anh");
			lichsuBean ls = new lichsuBean(magiay, tengiay, soluongmua, gia, soluongmua*gia, makh, ngaymua, damua, anh);
			ds.add(ls);
			System.out.println("da them lich su");
		}
		rs.close();
		cmd.close();
		kn.cn.close();
		return ds;
	}
}
