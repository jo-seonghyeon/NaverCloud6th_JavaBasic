package example.super_;

public class Airplane {
	public String planeCode;
	public int speed;
	public int gas;
	
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		this.speed = 0;
		this.gas = 100;
	}
	
	// 최대속도 900, 호출시 연료 3차감, 속도 100씩 증가 
	public void fly() {
		if(this.speed >= 900) {
			this.speed = 900;
			this.gas -= 3;
			return;
		}
		if(this.gas - 3 < 0) {
			System.out.println("연료 부족");
			return;
		}
		this.speed += 100;
		this.gas -= 3;
	}
	
	// 현재 비행기 상태 출력
	public void showStatus() {
		System.out.println("비행기 코드명: " + planeCode);
		System.out.println("현재 속도: " + speed);
		System.out.println("현재 연료: " + gas);
	}
	
}
