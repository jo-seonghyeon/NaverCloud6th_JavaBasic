
public class BasketballPlayerMain {

	public static void main(String[] args) {
		
		BasketballPlayer b1 = new BasketballPlayer();
		b1.name = "커리";
		b1.age = 25;
		b1.height = 174;
		b1.salary = 2000;
		
		BasketballPlayer b2 = new BasketballPlayer();
		b2.name = "짜장";
		b2.age = 31;
		b2.height = 192;
		b2.salary = 1000;
		
		b1.showInfo();
		b1.dunkShoot();
		System.out.println();
		b2.showInfo();
		b2.dunkShoot();
	}

}
