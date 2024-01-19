package lap3;

import java.util.Scanner;
public class lap3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x;
		System.out.println("Nhập x: ");
		x = scanner.nextInt();
		System.out.printf("Bảng cửu chương %d:\n",x);
		for(int i = 1; i <=9 ;i++) {
			System.out.printf("%d x %d = %d\n",x,i,x*i);
		}

	}

}
