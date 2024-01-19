package lap3;

import java.util.Scanner;
import java.util.Arrays;
public class lap3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//nhập mảng
		int MAX = 5;
		int[] arr = new int[MAX];
		for(int i=0;i<MAX;i++) {
			System.out.printf("Nhập giá trị cho a[%d] = ",i);
			arr[i] = scanner.nextInt();
		}
		System.out.println("Mảng bạn đã nhập: ");
		for(int i=0;i<MAX;i++) {
			System.out.printf("%d ",arr[i]);
		}
		//tìm giá trị nhỏ nhất trong mảng
		int min = arr[0];
		for(int i=0;i<MAX;i++) {
			if(arr[i]==min) {
				min = arr[i];
			}
		}
		System.out.printf("\nGiá trị nhỏ nhất trong mảng: %d",min);
		//sắp xếp mảng
		Arrays.sort(arr);
		//trung bình cộng phần tử chia hết cho 3
		float s = 0;
		int dem = 0;
		for(int i=0;i<MAX;i++) {
			if(arr[i]%3==0) {
				s+=arr[i];
				dem++;
			}
		}
		System.out.printf("\nTrung bình cộng phần tử chia hết cho 3 = %.2f",(float)s/dem);
	}

}
