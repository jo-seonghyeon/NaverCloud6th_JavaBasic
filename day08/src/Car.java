
public class Car {
	// 차종, 최대승객, 속도, 주인, 연료
	public String modelName;
	public int maxPassengers;
	public int currendSpeed;
	public String owner;
	public int gas;
	
	// 상수 선언은 final static으로 선언
	public final static int BOOST_SPEED = 10;
	public final static int BREAK_SPEED = 10;
	
	// 생성자 들어갈 자리
	public Car(String mN, int mP, String own) {
		modelName = mN;
		maxPassengers = mP;
		currendSpeed = 0;
		owner = own;
		gas = 100;
	}
	
	// 가속 기능
	public void accelerate() {
		currendSpeed += BOOST_SPEED;
	}
	
	// 감속 기능
	public void break_() {
		currendSpeed -= BREAK_SPEED;
	}
	
	//계기판 조회
	public void showStaus() {
		System.out.println("차종: " + modelName);
		System.out.println("최대승객수: " + maxPassengers);
		System.out.println("현재속도: " + currendSpeed);
		System.out.println("차주: " + owner);
		System.out.println("연료량: " + gas);
		System.out.println();
	}
}
