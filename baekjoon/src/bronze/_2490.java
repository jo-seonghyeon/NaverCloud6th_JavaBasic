package bronze;

import java.io.IOException;
import java.util.Scanner;

public class _2490 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Integer[][] A = new Integer[3][4];
		String[] B = {"D", "C", "B", "A", "E"};
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				A[i][j] = sc.nextInt();
				if(i == 0) {
					result1 += A[i][j];					
				} else if (i == 1){
					result2 += A[i][j];
				} else {
					result3 += A[i][j];
				}
			}
		}
        
		System.out.println(B[result1]);
		System.out.println(B[result2]);
		System.out.println(B[result3]);
		
		sc.close();
		
//		bw.write(B[result1] + "\n");
//		bw.write(B[result2] + "\n");
//		bw.write(B[result3] + "\n");
		
		
//        if(result == 0) {
//        	bw.write("D" + "\n");        	
//        } else if(result == 1) {
//        	bw.write("C" + "\n");
//        } else if(result == 2) {
//        	bw.write("B" + "\n");
//        } else if(result == 3) {
//        	bw.write("A" + "\n");
//        } else if(result == 4) {
//        	bw.write("E" + "\n");
//        }
        
//		br.close();
//		bw.flush();
//		bw.close();
	}
}
