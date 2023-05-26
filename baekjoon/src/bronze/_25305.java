package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _25305 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(br);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        
        System.out.println(arr[K-1]);
        
        sc.close();
    }
	
}
