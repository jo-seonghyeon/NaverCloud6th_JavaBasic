package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {
	
	public static void main(String[] args) {
		
		int a = 100;
		double b = 2.41;
		char c = 'H';
		boolean d = false;
		
		// Wrapping : 기본 타입을 참조형 타입으로 만들기
//		Integer val1 = new Integer(a); // 취소선 deprecated(사용중지)
		Integer val1 = a;
		Double val2 = b;
		Character val3 = c;
		Boolean val4 = d;
		Byte val5 = (byte)75;
		
//		Object[] arr = {100, 2.41, 'H', false, (byte)75};
		Object[] arr = {val1, val2, val3, val4, val5};
		System.out.println(Arrays.toString(arr));
		
		// Unwapping: 래퍼 클래스를 다시 기본형 자료로 돌리기
		// 자료형 Value() 메서드를 활용
		int i = val1.intValue();
	}
}
