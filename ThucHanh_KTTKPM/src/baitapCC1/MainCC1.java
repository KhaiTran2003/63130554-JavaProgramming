package baitapCC1;

public class MainCC1 {
	public static void main(String[] args) {
		ConText context = new ConText();
		System.out.println(context.setTinhToan(new Cong()).tinh(4,4));
		System.out.println(context.setTinhToan(new Tru()).tinh(4,4));
		System.out.println(context.setTinhToan(new Nhan()).tinh(4,4));
		System.out.println(context.setTinhToan(new Chia()).tinh(4,4));
	}
}
