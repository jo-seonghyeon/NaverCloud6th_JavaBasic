package AfterStudy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapQuiz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원가입 ID를 입력하세요 : ");
		String loginId = sc.next();
		System.out.print("회원가입 비밀번호를 입력하세요 : ");
		String loginPw = sc.next();
		
		Map<String, String> loginMap = new HashMap<>();
		
		loginMap.put(loginId, loginPw);
		
		while(true) {
			System.out.print("로그인 ID를 입력하세요 : ");
			String id = sc.next();
			System.out.print("로그인 비밀번호를 입력하세요 : ");
			String pw = sc.next();
			if(!loginMap.containsKey(id)) {
				System.out.println("입력하신 ID가 존재하지 않습니다.");
			}else{
				if(loginMap.get(id).equals(pw)) {
					System.out.println("로그인 성공.");
					return;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
		}
		
	}
}
