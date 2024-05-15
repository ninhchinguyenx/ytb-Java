package javaTutorial.lab1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
//		Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//		In ra màn hình với định dạng:
//		<tên_sinh_viên> có điểm = <điểm>

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten sinh vien: ");
		String ten = scanner.nextLine();
		System.out.println("Diem trung binh : ");
		float diem = scanner.nextFloat();
		System.out.println("Ten sinh vien la " + ten + " Diem trung binh la " + diem);
		scanner.close();

	}
}
