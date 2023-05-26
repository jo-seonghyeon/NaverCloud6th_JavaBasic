package example.thread2;

public class AlarmMachine implements Runnable{
	
	@Override
	public void run() {
		
		try {
			for(int i = 0; i < 500; i++) {
				System.out.println("경고옴 삑삑");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
