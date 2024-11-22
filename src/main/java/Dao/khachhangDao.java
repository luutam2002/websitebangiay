package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Bean.khachHangBean;
import Dao.ketnoidao;

public class khachhangDao {
	public khachHangBean ktdn(String tendn,String pass) throws Exception{	
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "select * from KhachHang where tendn=? and pass=?";
		//b3 tao
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, tendn);
		cmd.setString(2, pass);
		//b4
		ResultSet rs = cmd.executeQuery();
		khachHangBean kh = null;
		if(rs.next()) {
			long makh = rs.getLong("makh");
			String hoten = rs.getString("hoten");
			String diachi = rs.getString("diachi");
			String sodt = rs.getString("sodt");
			String email= rs.getString("email");
			kh = new khachHangBean(makh, hoten, diachi, sodt, email, tendn, pass);
		}	
		//b6: dong ket  noi va rs
		rs.close();
		kn.cn.close();
		return kh;
	}
	public ArrayList<khachHangBean> getKH() throws Exception {
		ArrayList<khachHangBean> ds = new ArrayList<khachHangBean>();

		ketnoidao cs = new ketnoidao();
		cs.KetNoi();

		String sql = "select * from KhachHang";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();

		while (rs.next()) {
			long makh = rs.getLong("makh");
			String hoten = rs.getString("hoten");
			String diachi = rs.getString("diachi");
			String sodt = rs.getString("sodt");
			String email= rs.getString("email");
			String tendn= rs.getString("tendn");
			String pass= rs.getString("pass");
			ds.add(new khachHangBean(makh, hoten, diachi, sodt, email, tendn, pass));
		}
		rs.close();
		return ds;
	}
public int ThemKH(String hoten,String diachi,String sodt,String email,String tendn,String pass) throws Exception{ 
		
		ketnoidao cs = new ketnoidao();
		cs.KetNoi();

			String sql = "insert into KhachHang(hoten, diachi, sodt,email,tendn,pass) values(?,?,?,?,?,?)";
			PreparedStatement cmd = cs.cn.prepareStatement(sql);
			
			cmd.setString(1, hoten);
			cmd.setString(2, diachi);
			cmd.setString(3, sodt);
			cmd.setString(4, email);
			cmd.setString(5, tendn);
			cmd.setString(6, pass);

			int res = cmd.executeUpdate();
			return res;
		
	}
}
