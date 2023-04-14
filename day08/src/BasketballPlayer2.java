
public class BasketballPlayer2 {
	
	public String name;
	public int height;
	public int age;
	public int salary;
	
	public BasketballPlayer2(String bN, int bH, int bA, int bS) {
		name = bN;
		height = bH;
		age = bA;
		salary = bS;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("키: " + height);
		System.out.println("나이: " + age);
		System.out.println("연봉: " + salary);
	}

	public void dunkShoot() {
		if(height > 190) {
			System.out.println("덩크슛 성공");
		}else {
			System.out.println("덩크슛 실패");
		}
	}
}

