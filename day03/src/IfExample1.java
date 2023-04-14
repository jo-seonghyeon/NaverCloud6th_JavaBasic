
public class IfExample1 {
	
	public static void main(String[] args) {
		// 0 ~ 100까지의 int 난수를 score 변수에 저장해보세요.
		int score = (int)(Math.random() * 101);
		System.out.println(score);
		
		if(score>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}
}
