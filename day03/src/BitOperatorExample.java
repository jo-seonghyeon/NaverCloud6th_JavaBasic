
public class BitOperatorExample {

	public static void main(String[] args) {
		byte a = 5;	// 00000101
		byte b = 3; // 00000011
		byte c = 48; // 00110000
		
		// 비트곱(and, &)
		System.out.println(a & b); // 00000001
		
		// 비트합(or, |)
		System.out.println(a | b); // 00000111
		
		// 배타적 논리합(xor, ^)
		System.out.println(a ^ b); // 00000110
		
		// 비트 이동 연산자(<<, >>)
		System.out.println(a << 4); // 00000101 -> 01010000
		System.out.println(c >> 3); // 00110000 -> 00000110
	}

}
