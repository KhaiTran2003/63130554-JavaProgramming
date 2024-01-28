package Lap1_8.src.lap4;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;

	public SanPham() {
	}

	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	private double getThueNhapKhau() {
		// Tính thuế nhập khẩu (10% giá sản phẩm)
		return 0.1 * donGia;
	}


	public void xuat() {
		double giaBan = donGia - giamGia + getThueNhapKhau();
		// Xuất thông tin sản phẩm ra màn hình
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
		System.out.println("Giá bán cuối: \n" +giaBan);
	}

	public void nhap() {
		// Nhập thông tin sản phẩm từ người dùng
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên sản phẩm: ");
		tenSp = scanner.nextLine();

		System.out.println("Nhập đơn giá: ");
		donGia = scanner.nextDouble();

		System.out.println("Nhập giảm giá: ");
		giamGia = scanner.nextDouble();
	}

	public String getTenSp() {
		return tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
}
