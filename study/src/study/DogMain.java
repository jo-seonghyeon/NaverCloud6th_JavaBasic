package study;

public class DogMain {

	public static void showDogInfo(Dog dog) {
		System.out.println("이름: " + dog.name);
		System.out.println("나이: " + dog.age);
		System.out.println("소리: " + dog.sound);
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.age = 2;
		dog1.name = "비트";
		dog1.sound = "멍멍";
		
		showDogInfo(dog1);
		
		Dog dog2 = new Dog();
		dog2.age = 3;
		dog2.name = "캠프";
		dog2.sound = "멍멍2";
		showDogInfo(dog2); 
		
		Dog dog3 = new Dog();
		dog3.age = 4;
		dog3.name = "안녕";
		dog3.sound = "멍멍3";
		
		showDogInfo(dog3);
	}

}
