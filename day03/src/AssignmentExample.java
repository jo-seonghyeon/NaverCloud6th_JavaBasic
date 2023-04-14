
public class AssignmentExample {

	public static void main(String[] args) {
		// 선언과 초기화는 한 줄에 하셔도 됩니다.
		int a = 5, b = 5, c = 5;
		
		// 확장 대입 연산자는 해당 연산의 결과를 변수에 즉시 저장합니다.
		// 우측에 일반 대입 연산자를 이용해 대입하는 구문도 같이 두겠습니다.
		a += 3; // a = a + 3 // a에 3만큼 더한 값을 저장하는 구문
		System.out.println(a);
		
		// 여러분들이 b변수를 이용해 /=, %=를 테스트 해보세요.
		
		b /= 2; // b = 5 / 2
		System.out.println(b);
		c %= 4; // c = 5 % 4
		System.out.println(c);
		
		
		

	}

}
