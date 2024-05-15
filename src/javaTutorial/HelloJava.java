package javaTutorial;

import java.util.Scanner;

public class HelloJava {
	public static void main(String[] args) {

		// Nhập 2 số bất kỳ in ra số lớn nhất

		Scanner scanner = new Scanner(System.in);
		System.out.println("Number one: ");
		int numberOne = scanner.nextInt();
		System.out.println("Number two: ");
		int numberTwo = scanner.nextInt();
		System.out.println("Max is: " + Math.max(numberOne, numberTwo));
		scanner.close();

//		System.out.println("Hello java");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Your name is: ");
//		String name = scanner.nextLine();
//		System.out.println("Your age is: ");
//		int age = scanner.nextInt();
//		System.out.println("My name is" + name + ", age is: " + age);
//		scanner.close();

	}
}
