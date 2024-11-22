 package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Bean.adminXNHoaDonbean;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
public class hoadonDao {
	public int themhoadon(long makh, Date ngaymua, Boolean damua) throws Exception{
		//B1: ket noi vao csdl
				ketnoidao kn= new ketnoidao();
				kn.KetNoi();
				String sql="insert into hoadon(makh,ngaymua,damua) values(?,?,?)";
				
				//B3: tao cau lenh prepareStatemnt
				PreparedStatement cmd = kn.cn.prepareStatement(sql);
				// truyen tham so
				cmd.setLong(1, makh);
				java.sql.Date ngaysql = new java.sql.Date(ngaymua.getTime());
				cmd.setDate(2, ngaysql);
				cmd.setBoolean(3, damua);
				int kq = cmd.executeUpdate();
				System.out.println(kq + "aloo");
				cmd.close();
				kn.cn.close();
				return kq;
				}
	public long getmahoadon() throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "select max(mahoadon) as HDLN from hoadon";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		long max = 0;
		if (rs.next()) {
			max = rs.getLong(1);
		}
		cmd.close();
		kn.cn.close();
		return max;
	}

	public int SuaHD(long mahd) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "update hoadon set damua = 1 where mahoadon = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		// truyen tham so
		cmd.setLong(1, mahd);
		int kq = cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
	}


}
