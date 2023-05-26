package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class _230420_Lotto {

	public static void main(String[] args) {
		
		// 로또복권 번호를 적재할 컬렉션 생성
		// 제네릭에는 int대신 Integer로 넣어야 함
		List<Integer> lottoWinNumbers = new ArrayList<>();
		
		Random rn = new Random();
		
		// 번호 6개가 중복 없이 당첨되려면 몇 바퀴를 돌아야 하는지 모르므로 while문 사용
		while(lottoWinNumbers.size() < 6) {
			// 1~45 범위로 난수 발생해 변수에 저장
			Integer thisTimeGetNum = rn.nextInt(1, 46);
			// 기존에 이미 뽑았던 숫자인지 확인한 후
			if(!lottoWinNumbers.contains(thisTimeGetNum)) {
				// 없는 번호면 적재
				lottoWinNumbers.add(thisTimeGetNum);
			}
		}
		// 번호 정렬
		Collections.sort(lottoWinNumbers);
		
		// 당첨 번호 체크
		System.out.println(lottoWinNumbers);
		
	}
}
