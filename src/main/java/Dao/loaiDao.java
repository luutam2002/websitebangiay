package Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Bean.loaiBean;
public class loaiDao {
	
		public ArrayList<loaiBean> getloai() throws Exception{
			ArrayList<loaiBean> ds = new ArrayList<loaiBean>();
			//B1: ket noi vao csdl
			ketnoidao kn= new ketnoidao();
			kn.KetNoi();
			String sql="select * from loai";
			//B3: tao cau lenh prepareStatemnt
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			//b4: thuc hien cau lenh
			ResultSet rs=cmd.executeQuery();
			//b5: duyet rs de luu vao mang ds
			while(rs.next()) {
				String maloai = rs.getString("maloai");
				String tenloai = rs.getString("tenloai");
				ds.add(new loaiBean(maloai,tenloai));
			}
			//b6: dong ket  noi va rs
			rs.close();
			kn.cn.close();
			return ds;
		}
		public int Them(String maloai,String tenloai)throws Exception {
			ketnoidao cs = new ketnoidao();
			cs.KetNoi();
			String sql="insert into loai(maloai,tenloai) value(?,?)";
			PreparedStatement cmd = cs.cn.prepareStatement(sql);
			//b4: thuc hien cau lenh
			//b5: duyet rs de luu vao mang ds
			//b6: dong ket  noi va rs
			cmd.setString(1,maloai);
			cmd.setString(2,tenloai);
			cs.cn.close();
			return cmd.executeUpdate();
		}
		public int Sua(String maloai,String tenloai)throws Exception {
			ketnoidao cs = new ketnoidao();
			cs.KetNoi();
			String sql="update loai set tenloai=? where maloai=?";
			PreparedStatement cmd = cs.cn.prepareStatement(sql);
			//b4: thuc hien cau lenh
			//b5: duyet rs de luu vao mang ds
			//b6: dong ket  noi va rs
			cmd.setString(2,maloai);
			cmd.setString(1,tenloai);
			cs.cn.close();
			return cmd.executeUpdate();
		}
		public int Xoa(String maloai)throws Exception {
			ketnoidao cs = new ketnoidao();
			cs.KetNoi();
			String sql="delete from loai where maloai = ?";
			PreparedStatement cmd = cs.cn.prepareStatement(sql);
			//b4: thuc hien cau lenh
			//b5: duyet rs de luu vao mang ds
			//b6: dong ket  noi va rs
			cmd.setString(1,maloai);
			cs.cn.close();
			return cmd.executeUpdate();
		}
	}


