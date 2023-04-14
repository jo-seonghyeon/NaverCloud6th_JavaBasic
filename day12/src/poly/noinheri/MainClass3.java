package poly.noinheri;

public class MainClass3 {

	public static void main(String[] args) {
		
		Rat rat1 = new Rat();
		Rat rat2 = new Rat();
		Warrior w1 = new Warrior("전사1");
		
//		while(rat1.getHp()>0) {
//			w1.huntRat(rat1);
//		}
		w1.huntRat(rat1);
		w1.huntRat(rat1);
		w1.huntRat(rat1);
		w1.showStatus();
	}

}
