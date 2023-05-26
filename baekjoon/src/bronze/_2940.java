package bronze;

import java.util.Scanner;

public class _2940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] A1 = new Integer[4];
		Integer[] A2 = new Integer[4];
		Integer[] A3 = new Integer[4];
		String[] B = {"D", "C", "B", "A", "E"};
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		
		for(int i = 0; i < 4; i++) {
			A1[i] = sc.nextInt();
			A2[i] = sc.nextInt();
			A3[i] = sc.nextInt();
			
			result1 += A1[i];
			result2 += A2[i];
			result3 += A3[i];
		}
		
		
		System.out.println(B[result1]);
		System.out.println(B[result2]);
		System.out.println(B[result3]);
		
		sc.close();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		Integer[] A = new Integer[4];
//		String[] B = {"D", "C", "B", "A", "E"};
//		int result = 0;
//		
//		for(int i = 0; i < 4; i++) {
//			A[i] = Integer.parseInt(br.readLine());
//			result += A[i];
//		}
//        
//		bw.write(B[result] + "\n");
//        
//		br.close();
//		bw.flush();
//		bw.close();
	}
}
