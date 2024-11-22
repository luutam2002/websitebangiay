package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//import bean.adminXacNhanbean;
import Dao.ketnoidao;

public class chitiethoadonDao {
	public int themchitiethoadon(String magiay, int soluongmua, long mahoadon, Boolean damua) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "insert into chitiethoadon(magiay,soluongmua, mahoadon,damua) values(?,?,?,?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		// truyen tham so
		cmd.setString(1, magiay);
		cmd.setInt(2, soluongmua);
		cmd.setLong(3, mahoadon);
		cmd.setBoolean(4, damua);
		int kq = cmd.executeUpdate();
		System.out.println(kq + "alo2222o");
		cmd.close();
		kn.cn.close();
		return kq;
	}

	public int Sua(long mact) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "update chitiethoadon set damua = 1 where machitiethd = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		// truyen tham so
		cmd.setLong(1, mact);
		int kq = cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
		return kq;
	}

	public int SuaTheoMaHD(long mahd) throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "update chitiethoadon set damua = 1 where mahoadon = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		// truyen tham so
		cmd.setLong(1, mahd);
		cmd.executeUpdate();;
		cmd.close();
		kn.cn.close();
		return 1;
	}
}