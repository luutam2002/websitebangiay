package Bean;

public class chitiethoadonBean {
 private long machitiethd;
 private String magiay;
 private long  soluongmua;
 private long mahoadon;
 private boolean damua;
public chitiethoadonBean() {
	super();
	// TODO Auto-generated constructor stub
}
public chitiethoadonBean(long machitiethd, String magiay, long soluongmua, long mahoadon, boolean damua) {
	super();
	this.machitiethd = machitiethd;
	this.magiay = magiay;
	this.soluongmua = soluongmua;
	this.mahoadon = mahoadon;
	this.damua = damua;
}
public long getMachitiethd() {
	return machitiethd;
}
public void setMachitiethd(long machitiethd) {
	this.machitiethd = machitiethd;
}
public String getMagiay() {
	return magiay;
}
public void setMagiay(String magiay) {
	this.magiay = magiay;
}
public long getSoluongmua() {
	return soluongmua;
}
public void setSoluongmua(long soluongmua) {
	this.soluongmua = soluongmua;
}
public long getMahoadon() {
	return mahoadon;
}
public void setMahoadon(long mahoadon) {
	this.mahoadon = mahoadon;
}
public boolean isDamua() {
	return damua;
}
public void setDamua(boolean damua) {
	this.damua = damua;
}
 
}
