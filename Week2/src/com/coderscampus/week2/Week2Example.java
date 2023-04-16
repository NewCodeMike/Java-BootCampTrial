package com.coderscampus.week2;
import java.util.Scanner;

public class Week2Example {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your name: ");
		String name = scanner.nextLine();
		System.out.println("Type in your age: ");
		String age = scanner.nextLine();
		
		if (name.equals("Trevor") && age.equals("36")) {
			System.out.println("Holy cow it's me!");
		}
		else {
			System.out.println("Hello: " + name);
		}
		
		scanner.close();
		
//		Scanner scanner2 = new Scanner(System.in);
//		System.out.println("Type a number between 50 and 300");
//		String userNumber = scanner2.nextLine();
//		
//		Integer convertedNumber = Integer.parseInt(userNumber);
//		
//		if (convertedNumber < 50 || convertedNumber > 300) {
//			System.out.println("NO!");
//		}
//		else {
//			System.out.println("Yes!");
//		}
//		
//		scanner2.close();
	}
}
