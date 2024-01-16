import java.util.Scanner;

public class lap2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		float chuvi = 0;
		float dientich = 0;
		float cd, cr;
		System.out.println("Nhập chiều dài hình chữ nhật: ");
		cd = scanner.nextFloat();
		System.out.println("Nhập chiều rộng hình chữ nhật: ");
		cr = scanner.nextFloat();
		chuvi = (cd+cr)*2;
		dientich = cd * cr;
		System.out.printf("Chu vi hình chữ nhật = %.2f\n",chuvi);
		System.out.printf("Diện tích hình chữ nhật = %.2f",dientich);
		float edgeMin = Math.min(cd,cr);
		System.out.printf("Cạnh nhỏ nhất: %.2f",edgeMin);
		scanner.close();
	}

}
