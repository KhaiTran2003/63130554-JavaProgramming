package baitapCC1;

public class ConText {
	Tinh tinhtoan;
	public ConText setTinhToan(Tinh tinhtoan) {
		this.tinhtoan = tinhtoan;
		return this;
	}
	public float tinh(float a, float b) {
		return tinhtoan.tinh(a, b);
	}
}
