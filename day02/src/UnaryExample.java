
public class UnaryExample {

	public static void main(String[] args) {
		// 증감 연산자 ++, --
		int i = 1;
		int j = i++; // 후위 연산자는 먼저 해당 코드를 수행한 다음 연산자 로직을 수행합니다.
		// int j = i 를 먼저 수행하고
		// i++를 수행하여 1을 더합니다. (i는 2)
		// 최종적으로 j는 1, i는 2를 저장 받습니다.
		
		System.out.println(i);
		System.out.println(j);
		System.out.println("----------------------------");
		
		int x = 1;
		int y = ++x;
		// int y = ++x 를 수행하는데 ++x, 증감연산자가 변수 x보다 앞에 위치하여 즉 2가 y에 먼저 대입됩니다.
		
		
		// 아래쪽에 주석으로 22, 23번 라인데 출력될 값과 그 이유를 9, 10번 라인처럼 서술해주세요
		System.out.println(x);
		System.out.println(y);
		System.out.println("----------------------------");
	}

}
