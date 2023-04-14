package example.super_;

public class SupersonicAirplane extends Airplane{

	public SupersonicAirplane(String planeCode) {
		super(planeCode);	// 현 구조에서는 Airplane의 생성자 호출
	}

	// 초음속 비행기도 fly()를 사용해야 하므로 오버라이딩을 합니다.
	// 시속 시속 900 이하에서는 일반 비행, 그 이후에는 초음속 비행을 합니다.
	// 900 이하 구간에서는 오버라이딩 전 fly()를, 이후에는 재정의된 fly를 실행합니다.
	
	@Override
	public void fly() {
		if(this.speed < 900) {
			super.fly();
		} else if(this.speed + 300 <= 2200 && this.gas >= 5){
			this.speed += 300;
			this.gas -= 5;
		} else if(this.speed + 300 >= 2200 && this.gas < 5){
			this.speed = 2200;
			this.gas -= 5;
		} else {
			System.out.println("연료 부족");
		}
	}
}
