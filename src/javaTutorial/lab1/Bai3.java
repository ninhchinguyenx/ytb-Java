package javaTutorial.lab1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
//		Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//		Tính và xuất ra thể tích của hình lập phương

		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh cua hinh lap phuong: ");
		float canh1 = scanner.nextFloat();

		double thetich = Math.pow(canh1, 3);

		System.out.println("The tich cua hinh lap phuong la: " + thetich);

		scanner.close();
	}
}
