package study;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
//		System.out.println("첫번째 주사위");
		int num1 = sc.nextInt();
		
//		System.out.println("두번째 주사위");
		int num2 = sc.nextInt();
		
//		System.out.println("세번째 주사위");
		int num3 = sc.nextInt();
		
		if(num1==num2 && num1==num3) {
			result = 10000+(num1*1000);
//			System.out.println(result);
		}
		else if(num1==num2 || num1==num3 || num2==num3) {
			if(num2==num3) {
				result = 1000+(num2*100);
			} else {
				result = 1000+(num1*100);
			}
//			System.out.println(result);
		}
		else if(num1>num2 && num1>num3) {
			result = num1 * 100;
//			System.out.println(result);
		}
		else if(num2>num1 && num2>num3) {
			result = num2 * 100;
//			System.out.println(result);
		}
		else if(num3>num1 && num3>num2) {
			result = num3 * 100;
//			System.out.println(result);
		}
//		else {
//			System.out.println("잘못 입력");
//		}
		System.out.println(result);
		sc.close();
	}
}
