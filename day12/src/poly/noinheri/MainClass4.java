package poly.noinheri;

public class MainClass4 {

	public static void main(String[] args) {
		
		Pig p1 = new Pig();
		Ghost g1 = new Ghost();
		Magician m1 = new Magician("법사1");
		
		while(p1.getHp()>0) {
			m1.huntPig(p1);
		}
		m1.huntPig(p1);
		m1.showStatus();
		
		while(g1.getHp()>0) {
			m1.huntGhost(g1);
		}
		m1.huntGhost(g1);
		m1.showStatus();
	}

}
