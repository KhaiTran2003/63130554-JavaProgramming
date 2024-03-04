package baitapJ4;

public class MainChuyenXe {

	public static void main(String[] args) {
		QuanLyChuyenXe qlcx = new QuanLyChuyenXe() {};
		
		qlcx.themChuyenXe(new ChuyenXeNoiThanh("T01", "Trần A", "79N-99999", 7900000, 100, 500));
		qlcx.doanhThuNgoaiThanh();
		qlcx.doanhThuNoiThanh();
		qlcx.tongDoanhThu();
		qlcx.inDS();
		qlcx.inDoanhThu();
	}

}
