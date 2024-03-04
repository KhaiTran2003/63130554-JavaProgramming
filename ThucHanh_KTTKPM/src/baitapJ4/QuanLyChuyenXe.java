package baitapJ4;

import java.util.ArrayList;
import java.util.List;

public abstract class QuanLyChuyenXe {
	List<ChuyenXe> list = new ArrayList<>();
	
	public QuanLyChuyenXe() {
		
	}
	
	public int themChuyenXe(ChuyenXe cx) {
		for(ChuyenXe c:list) {
			if(c.maSoChuyen.equals(cx.maSoChuyen)) {
				return 0;
			}
		}
		list.add(cx);
		return 1;
	}
	public void inDS() {
		for (ChuyenXe c: list) {
			System.out.println(c.toString());
		}
	}
	
	public float doanhThuNoiThanh() {
		float doanhThu = 0;
		for(ChuyenXe c: list) {
			if(c instanceof ChuyenXeNoiThanh) {
				doanhThu += c.getDoanhThu();
			}
		}
		return doanhThu;
	}
	
	public float doanhThuNgoaiThanh() {
		float doanhThu = 0;
		for(ChuyenXe c: list) {
			if(c instanceof ChuyenXeNgoaiThanh) {
				doanhThu += c.getDoanhThu();
			}
		}
		return doanhThu;
	}
	
	public float tongDoanhThu() {
		float doanhThu = 0;
		doanhThu = doanhThuNoiThanh() + doanhThuNgoaiThanh();
		return doanhThu;
	}
	
	public void inDoanhThu() {
		System.out.printf("Doanh thu nội thành: %.3f\n",doanhThuNoiThanh());
		System.out.printf("Doanh thu ngoại thành: %.3f\n",doanhThuNgoaiThanh());
		System.out.printf("Tổng doanh thu: %.3f \n",tongDoanhThu());
	}
	
}
