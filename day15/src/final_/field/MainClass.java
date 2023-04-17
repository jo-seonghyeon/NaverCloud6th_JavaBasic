package final_.field;

public class MainClass {
	
	public static void main(String[] args) {
		Person kim = new Person("김자바");
//		kim.nationaliy = "일본";
//		kim.name = "채자바";
		kim.age = 25;
		
		System.out.println("국적" + kim.nationaliy);
		System.out.println("이름" + kim.name);
		System.out.println("나이" + kim.age);
	}
}
