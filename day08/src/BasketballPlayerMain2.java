
public class BasketballPlayerMain2 {

	public static void main(String[] args) {
		
		BasketballPlayer2 b1 = new BasketballPlayer2("커리", 174, 25, 2000);
		
		BasketballPlayer2 b2 = new BasketballPlayer2("짜장", 192, 31, 1000);
		
		b1.showInfo();
		b1.dunkShoot();
		System.out.println();
		b2.showInfo();
		b2.dunkShoot();
	}

}
