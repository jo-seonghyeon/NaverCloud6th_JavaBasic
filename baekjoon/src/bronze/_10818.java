package bronze;

import java.io.IOException;
import java.util.Scanner;

public class _10818 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Integer[] arr = new Integer[N];
		int max = -1000000;
		int min = 1000000;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
        }
		System.out.println(min);
		System.out.println(max);
		
		sc.close();
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		int N = Integer.parseInt(br.readLine());
//        Integer[] arr = new Integer[N];
//        int max = -1000000;
//        int min = 1000000;
//		
//		for(int i = 0; i < N; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if (min > arr[i]) {
//				min = arr[i];
//			}
//        }
//		bw.write(min + " " + max + "\n");
//        
//		br.close();
//		bw.flush();
//		bw.close();
	}
}
