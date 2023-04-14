
public class CarMain {

	public static void main(String[] args) {
		
		Car c1 = new Car("그랜저", 5, "정현대");
//		c1.modelName = "그랜저";
//		c1.maxPassengers = 5;
//		c1.currendSpeed = 0;
//		c1.owner = "정현대";
//		c1.gas = 100;
		
		c1.accelerate();
		c1.accelerate();
		c1.accelerate();
		c1.showStaus();
		
		c1.break_();
		c1.break_();
		c1.showStaus();
	}

}
