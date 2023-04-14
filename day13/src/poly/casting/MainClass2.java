package poly.casting;

public class MainClass2 {

	public static void main(String[] args) {
		
		// Parent 타입에는 Child, Child2 모두 대입 가능
		Parent p1 = new Child();
		Parent p2 = new Child2();
		
		// Parent 타입으로는 Child, method2, Child2의 method2도 호출 가능
		p1.method2();
		p2.method2();
		
		// 오버라이딩이 전제되지 않은 method3은 호출 불가능
//		p1.method3();
//		p2.method3();
		
		Parent c1 = new Child();
		Parent c2 = new Child2();
	}
}
