package ex16collection;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;


import common.Teacher;
//Hash set
//set계열의 인터페이스를 구현한 컬렉션으로 객체가 순서 없이 저장된다
//객체의 중복저장을 허용하지 않는다
//단 기본클래스가 아닌 새로 정의된 클래스라면 hashcode equals메소드를 적절히 오버라이딩 해야한다
//List는 배열, Set은 집합의 성격을 가진다.
public class HashSet01 {

	public static void main(String[] args) {
//set멀렉션 생성
//생성시 제너릭 타입을 지정하지 않거나 Object로 지정하면 모등 객체를 저장할 수 있는 컬렉션이 된다
		HashSet<Object> set = new HashSet<Object>();
//다양한 객체생성		
		String strObject1 = "Java";
		String strObject2 = new String("KOSMOS51기");
		Date dateObject = new Date(0, 0, 0);
		int number = 100;
		Teacher teacher = new Teacher("김봉두", 55, "체육");
//컬렉션에 객체생성: boolean 타입의 add메소드
//정상적으로 저장되면 true반환
		System.out.println(set.add(strObject1));//ture
		set.add(strObject2);
		set.add(dateObject);
		set.add(number);
		set.add(teacher);
//컬렉션에 저장된 객체의 객수
		System.out.println("중복저장전 객체수" + set.size());
//중복저장	
		
		System.out.println(set.add(strObject2)?"저장성공":"저장실패");
		System.out.println("중복저장 후 객체수");
//사용자가 정의한 객체의 중복저장
//동일한 정보를 가진 객체이지만 사용자가 정의한 클레스이므로 중복저장됨
//중복확인 위해서는 hashcode equals 메소드의 오버러이딩 필요 
		Teacher teacher2 = new Teacher("김봉두", 55, "체육");
		System.out.println(set.add(teacher2)?"저장성공":"저장실패");
		System.out.println("중복된 내용의 객체 teacher2저장 후 객체수" + set.size());
//저장된 객체 꺼내오기
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Object object = itr.next();
//지정된 모든 객체는 Object타입으로의 형변환되어 저장되므로 출력할 때 어떤 타입의 객체인지를 instanceof
//자로 확인해야 한다
			if (object instanceof String) {
				System.out.println("String타입" + object);
			}
			else if (object instanceof Date) {
				System.out.println("Date" + object);
			}
			else if (object instanceof Integer) {
				System.out.println("Inteager타입" + object);
			}
			else if (object instanceof Teacher) {
				System.out.println("Teacher타입" + object);
			}
			else {
				System.out.println("넌 뭐임");
			} 
		} //end of while
//존재유무확인 boolean contains(object e)
		System.out.println(set.contains(strObject1)?"str1있다":"str1없다");
		System.out.println(set.contains(number)?"number있다":"number없다");
		System.out.println(set.contains("Java")?"Java있다":"java없다");
//삭제 bollean remove(object e)
		System.out.println(set.remove(strObject2)?"str2 삭제성공": "str2삭제실패");
		System.out.println(set.remove("Android")?"Android 삭제성공": "Android삭제실패");
		System.out.println(set.size() + "삭제후 객체수");
//전체삭제 set.clear()
		System.out.println("전삭" + set.removeAll(set));
		System.out.println("전삭 후 객체수" + set.size());
		
	}
}