

public class HomeworkExample1 {

	public static void getPow(int num) {
		int result = num * num;
		System.out.println(num + "의 제곱수: " + result);
	}
	
	public static void getIntroduce() {
		System.out.println("네이버 클라우드 과정 6기 수업입니다.");
		System.out.println("기초 자바 진행중 입니다.");
		System.out.println("메서드 파트 진행중 입니다.");
	}
	
	public static void logincheck(String id, int pw) {
		if(pw == 3306) {
			System.out.println(id + "님 환영합니다.");
		} else {
			System.out.println("비밀번호를 다시 확인해주세요.");
		}
		
	}
	
	public static void main(String[] args) {
		getPow(3);
//		getIntroduce();
		logincheck("채종훈", 3306);

	}

}
