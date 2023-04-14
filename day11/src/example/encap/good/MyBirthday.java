package example.encap.good;

public class MyBirthday {

	/*
	 * 은닉(캡슐화)시 변수는 무조건 private으로 처리
	 */
	private int year;
	private int month;
	private int day;
	
	// alt + shift + s // 마우스 우클릭 + source
	// >> generate constructor using fields 선택 (생성자 자동 생성)
	public MyBirthday(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	/*
	 * 은닉된 변수에 접근하기 위해서는
	 * 클래스 설계시 미리 설정해둔 setter/getter 메서드를
	 * 이용해 데이터에 접근해야 합니다.
	 */
	
	/*
	 * setter 메서드 선언
	 * 1. setter메서드는 은닉변수에 값을 저장(세팅)하기 위해 선언합니다.
	 * 2. 메서드의 접근제한자는 public으로 설정하고
	 *    이름은 일반적으로 set+변수명 으로 지정합니다.
	 */
	public void setYear(int year) {
		if(year < 1 || year > 2023) {
			this.year = 1993;
		} else {
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			this.month = 9;
		} else {
			this.month = month;
		}
	}
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			this.day = 7; // 잘못 들어온 수에 대한 처리는 알아서.
		} else {
			this.day = day;
		}
	}
	
	/*
	 * getter 메서드 선언
	 * 1. getter메서드는 말 그대로 수를 get하는 용도입니다.
	 * 2. 값을 조회만 할 수 있고 변경은 불가능 하기 때문에 직접 조회보다 보안성을 높여줍니다.
	 * 3. 이름은 마찬가지로 get+변수명을 사용해 만듭니다.
	 */
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(this.year + "년");
		System.out.println(this.month + "월");
		System.out.println(this.day + "일");
	}
}










