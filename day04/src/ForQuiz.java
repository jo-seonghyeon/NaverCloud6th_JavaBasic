
public class ForQuiz {

	public static void main(String[] args) {
		// 랜덤 구구단을 만들어 주세요
		// 구구단의 범위는 1~9까지.
		int dan = (int)(Math.random()*9 + 1);
		for(int i = 1; i<10; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}

	}

}
