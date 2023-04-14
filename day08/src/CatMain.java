
public class CatMain {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		c1.age = 3;
		c1.name = "비트";
		c1.kind = "스핑크스";
		c1.color = "검정";
				
		
		Cat c2 = new Cat();
		c2.age = 5;
		c2.name = "캠프";
		c2.kind = "페르시안";
		c2.color = "갈색";
		
		c1.showCatInfo();
		c2.showCatInfo();
	}

}
