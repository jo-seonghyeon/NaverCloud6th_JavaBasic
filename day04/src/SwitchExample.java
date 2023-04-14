import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		/*
		 * 직급을 입력하세요 [사원, 대리, 과장, 차장, 부장] -> 200, 300, 400, 500, 600만원 대리의 급여는 300만원입니다.
		 * or 사원은 없는 직급입니다. 직급을 다시 입력하세요.
		 */
		System.out.println("직급을 입력하세요");
		System.out.println("사원, 대리, 과장, 차장, 부장");
		Scanner sc = new Scanner(System.in);
		String lv = "";
		lv = sc.next();
		System.out.println("[입력 받은 데이터: " + lv + "]");

		switch (lv) {
		case "사원":
			System.out.println("사원의 급여는 200만원 입니다.");
			break;
		case "대리":
			System.out.println("대리의 급여는 300만원 입니다.");
			break;
		case "과장":
			System.out.println("과장의 급여는 400만원 입니다.");
			break;
		case "차장":
			System.out.println("과장의 급여는 500만원 입니다.");
			break;
		case "부장":
			System.out.println("과장의 급여는 600만원 입니다.");
			break;
		default:
			System.out.println(lv + "는(은) 없는 직급입니다.");
		}

		sc.close();
	}

}
