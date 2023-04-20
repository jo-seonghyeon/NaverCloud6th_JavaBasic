package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		// Map<key, value>
		Map<String, Integer> map = new HashMap<>();
		
		// Map에 객체를 저장 put(key, value)
		map.put("치킨", 30000);
		map.put("라면", 4000);
		map.put("탕수육", 20000);
		
		// 중복 key를 넣으면, 가장 마지막에 넣은 하나만 적용됨
		map.put("치킨", 25000);
		
		System.out.println(map);
		
		// Map에 저장된 key, value 쌍(entry) 개수 측정 size()
		System.out.println(map.size());
		
		// Map에 저장된 value값을 key값으로 얻기 get(key)
		// Integer price = map.get("탕수육");
		int price = map.get("탕수육");
		System.out.println("족발의 가격: " + price + "원");
		
		// Map에서 key를 전부 추출하기
		// 앞서 배운 Set 형식으로 추출됩니다.
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		// Iterator로 변경해서 저장
		Iterator<String> kIter = kSet.iterator(); // Set에서 배운거 복습
		System.out.println("------------------------------");
		
		// Iterator를 while문으로 반복시켜, 모든 메뉴의 값을 출력
		while(kIter.hasNext()) {
			String menu = kIter.next();
			System.out.println(menu + "의 가격은 " + map.get(menu) + "원");
		}
		
		
		
	}
}
