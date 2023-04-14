
public class SoccerPlayer {
	public String name;
	public String league;
	public int age;
	public int salary;
	
	public SoccerPlayer(String sN, String sL, int sA, int sS) {
		name = sN;
		league = sL;
		age = sA;
		salary = sS;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("리그: " + league);
		System.out.println("나이: " + age);
		System.out.println("연봉: " + salary);
		System.out.println();
	}
}
