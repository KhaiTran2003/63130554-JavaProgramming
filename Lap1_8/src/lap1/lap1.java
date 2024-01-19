package lap1;
import java.util.Scanner;

public class lap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên sinh viên: ");
        String fullName = scanner.nextLine();
        System.out.println("Họ và tên sinh viên: " + fullName);
        System.out.println("Nhập điểm trung bình: ");
        Float dtb = scanner.nextFloat();
        System.out.println("Nhập họ và tên sinh viên: ");
        System.out.printf("Sinh viên %s có điểm trung bình: %.2f ",fullName,dtb);
        scanner.close();
    }
}
