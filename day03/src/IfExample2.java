
public class IfExample2 {

	public static void main(String[] args) {
		// 0 ~ 100까지의 int 난수를 score 변수에 저장해보세요.
		int score = (int)(Math.random() * 101);
		System.out.println(score);
				
		if(score>=90) {
			System.out.println("수");
		} else if(score>=80){
			System.out.println("우");
		} else if(score>=70){
			System.out.println("미");
		} else if(score>=60){
			System.out.println("양");
		} else {
			System.out.println("가");
		}

	}

}
