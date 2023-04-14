package example.overload;

public class Human {
	String name;
	int age;

	public Human() {
		name = "이름을 입력하지 않았습니다.";
		age = 19;
	}
	
	public Human(String n, int a) {
		name = n;
		age = a;
	}
}
