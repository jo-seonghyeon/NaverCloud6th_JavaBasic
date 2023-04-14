
public class Cat {
	String name;
	int age;
	String kind;
	String color;
	
	// 설계 클래스 내부에 선언하는 메서드는 static을 쓰지 않습니다.
	public void showCatInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("품종: " + kind);
		System.out.println("색깔: " + color);
		System.out.println("--------------------");
		
	}
}
