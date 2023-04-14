package AfterStudy;

import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		
//		WhileQuiz를 개선해주세요.
//		1. 0~100인 범위를 0~사용자가 입력한 값 으로 설정할수있게 코드를 고쳐주세요.
//		2. 위에 적힌 범위를 벗어나는 숫자가 들어오면 다시 입력받게 해주세요.
//		3. 몇 번 시도끝에 맞췄는지 정답 확인시 알려주도록 해 주세요.
				
				int count = 1;
				Scanner sc = new Scanner(System.in);
				System.out.println("최대 범위 숫자를 입력해주세요.");
				int maxNum = sc.nextInt();
				int random = (int)(Math.random() * maxNum +1);
				
				while(true) {
					System.out.println(count+"번째 시도");
					System.out.println("0~" + maxNum + " 사이의 숫자를 맞춰보세요");
					int inputNum = sc.nextInt(); 
					if(inputNum > random) {
						System.out.println("다운");
					}
					else if(inputNum < random){
						System.out.println("업");
					}
					else {
						System.out.println(count+"번째 시도 정답입니다!");
						break;
					}
					count++;
					System.out.println("");
				}
				sc.close();
	}

}
