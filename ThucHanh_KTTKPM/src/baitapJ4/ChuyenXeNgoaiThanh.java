package baitapJ4;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
	String noiDen;
	int soNgayDi;
	public ChuyenXeNgoaiThanh(String maso, String hoten, String soxe, double doanhthu, String noiden, int songay) {
		super(maso,hoten,soxe,doanhthu);
		this.noiDen = noiden;
		this.soNgayDi = songay;
	}
	
	public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    
    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int songaydi) {
        this.soNgayDi = songaydi;
    }
}
