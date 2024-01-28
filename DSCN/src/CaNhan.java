
public abstract class CaNhan {
	String hoTen;
	int tuoi;
	String diaChi;
	String sdt;
	
	
	public CaNhan() {
	}
	
	public CaNhan(String ten, int t, String dc, String dd) {
		this.hoTen = ten;
		this.tuoi = t;
		this.diaChi = dc;
		this.sdt = dd;
	}
	public abstract String hienThiTT();
	public abstract String who();
}
