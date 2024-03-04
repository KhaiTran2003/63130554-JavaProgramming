package baitapCC2;

public class SinhVien {
	
	String hoTen;
	String ngaySinh;
	float diemTB;
	
	public SinhVien() {
		
	}
	
	public SinhVien(String hoten, String birth, float diem) {
		this.hoTen = hoten;
		this.ngaySinh = birth;
		this.diemTB = diem;
	}
	
	public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoten) {
        this.hoTen = hoten;
    }
    
    public String getngaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diem) {
        this.diemTB = diem;
    }
}
