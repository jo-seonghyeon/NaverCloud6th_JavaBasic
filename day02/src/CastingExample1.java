
public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 데이터 타입의 데이터를 큰 데이터 타입으로 변환 할 때는
		 * 테이터 타입을 자동으로 오려서(promotion/upcasting) 처리 합니다.
		 */
		byte b = 10;
		int  i = b;	// byte -> int로 자동 변환
		
		char c = '가';
		int j = c;	// char -> int로 자동 변환
		System.out.println(j);
		
		int k = 500;
		double d = k;	// int -> double로 자동 변환
		
		System.out.println(d);
	}

}
