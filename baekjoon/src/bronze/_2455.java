package bronze;

import java.util.Scanner;

public class _2455 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s1_in = sc.nextInt();
		int s2_out = sc.nextInt();
		int s2_in = sc.nextInt();
		int s3_out = sc.nextInt();
		int s3_in = sc.nextInt();
		int s4_out = sc.nextInt();
		
		s1 = s1_in;
		s2 = ((s1-s2_out) + s2_in);
		s3 = ((s2-s3_out) + s3_in);
		
		if(s1 > s2) {
			if(s1>s3) {
				System.out.println(s1);
			}else {
				System.out.println(s3);
			}
		} else {
			if(s2 > s3) {
				System.out.println(s2);
			} else {
				System.out.println(s3);
			}
		}
		
	}
}
