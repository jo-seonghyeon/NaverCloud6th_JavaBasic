package exception.runtime; // 실행 전엔 에러x, 실행 후 에러 발생

// 상속관계 : 부모 Animal을 상속한 자식 Dog, Cat
class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExample {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Animal da = d;
		d = (Dog)da;
		// has - a 영상 참조
		System.out.println(new StringBuffer("타입 변환 성공: Animal - > Dog"));
		
		Animal c = new Cat();
//		Dog d2 = (Dog)c; // Cat은 Dog 타입으로 변환 불가
		System.out.println(new StringBuffer("타입 변환 성공?: Dog - > Cat"));
	}

}
