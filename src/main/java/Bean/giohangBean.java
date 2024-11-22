package Bean;

public class giohangBean {
	private String magiay;
	private String tengiay;
	private long gia;
	private long soluongmua;
	private long thanhtien;
	private String anh;
	public giohangBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giohangBean(String magiay, String tengiay, long gia, long soluongmua, long thanhtien, String anh) {
		super();
		this.magiay = magiay;
		this.tengiay = tengiay;
		this.gia = gia;
		this.soluongmua = soluongmua;
		this.thanhtien = soluongmua * gia;
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
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getSoluongmua() {
		return soluongmua;
	}
	public void setSoluongmua(long soluongmua) {
		this.soluongmua = soluongmua;
	}
	public long getThanhtien() {
		return soluongmua * gia;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien =thanhtien;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
}
