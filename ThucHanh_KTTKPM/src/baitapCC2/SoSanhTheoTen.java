package baitapCC2;

public class SoSanhTheoTen implements ISoSanh<SinhVien> {

    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        return t1.getHoTen().compareTo(t2.getHoTen());
    }
}

