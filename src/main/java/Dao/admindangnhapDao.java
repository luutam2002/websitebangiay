package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import Bean.admindangnhapBean;

public class admindangnhapDao{
	public admindangnhapBean getAdmin(String tendn, String matkhau) throws Exception {
		admindangnhapBean admin = null;
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "select  * from dangnhap where tendangnhap = ? and matkhau = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, tendn);
		cmd.setString(2, matkhau);
		ResultSet rs = cmd.executeQuery();
		if (rs.next()) {
			String TenDangNhap = rs.getString("TenDangNhap");
			String MatKhau = rs.getString("MatKhau");
			boolean Quyen = rs.getBoolean("Quyen");
			admin = new admindangnhapBean(TenDangNhap, MatKhau, Quyen);
		}
		rs.close();
		cmd.close();
		kn.cn.close();
		return admin;
	}
	public long getDoanhThuThang() throws Exception {
		
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "select Sum(soluongmua*gia) as doanhthuthang\r\n"
				+ "from chitiethoadon join giay on chitiethoadon.magiay = giay.magiay join hoadon on hoadon.mahoadon=chitiethoadon.mahoadon\r\n"
				+ "where Month(ngaymua) = Month(GETDATE()) and chitiethoadon.damua=1";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		long doanhthu = 0;
		if (rs.next()) {
			 doanhthu = rs.getLong("doanhthuthang");
		}
		return doanhthu;
		
	}
	public long getDoanhThuNam() throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "select Sum(soluongmua*gia) as doanhthunam\r\n"
				+ "from chitiethoadon join giay on chitiethoadon.magiay = giay.magiay join hoadon on hoadon.mahoadon=chitiethoadon.mahoadon\r\n"
				+ "where year(ngaymua) = year(GETDATE()) and chitiethoadon.damua=1";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		long doanhthu = 0;
		if (rs.next()) {
			 doanhthu = rs.getLong("doanhthunam");
		}
		return doanhthu;
		
	}
	public long getSoHoaDonChuaXN() throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "select count(mahoadon) as 'chuaxn' from hoadon	\r\n"
				+ "where damua = 0";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		long chuaxn = 0;
		if (rs.next()) {
			 chuaxn = rs.getLong("chuaxn");
		}
		return chuaxn;
	}
	public String getTKDT() throws Exception {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
		String sql = "select month(ngaymua) as thang,Sum(soluongmua*gia) as doanhthuthang\r\n"
				+ "from chitiethoadon join giay on chitiethoadon.magiay = giay.magiay join hoadon on hoadon.mahoadon=chitiethoadon.mahoadon\r\n"
				+ "where  chitiethoadon.damua=1\r\n"
				+ "group by month(ngaymua)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		long doanhthuthang[]= new long[] {0,0,0,0,0,0,0,0,0,0,0,0};
		while (rs.next()) {
			 long thang = rs.getLong("thang");
			 long doanhthu = rs.getLong("doanhthuthang");
			 doanhthuthang[(int) thang-1]=doanhthu;
		}

		return Arrays.toString(doanhthuthang);
	}
}
