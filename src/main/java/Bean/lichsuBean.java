package Bean;
import java.util.Date;
public class lichsuBean {
	private String magiay;
	private String tengiay;
	private long soluongmua;
	private long gia;
	private long makh;
	private long thanhtien;
	private Date ngaymua;
	private Boolean damua;
	private String anh;
	public lichsuBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lichsuBean(String magiay, String tengiay, long soluongmua, long gia, long makh, long thanhtien, Date ngaymua,
			Boolean damua, String anh) {
		super();
		this.magiay = magiay;
		this.tengiay = tengiay;
		this.soluongmua = soluongmua;
		this.gia = gia;
		this.makh = makh;
		this.thanhtien = soluongmua * gia;
		this.ngaymua = ngaymua;
		this.damua = damua;
		this.anh = anh;
	}
	public String getMagiay() {
		return magiay;
	}
	public void setMagiay(String magiay) {
		this.magiay = magiay;
	}
	public String getTengiay() {
		return tengiay;
	}
	public void setTengiay(String tengiay) {
		this.tengiay = tengiay;
	}
	public long getSoluongmua() {
		return soluongmua;
	}
	public void setSoluongmua(long soluongmua) {
		this.soluongmua = soluongmua;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getMakh() {
		return makh;
	}
	public void setMakh(long makh) {
		this.makh = makh;
	}
	public long getThanhtien() {
		return soluongmua*gia;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}
	public Date getNgaymua() {
		return ngaymua;
	}
	public void setNgaymua(Date ngaymua) {
		this.ngaymua = ngaymua;
	}
	public Boolean getDamua() {
		return damua;
	}
	public void setDamua(Boolean damua) {
		this.damua = damua;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
}
