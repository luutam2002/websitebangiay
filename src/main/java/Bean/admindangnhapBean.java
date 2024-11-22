package Bean;

public class admindangnhapBean {
	private String tendangnhap;
	private String matkhau;
	private boolean quyen;
	public admindangnhapBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public admindangnhapBean(String tendangnhap, String matkhau, boolean quyen) {
		super();
		this.tendangnhap = tendangnhap;
		this.matkhau = matkhau;
		this.quyen = quyen;
	}
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public boolean isQuyen() {
		return quyen;
	}
	public void setQuyen(boolean quyen) {
		this.quyen = quyen;
	}

}
