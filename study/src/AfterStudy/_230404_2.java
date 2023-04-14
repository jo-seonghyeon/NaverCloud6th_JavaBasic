package AfterStudy;

/*
 *  점메추, 저메추 해주는 코드를 짜주세요.
    난수를 발생시켜서 점심이나 저녁메뉴를 콘솔에 하나 띄우면 됩니다.
 */
public class _230404_2 {

	public static void KR() {
		int KrMenu = (int)(Math.random()*10 + 1);
		switch (KrMenu) {
			case 1:
				System.out.println("국밥");
				break;
			case 2:
				System.out.println("뷔페");
				break;
			case 3:
				System.out.println("분식");
				break;
			case 4:
				System.out.println("비빔밥");
				break;
			case 5:
				System.out.println("삼겹살");
				break;
			case 6:
				System.out.println("찌개류");
				break;	
			case 7:
				System.out.println("닭요리(찜닭, 닭갈비 등)");
				break;
			case 8:
				System.out.println("탕류(알탕, 추어탕 등)");
				break;
			case 9:
				System.out.println("볶음밥");
				break;
				
			default:
				System.out.println("다시");
		}
	}
	public static void JP() {
		int JpMenu = (int)(Math.random()*10);
		switch (JpMenu) {
			case 1:
				System.out.println("우동");
				break;
			case 2:
				System.out.println("초밥");
				break;
			case 3:
				System.out.println("회덮밥");
				break;
			case 4:
				System.out.println("규동");
				break;
			case 5:
				System.out.println("카츠");
				break;
			case 6:
				System.out.println("돈가스");
				break;
			case 7:
				System.out.println("라멘");
				break;
			
			default:
				System.out.println("다시");
		}
	}
	public static void CN() {
		int CnMenu = (int)(Math.random()*10);
		switch (CnMenu) {
			case 1:
				System.out.println("짜장면");
				break;
			case 2:
				System.out.println("짬뽕");
				break;
			case 3:
				System.out.println("볶음밥");
				break;
			case 4:
				System.out.println("탕수육");
				break;
			case 5:
				System.out.println("냉면");
				break;
			default:
				System.out.println("다시");
		}
	}
	public static void ETC() {
		int EtcMenu = (int)(Math.random()*10);
		switch (EtcMenu) {
			case 1:
				System.out.println("햄버거");
				break;
			case 2:
				System.out.println("피자");
				break;
			case 3:
				System.out.println("파스타");
				break;
			case 4:
				System.out.println("카레");
				break;
			case 5:
				System.out.println("샤브샤브");
				break;
			case 6:
				System.out.println("토스트");
				break;
			case 7:
				System.out.println("편의점");
				break;
			case 8:
				System.out.println("칼국수, 비빔국수 등");
				break;
			default:
				System.out.println("다시");
		}
	}
	public static void main(String[] args) {
		KR();	// 한식
		JP();	// 일식
		CN();	// 중식
		ETC();	// 기타
	}
}
