package api.lang.stringb;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		// StringBuffer로 대체 가능
		StringBuilder sb = new StringBuilder("JAVA");
		
		// 문자열을 끝에 추가하는 메서드 append()
		sb.append("Program Study");	// sb + "Program Study" 와 동일
		System.out.println(sb);
		
		//
		sb.insert(12, "ming");
		System.out.println(sb);
		
		// 특정 인덱스 범위 문자열을 교체하는 메서드 replace()
		sb.replace(5, 16, "book");
		System.out.println(sb);
		
		// 문자열을 삭제하는 메서드 delete(begin, end)
		// JAVA Study
		sb.delete(4, 9);
		System.out.println(sb);
	}
}
