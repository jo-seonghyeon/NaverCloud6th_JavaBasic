package example.override;

public class Human {

	public String name;
	public int age;
	
//	public Human(String n, int a) {
//		name = n;
//		age = a;
//	}
	
	public void 자기소개() {
		System.out.println("H이름: " + name);
		System.out.println("H나이: " + age);
	}
	
	public void 코딩하기() {
		System.out.println("H일반인이라 코딩을 못합니다");
	}
	
}
