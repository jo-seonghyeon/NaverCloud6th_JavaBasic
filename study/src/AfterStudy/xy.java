package AfterStudy;

public class xy {

	public static void main(String[] args) {
//		중첩반복문을 이용해서
//		4x + 5y = 60
//		이 방정식의 양수 해를 모두 구하는 반복문을 작성해주세요.
		
		for(int i = 15; i>0; i-=5) {
			for(int j = 2; j<12; j+=2) {
				if((4*i)+(5*j)==60) {
					System.out.print(4*i + " + " + 5*j + " = " + ((4*i)+(5*j)));
					System.out.println(" -> x = " + i + ", y = " + j);
				}
			}
//			System.out.println();
		}

	}

}
