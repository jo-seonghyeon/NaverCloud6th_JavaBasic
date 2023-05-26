package bronze;

import java.util.Scanner;

public class _2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int rT = sc.nextInt();
		
		int cT = 60*hour + min + rT;
		
		hour = (cT/60) % 24;
		min = cT%60;
		
		System.out.println(hour + " " + min);
		
	}
}
