package ex16collection;

import java.util.*;


//HashMap<k,v>
//Map<T> 인터페이스를 구현한 클래스
//키 밸류의 쌍으로 객체를 구성
//키값은 중복될 수 없다 만약 중복될 경우 덮어쓰기가 된다
//즉 기존값은 삭제된다
//키값으로 검색하므로 다른컬렉션보다 검색이 빠르다


public class HashMap01 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = null;
		
		System.out.println("name이라는 키로 저장된 이전 값" + map.put("name", "홍길동"));
		
		int number = 20;
		
		// map.put("age",number);
		map.put("age",String.valueOf(number));
		map.put("gender","남자");
		map.put("address","신도림역 2번출구");
		
		System.out.println("객체수" + map.size());
		
		System.out.println("name이라는 키값으로 저장된 이전 값"+map.put("name", "홍길동"));
		System.out.println("중복 저장후 객체수" + map.size());
		
		
		System.out.println("키값을 알때" +map.get("name"));
		
		
		
		Set<String> keys = map.keySet();
		System.out.println("확장for");
		for (String key:keys) {
			String value = map.get(key);
			System.out.printf("%s:%s%n", key, value);
			
		}
		
		System.out.println("반복자");
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		while (it.hasNext()) {
			
			String key = it.next();
			
			String value = map.get(key);
			System.out.printf("%s:%s%n", key, value);
			
		}

	}

}
