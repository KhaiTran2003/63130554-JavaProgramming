package lap3;

import java.util.Scanner;

public class lap3_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sinhVien;

        do {
            System.out.println("Nhập số lượng sinh viên cần xem: ");
            sinhVien = scanner.nextInt();
        } while (sinhVien <= 0);
        String[] hoTen = new String[sinhVien];
        float[] diem = new float[sinhVien];

        for (int i = 0; i < sinhVien; i++) {
            scanner.nextLine();
            System.out.printf("Nhập thông tin sinh viên thứ %d\n", i + 1);
            System.out.print("Họ và tên: ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Điểm thi: ");
            diem[i] = scanner.nextFloat();
            
        }

        scanner.close();
        
        for(int i=0;i<sinhVien;i++) {
        	System.out.printf("Thông tin sinh viên thứ %d: \n", i + 1);
            System.out.printf("Họ và tên: %s, Điểm thi: %.2f\n", hoTen[i], diem[i]);
        	if(diem[i]>=9) {
        		System.out.print("Học sinh xuất sắc");
        	}else if(diem[i] >=7.5 && diem[i] <9) {
        		System.out.print("Học sinh giỏi");
        	}else if(diem[i]>=6.5 && diem[i]<7.5) {
        		System.out.print("Học sinh khá");
        	}else if(diem[i]>=5&& diem[i]<6.5) {
        		System.out.print("Học sinh trung bình");
        	}else {
        		System.out.print("Học sinh yếu");
        	}
        }
    }
}
