
public class SwitchExample2 {

	public static void main(String[] args) {
		// 앞에서 배운 배열과 연동해서 코드를 작성해보겠습니다.
		
		String[] foods = {"국밥", "탕수육", "초밥", "치킨", "김밥"};
		
		// 0~4 범위 난수를 얻도록 해주세요
		int idx = (int)(Math.random() * 5);
		System.out.println(foods[idx]);
		
		switch(foods[idx]) {
			case "국밥":
				System.out.println("한식입니다");
				break;
			case "탕수육":
				System.out.println("중식입니다");
				break;
			case "초밥":
				System.out.println("일식입니다");
				break;
			default:
				System.out.println("기타입니다");
				
		}

	}

}
