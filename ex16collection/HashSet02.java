package ex16collection;

import java.util.HashSet;
import java.util.Iterator;

import common.Person;

public class HashSet02 {

	public static void main(String[] args) {
//Set<T> 컬렉션은 새로운 객체가 입력될때 틀래스에 오버라이딩 된 해쉬코드 이퀄스 메소드를 통해 
//동일한 객체가 있는지 판단하고 동일한 객체 없을 때만 true반환
		HashSet<Person> set = new HashSet<Person>();
		
		Person p1 = new Person("정우성", 30);
		Person p2 = new Person("장동건", 40);
		Person p3 = new Person("정우성", 30);
		Person p4 = new Person("장동건", 20);
		
		set.add(p1);
		set.add(p2);
		System.out.println(set.add(p3));//false
		System.out.println(set.add(p4));
		
		System.out.println("hashcode 오버라이딩 후 데이터수:" + set.size());
		
		
		Iterator<Person> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getInfo());
			
		}
	}

}
