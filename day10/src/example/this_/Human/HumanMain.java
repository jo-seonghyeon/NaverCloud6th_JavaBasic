package example.this_.Human;

public class HumanMain {

	public static void main(String[] args) {
		Human kim = new Human("김철수", 20);
		kim.showInfo();
		
		Human park = new Human("박연희");
		park.showInfo();
		
		Human noname = new Human();
		noname.showInfo();
	}

}
