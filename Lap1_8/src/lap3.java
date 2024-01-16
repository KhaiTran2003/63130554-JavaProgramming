
import java.util.Scanner;

public class lap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh hình lập phương: ");
		double canh = scanner.nextDouble();
		double s = 0;
		//s = canh * canh * canh;
		s = Math.pow(canh,3);
		
		System.out.printf("Diện tích hình lập phương cạnh là %.1f = %.1f",canh,s);
		scanner.close();
	}
}
