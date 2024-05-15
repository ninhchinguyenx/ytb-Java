package javaTutorial.lab1;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
//		Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
//			- dưới 10M: không đóng thuế
//			- từ 10M tới 15M: thuế 10%
//			- từ 15 tới 30M : thuế 20%
//			- trên 30M: thuế 50%

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so tien thue: ");
		float tienThue = scanner.nextFloat();
		if (tienThue < 10) {
			System.out.println("Khong dong thue");
		} else if (tienThue < 15) {
			float tien = (tienThue * 10) / 100;
			System.out.println("Thue 10% la" + tien);
		} else if (tienThue < 30) {
			float tien = (tienThue * 20) / 100;
			System.out.println("Thue 20% la " + tien);

		} else {
			float tien = (tienThue * 50) / 100;
			System.out.println("Thue 50% la" + tien);
		}

		scanner.close();
	}
}
