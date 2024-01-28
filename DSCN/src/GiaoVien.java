
public class GiaoVien extends CaNhan {
	
	String monDay;
	String toBoMon;
	public GiaoVien() {
		super();//gọi constructor CaNhan
	}
	
	public GiaoVien(String ten, int t, String dc, String dd, String mon, String to) {
		super(ten,t,dc,dd);
		this.monDay = mon;
		this.toBoMon = to;	
	}
	
	
	@Override
	public String hienThiTT() {
		return super.hoTen + " " + String.valueOf(super.tuoi) +  " " + super.diaChi
				+ " " + super.sdt + this.monDay + " " + this.toBoMon; 
	}
	@Override
	public String who() {
		return "gv";
	}
}
