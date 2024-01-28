
public class HocSinh extends CaNhan {
	String lop;
	String nangKhieu;
	
	public HocSinh() {
		super();//gọi constructor CaNhan
	}
	
	public HocSinh(String ten, int t, String dc, String dd, String c, String nk) {
		super(ten,t,dc,dd);
		this.lop = c;
		this.nangKhieu = nk;	
	}
	
	@Override
	public String hienThiTT() {
		return "Học sinh Khải";
	}
	@Override
	public String who() {
		return "hs";
	}
}
