package exception.runtime; // 실행 전엔 에러x, 실행 후 에러 발생

public class NullPointerExample {
	
	public static void main(String[] args) {
		
		String str = null;
//		str = "Hello";
		
		// toLowerCase는 모든 문자열을 소문자로 만들어줍니다.
		System.out.println(str.toLowerCase());
		
	}
}
