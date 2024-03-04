package baitapCC2;

public class MainCC2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Khải","6/3/2003",6);
		SinhVien sv2 = new SinhVien("Hào","3/8/2003",7);
		SinhVien sv3 = new SinhVien("Nam","7/1/2003",8);
		SinhVien sv4 = new SinhVien("Hiếu","30/12/2003",9);

		int soDiem = new SoSanhTheoDiem().soSanh(sv3, sv4);
		int soTen = new SoSanhTheoTen().soSanh(sv1, sv2);
	}	
}
