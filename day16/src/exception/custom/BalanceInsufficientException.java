package exception.custom;

public class BalanceInsufficientException extends RuntimeException{
	/*
	 * 일반적으로 사용자 정의 예외 클래스를 만들때는
	 * 기본 생성자와 예외 원인 메세지를 받는 생성자를
	 * 두 개 오버로딩 해서 선언만 해줍니다.
	 */
	public BalanceInsufficientException() {};
	
	public BalanceInsufficientException(String massage) {
		super(massage);
	}
	
}
