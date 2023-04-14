
public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book("혼공자", "자바", 30000);
		
		for(int i = 0; i < 180; i++) {
			b1.pageUp();
		}
		
		b1.pageDown();
		b1.pageDown();
		
		b1.showInfo();
		
		Book b2 = new Book("쉽배자", "자바스크립트", 30000);
		
		for(int i = 0; i < 80; i++) {
			b2.pageUp();
		}
		
		for(int i = 0; i < 16; i++) {
			b2.pageDown();
		}
		b2.showInfo();
	}

}
