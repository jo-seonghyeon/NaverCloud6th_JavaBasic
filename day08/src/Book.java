
public class Book {
	String name;
	String language;
	int price;
	int page;
	
	public Book(String b_Name, String b_Lang, int b_Price) {
		name = b_Name;
		language = b_Lang;
		price = b_Price;
		page = 0;
	}
	
	public final static int  PAGE_UP = 1;
	public final static int  PAGE_DOWN = 1;
	
	public void pageUp() {
		page += PAGE_UP;
	}
	public void pageDown() {
		page += PAGE_DOWN;
	}
	
	public void showInfo() {
		System.out.println("책 이름: " + name);
		System.out.println("언어 종류: " + language);
		System.out.println("가격: " + price);
		System.out.println("현재 페이지: " + page);
		System.out.println();
	}
}
