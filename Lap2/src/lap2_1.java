import java.util.Scanner;

public class lap2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}
