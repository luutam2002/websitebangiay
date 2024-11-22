package Bean;
import java.util.Date;
public class adminXNHoaDonbean {
	private long mahoadon;
	private long makh;
	private String hoten;
	private String sodt;
	private Date ngaymua;
	public adminXNHoaDonbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public adminXNHoaDonbean(long mahoadon, long makh, String hoten, String sodt, Date ngaymua) {
		super();
		this.mahoadon = mahoadon;
		this.makh = makh;
		this.hoten = hoten;
		this.sodt = sodt;
		this.ngaymua = ngaymua;
	}
	public long getMahoadon() {
		return mahoadon;
	}
	public void setMahoadon(long mahoadon) {
		this.mahoadon = mahoadon;
	}
	public long getMakh() {
		return makh;
	}
	public void setMakh(long makh) {
		this.makh = makh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSodt() {
		return sodt;
	}
	public void setSodt(String sodt) {
		this.sodt = sodt;
	}
	public Date getNgaymua() {
		return ngaymua;
	}
	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}
	
}
