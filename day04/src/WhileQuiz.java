import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		// 컴퓨터와 스무고개
		
		int random = (int)(Math.random() * 101);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("0~100 숫자를 맞춰보세요");
			int inputNum = sc.nextInt(); 
			if(inputNum > random) {
				System.out.println("다운");
			}
			else if(inputNum < random){
				System.out.println("업");
			}
			else {
				System.out.println("정답입니다");
				break;
			}
			System.out.println("");
		}

	}

}
