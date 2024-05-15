package javaTutorial.lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
//		Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//		Tính toán và in ra console:
//		- chu vi hình chữ nhật
//		- diện tích hình chữ nhật
//		- cạnh nhỏ nhất của hình chữ nhật

		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh thu nhat: ");
		float canh1 = scanner.nextFloat();
		System.out.println("Canh thu hai : ");
		float canh2 = scanner.nextFloat();
		float chuvi = (canh1 + canh2) * 2;
		float dientich = canh1 * canh2;
		System.out.println("Chu vi hcn la: " + chuvi);
		System.out.println("Dien tich hcn la: " + dientich);
		System.out.println("Canh nho nhat cua hinh chu nhat la: " + Math.min(canh1, canh2));
		scanner.close();
	}
}
