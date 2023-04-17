package interface_.example;

public interface RemoteController {
	
	// 최대 배터리, 최소 배터리량 상수로 지정
	int MaxBattery = 100;
	int MinBattery = 0;
	
	// 리모콘이 가져야하는 필수 기능에 대해서만 정의
	public void turnOn();
	
	public void turnOff();
	
	public void showStatus();
}
