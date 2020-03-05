package ex16collection;

import java.util.*;


//HashMap<k,v>
//Map<T> 인터페이스를 구현한 클래스
//키 밸류의 쌍으로 객체를 구성
//키값은 중복될 수 없다 만약 중복될 경우 덮어쓰기가 된다
//즉 기존값은 삭제된다
//키값으로 검색하므로 다른컬렉션보다 검색이 빠르다


public class HashMapMain {

	public static void main(String[] args) {
		
		java.util.HashMap<String, String> map = new java.util.HashMap<String, String>(); 
		
		System.out.println("name이라는 키로 저장된 이전 값" + map.put("name", "홍길동"));
		
		int number = 20;
//객체저장
//string put(키, 밸류);
//여기서 반환되는 String 타입으로 해당 키값으로저장된 이전객체의 밸류 반환
//만약이전 저장된 객체없다면 null반환
//		map.put("age",number);value타입 틀림
		map.put("age",String.valueOf(number));
//Integer객체를 변경후 입력한다
		
		map.put("gender","남자");
		map.put("address","신도림역 2번출구");
//객체수		
		System.out.println("객체수" + map.size());
//중복저장		
		System.out.println("name이라는 키값으로 저장된 이전 값"+map.put("name", "최길동"));
//전 홍길동, 중복저장후 최길동
		System.out.println("중복 저장후 객체수" + map.size());
		
		
		System.out.println("키값을 알때" +map.get("name"));
		
		
//키값을 알때 출력 get(키)		
		Set<String> keys = map.keySet();
		System.out.println("확장for");
		for (String key:keys) {
			String value = map.get(key);
			System.out.printf("%s:%s%n", key, value);	
		}
//키값을 모를 때 출력하기
//Set<T> keySet()메소드 호출을 통해 키값을 Set 계열의 컬렉션으로 반환한다
//처음부터 확장for문을 못쓰고 키값을 얻어와야 한다.
		System.out.println("반복자");
		Set<String> keys2 = map.keySet();
//반복자로 출력
//iterator사용 시에도 키셋으로 키값을 먼저 얻어오고나서 출력할 수 있다		
		Iterator<String> it = keys2.iterator();
		while (it.hasNext()) {
//			키값얻기
			String key = it.next();			
//			키값으로 밸류얻기
			String value = map.get(key);
			System.out.printf("%s:%s%n", key, value);			
		}
		System.out.println("밸류값들로만 출력하기");
		Collection<String> values = map.values();
		for (String value:values) {
			System.out.println(value);
		}
		
		System.out.println(map.containsKey("name")? "name있다":"name없다");
		System.out.println(map.containsKey("account")? "account있다":"account없다");
		System.out.println(map.containsKey("남자")? "남자있다":"남자있다");
		System.out.println(map.containsKey("여자")? "여자있다":"여자없다");
		
		System.out.println("삭제된 객체" + map.remove("age"));
		System.out.println("age삭제후 출력");
		for (String key:keys) {
			String value = map.get(key);
			System.out.printf("%s:%s%n", key, value);	
		}
		
		map.clear();
		System.out.println("전삭후 객체수"+ map.size());

	}

}
