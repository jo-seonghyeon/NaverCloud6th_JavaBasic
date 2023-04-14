package study;

import java.util.Scanner;

public class _1076 {	// 저항
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resistance1 = "";
		resistance1 = sc.next();
		int num1 = 0;
		int num2 = 0;
		long num3 = 0;
		
		switch (resistance1) {
		case "black":
			num1 = 0;
			break;
		case "brown":
			num1 = 10;
			break;
		case "red":
			num1 = 20;
			break;
		case "orange":
			num1 = 30;
			break;
		case "yellow":
			num1 = 40;
			break;
		case "green":
			num1 = 50;
			break;
		case "blue":
			num1 = 60;
			break;
		case "violet":
			num1 = 70;
			break;
		case "grey":
			num1 = 80;
			break;
		case "white":
			num1 = 90;
			break;
//		default:
//			System.out.println("잘못입력");
		}
		
		String resistance2 = "";
		resistance2 = sc.next();
		switch (resistance2) {
			case "black":
				num2 = 0;
				break;
			case "brown":
				num2 = 1;
				break;
			case "red":
				num2 = 2;
				break;
			case "orange":
				num2 = 3;
				break;
			case "yellow":
				num2 = 4;
				break;
			case "green":
				num2 = 5;
				break;
			case "blue":
				num2 = 6;
				break;
			case "violet":
				num2 = 7;
				break;
			case "grey":
				num2 = 8;
				break;
			case "white":
				num2 = 9;
				break;
//			default:
//				System.out.println("잘못입력");
		}
		
		String resistance3 = "";
		resistance3 = sc.next();
		switch (resistance3) {
			case "black":
				num3 = 0;
				break;
			case "brown":
				num3 = 10;
				break;
			case "red":
				num3 = 100;
				break;
			case "orange":
				num3 = 1000;
				break;
			case "yellow":
				num3 = 10000;
				break;
			case "green":
				num3 = 100000;
				break;
			case "blue":
				num3 = 1000000;
				break;
			case "violet":
				num3 = 10000000;
				break;
			case "grey":
				num3 = 100000000;
				break;
			case "white":
				num3 = 1000000000L;
				break;
//			default:
//				System.out.println("잘못입력");
		}
		System.out.println((num1+num2) * num3);
		
		sc.close();
	}
}
