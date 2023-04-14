
public class Cat2 {
	String name;
	int age;
	String kind;
	String color;
	
	public Cat2(String cN, int cA, String cK, String cC) {
		name = cN;
		age = cA;
		kind = cK;
		color = cC;
	}
	
	// 설계 클래스 내부에 선언하는 메서드는 static을 쓰지 않습니다.
	public void showCatInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("품종: " + kind);
		System.out.println("색깔: " + color);
		System.out.println();
		
	}
}
