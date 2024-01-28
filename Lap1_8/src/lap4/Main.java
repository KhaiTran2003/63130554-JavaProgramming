package Lap1_8.src.lap4;

public class Main{
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.nhap();
        sp1.xuat();
        SanPham sp2 = new SanPham();
        sp2.nhap();
        sp2.xuat();
        SanPham sp3 = new SanPham("mì tôm",2900,290);
        sp3.xuat();
    }
}

