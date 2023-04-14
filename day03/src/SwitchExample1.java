import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 번호로 입력해주세요.");
		System.out.println("1.카페라떼 2.아메리카노 3.녹차프라푸치노");
		int order = sc.nextInt(); 
		
		switch(order) {
			case 1:
				System.out.println("주문하신 카페라떼 나왔습니다.");
				break;
			case 2:
				System.out.println("주문하신 아메리카노 나왔습니다.");
				break;
			case 3:
				System.out.println("주문하신 녹차프라푸치노 나왔습니다.");
				break;
			default:
				System.out.println("잘못누르셨습니다.");
		}
		
		sc.close();

	}

}
