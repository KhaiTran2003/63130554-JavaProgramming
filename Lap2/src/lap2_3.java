import java.util.Scanner;

public class lap2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float money = 0;
		System.out.println("Nhập số kw điện tiêu thụ trong 1 tháng: ");
		int kw = scanner.nextInt();
		if(0<=kw&&kw<=50) {
			money = kw * 1000;
			System.out.printf("Sử dụng %d kw/tháng thì tiền điện là: %.2f vnd",kw,money);
		}
		else {
			money = 50*1000 + (kw-50)*1200;
			System.out.printf("Sử dụng %d kw/tháng thì tiền điện là: %.2f vnd",kw,money);
		}
		scanner.close();
	}
}
