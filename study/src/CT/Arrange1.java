package CT;

import java.util.Scanner;

public class Arrange1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int tmp;
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}	
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
	}
}
