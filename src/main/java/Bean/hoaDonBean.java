package Bean;
import java.util.Date;
public class hoaDonBean {
	private long mahoadon;
	private long makh;
	private Date ngaymua;
	private boolean damua;
	public hoaDonBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hoaDonBean(long mahoadon, long makh, Date ngaymua, boolean damua) {
		super();
		this.mahoadon = mahoadon;
		this.makh = makh;
		this.ngaymua = ngaymua;
		this.damua = damua;
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
	public Date getNgaymua() {
		return ngaymua;
	}
	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}
	public boolean isDamua() {
		return damua;
	}
	public void setDamua(boolean damua) {
		this.damua = damua;
	}
	
}
