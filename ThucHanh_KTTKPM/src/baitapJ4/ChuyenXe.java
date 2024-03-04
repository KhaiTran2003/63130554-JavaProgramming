package baitapJ4;

public class ChuyenXe {
    String maSoChuyen;
    String hoTenTaiXe;
    String soXe;
    double doanhThu;

    public ChuyenXe(String maso, String hoten, String soxe, double doanhthu) {
        this.maSoChuyen = maso;
        this.hoTenTaiXe = hoten;
        this.soXe = soxe;
        this.doanhThu = doanhthu;
    }

    public ChuyenXe() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Mã số chuyến: " + maSoChuyen + "\n" +
                "Tài xế: " + hoTenTaiXe + "\n" +
                "Số xe: " + soXe + "\n" +
                "Doanh thu: " + doanhThu + "\n";
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}
