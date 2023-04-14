package example.override;

public class Programer extends Human{

	public String devLang;
	public int jobyear;
	
	@Override // 오버라이드 메서드 위에 붙여줘야 했던 어노테이션
	public void 코딩하기() {
		System.out.println("P이름: " + name);
		System.out.println("P나이: " + age);
		System.out.println("P사용언어: " + devLang);
		System.out.println("P경력: " + jobyear);
	}
}
