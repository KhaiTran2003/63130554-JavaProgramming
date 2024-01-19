package lap2;
import java.util.Scanner;

public class lap2_4 {
	Scanner scanner = new Scanner(System.in);
	public void PTB1() {
        System.out.println("Nhập a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhập b: ");
        float b = scanner.nextFloat();
        if(a==0){
            if(b ==0){
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        else {
            float x = -b/a;
            System.out.printf("Nghiệm của phương trình là: %.2f", x);
        }
	}
	
	public void PTB2() {
		float a = 0;
		float b = 0;
		float c = 0;
		System.out.println("Phương trình bậc 2 có dạng: a*x^2 + b*x + c = 0");
		System.out.println("Nhập a: ");
		a = scanner.nextFloat();
		System.out.println("Nhập b: ");
		b = scanner.nextFloat();
		System.out.println("Nhập c: ");
		c = scanner.nextFloat();
		if(a==0) {
			System.out.printf("Phương trình có 1 nghiệm: %.2f",-c/b);
		} else {
			float delta = (float)(Math.pow(b,2) - (4*a*c));
			if(delta>0) {
				float x1 = (float)(-b+Math.sqrt(delta))/(2*a);
				float x2 = (float)(-b-Math.sqrt(delta))/(2*a);
				System.out.printf("Phương trình có 2 nghiệm phân biệt: %.2f và %.2f",x1,x2);
			}
			else if(delta==0) {
				float x = -b / (2*a);
				System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f",x);
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
	}

	public void TienDien() {
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
	}
	
	public static void main(String[] args) {
		lap2_4 LAB2_4 = new lap2_4();
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("+-------------------------------+");
		System.out.println("1. Giải phương trình bậc nhất");
		System.out.println("2. Giải phương trình bậc hai");
		System.out.println("3. Tính tiền điện");
		System.out.println("+-------------------------------+");
		int luachon;
		System.out.println("Nhập lựa chọn của bạn: ");
		luachon = scanner.nextInt();
		switch(luachon) {
			case 1:
				LAB2_4.PTB1();
				break;
			case 2:
				LAB2_4.PTB2();
				break;
			case 3:
				LAB2_4.TienDien();
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ");
		}
		scanner.close();
	}
}
