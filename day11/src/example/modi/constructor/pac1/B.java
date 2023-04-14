package example.modi.constructor.pac1;

public class B {
	
	A a1 = new A(false); // public 생성자 호출 가능
	
	A a2 = new A(55); // 디폴트 생성자 호출 가능
	
//	A a3 = new A("안됨"); // private 생성자 호출 불가능 (A 내부에서만 호출 가능)
	
}
