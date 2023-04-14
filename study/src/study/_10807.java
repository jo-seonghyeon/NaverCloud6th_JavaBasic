package study;

import java.util.Scanner;

public class _10807 {	// 정수 찾기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개 숫자를 입력하시겠습니까");
		int N = sc.nextInt();	// 몇 개 입력 받을래
		int[] nums = new int[N]; // 입력 받은 만큼의 배열 nums 선언
		int cnt = 0; // 출력 개수 선언
		
		System.out.println(N+ "개 만큼 숫자 입력");
		for(int i = 0; i < N; i++)  {
			nums[i] = sc.nextInt();	// 반복문으로 N개 만큼 입력 받기
		}
		System.out.println("찾으려는 정수를 입력 하세요");
		int v = sc.nextInt(); // 찾으려는 정수 v 입력 받기

		for(int i = 0; i < nums.length; i++)  { // 배열 nums의 개수(N)만큼 반복문 실행
			if(nums[i] == v) // 배열을 출력하면서 찾으려는 정수 v와 같을때마다 cnt 증가
				cnt++;
		}
		System.out.println(v + "와(과) 같은 개수는 " + cnt + "개"); // cnt 출력
		sc.close();
	}
}
