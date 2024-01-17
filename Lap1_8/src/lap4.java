import java.util.Scanner;

public class lap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
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
		scanner.close();
	}

}
