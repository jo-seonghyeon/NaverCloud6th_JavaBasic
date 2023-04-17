package has_a;

public class Gun {
	
	private int bullet;
	private String modelName;
	private String gunNumber;
	
	public Gun(String modelName, String gunNumber) {
		this.bullet = 5;
		this.modelName = modelName;
		this.gunNumber = gunNumber;
	}
	
	public void shoot() {
		if(this.bullet > 0) {
			this.bullet--;
			System.out.println("총알을 쐈습니다.");
		} else {
			System.out.println("총알이 없어서 안나갑니다.");
		}
	}
	
	public void reload() {
		this.bullet = 5;
	}
}
