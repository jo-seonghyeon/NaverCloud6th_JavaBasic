package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	
	public static void main(String[] args) {
		Date date = new Date(); // java.util.Date로 import
		System.out.println(date);
		
		// 현재시간 이외의 시간으로 입력하는 경우
		Date date2 = new Date(100000000000L);
		System.out.println(date2);
		
		Date date3 = new Date(122, 10, 9, 18, 30, 0);
		System.out.println(date3);
		
		// 날짜 양식 바꾸기
		// 1. SimpleDateFormat 객체를 생성하는데, 표현 양식을 넣어 생성한다.
		// 예시) 2023년 4월 20일 10시 09분 28초 형식으로 양식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		// 2. sdf.forMat(Date타입변수;) 를 넣어서 콘솔에 찍는다.
		System.out.println(sdf.format(date));
		
		// 오늘은 X요일 입니다. 오늘은 1년중 Y번째 날입니다.
		SimpleDateFormat sdf2 = new SimpleDateFormat("오늘은 올 해의 D번째 날 입니다.");
		SimpleDateFormat sdf3 = new SimpleDateFormat("오늘은 E요일 입니다.");
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		
	}
	
}
