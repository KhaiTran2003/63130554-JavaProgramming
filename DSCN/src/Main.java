
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LopHoc lop = new LopHoc();
		//String ten, int t, String dc, String dd, String c, String nk
		lop.themHS(new HocSinh("khải",20,"nha trang","009222","CNTT","Nhảy"));
		lop.themHS(new HocSinh("Huy",20,"nha trang","009222","CNTT","Nhảy"));
		lop.themHS(new HocSinh("Hiếu",20,"nha trang","009222","CNTT","Nhảy"));
		lop.themGV(new GiaoVien("Thầy Nam",20,"nha trang","009222","CNTT","Nhảy"));
		lop.inDSHS();
		lop.inDSGV();
	}
}
