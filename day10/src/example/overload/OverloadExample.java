package example.overload;

/*
 * 오버로딩(중복 - 하나의 클래스 내부에 같은 이름을 가진 메서드를 여러개 선언할 수 있도록 허용)
 * 
 * 1. 이름과 리턴 자료형은 같아야 합니다.
 * 2. 매개변수의 순서나 자료형이 달라야 합니다.
 * 3. 같은 자료형도 개수가 다르면 허용 합니다.
 */

public class OverloadExample {

	public void input(int a) {
		System.out.println("정수 1개 입력 받았음");
	}
	
	public void input(String a) {
		System.out.println("문자열 1개 입력 받았음");
	}
	
	public void input(int a, int b) {
		System.out.println("정수 2개 입력 받았음");
	}
	
	public void input(String a, double b) {
		System.out.println("문자열 1개, 실수 1개 입력 받았음");
	}
	
	public void input(double d, String s) {
		System.out.println("실수 1개, 문자열 1개 입력 받았음");
	}
	
//	public void input(int i) {
//		System.out.println("이름, 타입 다 같으면?");
//	}
	
}
