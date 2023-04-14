package example.overload;

public class Cat {
	String name;
	String kind;
	
	public Cat() {
		name = "이름을 입력해주세요";
		kind = "품종을 입력해주세요";
	}
	
	public Cat(String n, String k) {
		name = n;
		kind = k;
		System.out.println("이제부터 이 고양이의 이름은 " + n +"입니다.");
	}
	public void call() {
		System.out.println("야옹아 이리와");
	}
	
	public void call(String n) {
		System.out.println(n + "아 이리와");
	}
}
