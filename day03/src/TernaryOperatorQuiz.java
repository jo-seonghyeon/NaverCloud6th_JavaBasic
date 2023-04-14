
public class TernaryOperatorQuiz {

	public static void main(String[] args) {
//		난수 발생 명령어 Math.random()은 호출 위치에 0보다는 크고 1보다 작은 난수를 가져옵니다.
		int num = (int)(Math.random() * 10);
		
		// 삼항 연산자를 이용해서 난수로 얻은 값이 값이 7보다 크면 "당첨", 이하면 "낙첨"
		
		String result = (num > 7 ? "당첨" : "낙첨");
		System.out.println(num);
		System.out.println(result);

	}

}
