package api.lang.string;

import java.util.Scanner;

public class StringIndexOfQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 문자 입력하기");
		String str = sc.next(); // 1. 특정 문장을 스캐너로 입력 받기
		System.out.println("찾을 단어 입력하기");
		String sear = sc.next(); // 2. 조회할 단어 입력 받기
		int sum = 0;
		int cnt = 0;
		System.out.println("단어 감지 인덱스: " + str.indexOf(sear));
		sum += str.indexOf(sear);
		for(int i = 0; i < str.length(); i++) {
			str = str.substring(str.indexOf(sear) + 1);	// 0번 인덱스 보상으로 +1
			sum += str.indexOf(sear);
			if(str.indexOf(sear) != -1) {
				cnt++;
				System.out.println("단어 감지 인덱스: " + (sum+cnt));
			}
		}
		sc.close();
	}
}

