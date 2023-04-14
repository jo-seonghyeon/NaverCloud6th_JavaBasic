
public class CatMain {

	// 고양이를 조회하는 용도로 사용할 전용 메서드를 작성해보겠습니다.
	public static void showCatInfo(Cat cat) {
		System.out.println("고양이 나이: " + cat.age);
		System.out.println("고양이 색깔: " + cat.color);
		System.out.println("고양이 품종: " + cat.kind);
		System.out.println("고양이 이름: " + cat.name);
		System.out.println("--------------------");
	}
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.age = 3;
		c1.color = "검정";
		c1.kind = "페르시안";
		c1.name = "츄르";
		
		Cat c2 = new Cat();
		c2.age = 6;
		c2.color = "갈색";
		c2.kind = "스핑크스";
		c2.name = "사료";
		
		Cat c3 = new Cat();
		c3.age = 9;
		c3.color = "회색";
		c3.kind = "숏헤어";
		c3.name = "간식";
		
//		System.out.println("고양이 나이: " + c1.age);
//		System.out.println("고양이 색깔: " + c1.color);
//		System.out.println("고양이 품종: " + c1.kind);
//		System.out.println("고양이 이름: " + c1.name);
		
		showCatInfo(c1);
		showCatInfo(c2);
		showCatInfo(c3);
		
		// c2, c3를 새롭게 생성해주시고
		// 이 고양이들도 showCatInfo로 조회할때
		// 메모리 구조가 어떻게 전개될지 직접
		// 그려보기까지 해 주세요.
		// c1, c2, c3를 조회하는 각각의 순간
		// 3장의 메모리 구조 그림을 보내주세요.
	}

}
