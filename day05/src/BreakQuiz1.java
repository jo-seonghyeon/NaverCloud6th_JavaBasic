import java.util.Scanner;

public class BreakQuiz1 {
	public static void main(String[] args) {
		// 1. 난수 2개 생성 (1~10 범위로 2개)
		// 2. while 무한 루프로 만들고, 위에서 만든 난수 2개를 a*b의 답은? 의 문제 출제
		// 3. if문으로 정답시 break로 탈출 / 오답인 경우 재입력 받도록 해주세요
		Scanner sc = new Scanner(System.in);
		int num1 = (int)(Math.random()*10 +1);
		int num2 = (int)(Math.random()*10 +1);
		
		while(true) {
			System.out.println(num1 + " x " + num2 + " = ");
			int inputNum = sc.nextInt();
			if(inputNum == num1*num2) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println("오답입니다. 다시 입력해주세요");
			}
			System.out.println();
			System.out.println("-------------------------");
			System.out.println();
		}
	}
}
