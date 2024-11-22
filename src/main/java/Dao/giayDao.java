package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Bean.giayBean;
import Dao.ketnoidao;

public class giayDao {
	public ArrayList<Bean.giayBean> getgiay() throws Exception{
		ArrayList<giayBean> ds= new ArrayList<giayBean>();
		//b1 ket noi
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql="select * from giay";
		//B3: tao cau lenh prepareStatemnt
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		//b4 thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String magiay = rs.getString("magiay");
			String tengiay = rs.getString("tengiay");
			long soluong = rs.getLong("soluong");
			long gia=rs.getLong("gia");
			String maloai=rs.getString("maloai");
			String anh= rs.getString("anh");
			String tieude = rs.getString("tieude");
			ds.add(new giayBean(magiay, tengiay, soluong, gia, maloai, anh, tieude));
			
		}
		//b6: dong ket  noi va rs
				rs.close();
				kn.cn.close();
				return ds;
	}
}
