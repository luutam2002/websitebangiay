package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketnoidao {

	public static Connection cn;

	public void KetNoi() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Xác định HQTCSDL
			System.out.println("Da nap Dr iver");
			String st = "jdbc:sqlserver://LAPTOP-UO3MPJ36\\SQLEXPRESS:1433;databaseName=projectbanhang;user=sa;password=123456";
			cn = DriverManager.getConnection(st);
			System.out.println("Da ket noi den csdl projectbanhang");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		ketnoidao kn = new ketnoidao();
		kn.KetNoi();
	}
}