package javaTutorial.lab1;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
//		Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//			- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//			- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so dien: ");
		float soDien = scanner.nextFloat();
		if(soDien <= 0) {			
			System.out.println("So dien phai lon hon 0");
		}else {
			int soDiem = (int) soDien;
			switch(soDien) {
			
			case soDien <= 100:
				float tienDien = soDien
				break;
			}
		}
		
		
	}
}
