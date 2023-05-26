package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _2587 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(br);
        Integer[] arr = new Integer[5];
        int result = 0;
        
        for(int i = 0; i < 5; i++) {
        	arr[i] = sc.nextInt();
        	result += arr[i];
        }
        
        Arrays.sort(arr);
        
        System.out.println(result/5);
    	System.out.println(arr[2]);
        
	}
}
