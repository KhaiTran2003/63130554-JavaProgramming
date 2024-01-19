package lap3;

import java.util.Scanner;
public class lap3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số n: ");
		int n;
		n = scanner.nextInt();
		if(CheckNto(n)) {
			System.out.printf("%d là số nguyên tố",n);
		}
		else {
			System.out.printf("%d không là số nguyên tố",n);
		}
	}
	
	public static boolean CheckNto(int n) {
		if(n<2) {
			return false;
		}
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}	
	}
}
