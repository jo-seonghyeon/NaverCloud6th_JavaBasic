package AfterStudy;

/*
 *  여러분들이 임의로 실행문이 3줄 이상인 메서드를 만들어보세요.
	하나는 int를 하나 입력받는 메서드로
	하나는 입력받는 자료가 없는 메서드로
	하나는 String과 int를 하나씩 입력받는 메서드로 구성해주세요.
	만들어서 잔디로 저한테 1:1로 보내주시면 됩니다.

 */
public class _230404_1 {

	public static int sum(int num) {
		
		int result = 5 + num; // 5 + 3
		
		return result;
	}
	
	public static void tmp() {
		System.out.println("어렵다");
	}
	
	public static void GoHome(String home, int time) {
		System.out.println(home + " " + time + "시에 가야지");
	}
	
	public static void main(String[] args) {
		System.out.println(sum(3)); // 8
		tmp();
		GoHome("집에", 9);

	}

}
