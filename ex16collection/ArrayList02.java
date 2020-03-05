package ex16collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import common.Student;

public class ArrayList02 {
	public static void main(String[] args) {
//List계열의 컬렉션 생성 student객체 저장가능
		ArrayList<Student> list2 = new ArrayList<Student>();
//		LinkedList<Student> list2 = new LinkedList()<Student>();
//ArrayList와 LinkedList의 멤버메소드가 완전히 동일하므로 별도의 변경은 필요없다.
//		단지 내부적으로 데이터를 처리하는 방식 자료구조만 다르다. 참조는 ArrayList가 훨씬 더 빠르므로 좀 더 많이 사용한다.
//외부패키지에 정의된 Student클래스를 객체화함
		Student st1 = new Student("정우성", 10, "2018");
		Student st2 = new Student("원빈", 20, "2017");
		Student st3 = new Student("장동건", 30, "2016");
		Student st4 = new Student("공유", 40, "2015");
//컬렉션에 객체추가		
		list2.add(st1);//index0 인덱스 자동 부여
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);
		list2.add(st2);//index4 중복저장
//객체의 중복저장 List계열의 컬렉션은 중복저장을 허용한다		
		System.out.println("중복저장후");
//for each문을 통해 컬렉션의 내용을 출력 
		for (Student st : list2) {//for each문
			st.showInfo();//오버라이딩 된 student 클래스의 메소드
//         주소값-정보출력
		}
//주소값을 통한 객체삭제
//동일한 객체가 두 개 이상 저장된경우 인덱스 빠른 하나만 삭제
		list2.remove(st2);
		System.out.println("중복저장된 개체 삭제후");
		for (Student st : list2) {
			st.showInfo();
		}
//반복자 hasnext(), next()		
		System.out.println("반복자 사용");
		Iterator<Student> it2 = list2.iterator();
		while (it2.hasNext()) {
//			Student student = it2.next();
//			student.showInfo();
//위와 동일한 문장임. 참조값을 통한 멤버접근			
			it2.next().showInfo();//도 가능
		}
//List게열의 컬렉션은 인덱스를 통해 접근 하는 것이 가능함 get() 메소드 사용				

		System.out.println("일반 for문 사용");
		for (int i = 0; i < list2.size(); i++) {
			list2.get(i).showInfo();
		}
		
		System.out.println("확장 for문 사용");
		for (Student st: list2) {
			st.showInfo();
		}
//remove를 통해 객체를 삭제하면 삭제된 객체의 참조값을 반환한다.		
		System.out.println("삭제된 객체의 이름:" +list2.remove(2).getName());//공유 삭제
		list2.remove(st1);
		System.out.println("인스턴스 삭제 후");
		for (Student st: list2) {
			st.showInfo();
		}
		
	}
}
