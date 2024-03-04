package baitapJ4;

public class ChuyenXeNoiThanh extends ChuyenXe {
	int soTuyen;
	int soKm;
	public ChuyenXeNoiThanh(String maso, String hoten, String soxe, double doanhthu, int sotuyen, int km) {
		super(maso,hoten,soxe,doanhthu);
		this.soTuyen = sotuyen;
		this.soKm = km;
	}
	
	public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int sotuyen) {
        this.soTuyen = sotuyen;
    }
    
    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int km) {
        this.soKm = km;
    }
	
}
