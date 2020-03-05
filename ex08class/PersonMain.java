package ex08class;
/*
 *추상화
 *현실 세계의 사물을 클래스로 형상화하는 것을 추상화라고 한다. Person클래스는 사람의 일반적
 *사항을 추상화한다.
 */
class Person{
	String name = "정우성";//멤버변수: 클래스의 속성값(데이터)을 표현한다.
	int age = 47;//해당 클래스 내에 정의된 멤버메소드에서 별다른 선언 혹은 전달없이 직접 접근이 가능하다.
	String gender = "남자";
	String job = "배우";
	
	void eat() { //멤버 메소드: 클래스에서 객체의 동작(행위)을 표현
		System.out.printf("%s: 냠냠%n", name);//클래스 외부에서 호출시
	}//객체의 참조변수를 통해 호출한다.
	void sleep() {
		System.out.printf("%s(%d세): 쿨쿨", name, age);
	}
}

public class PersonMain {

	public static void main(String[] args) {
		//Person 클래스 객체 생성
		Person person = new Person();
		//객체의 참조변수를 통해 멤버메소드호출
		person.eat();
		person.sleep();		
	}

}
