package ex08class;

public class PersonConstructorMain {

	public static void main(String[] args) {
		
		PersonConstructor person1 = new PersonConstructor();
		System.out.println("[멤버변수 초기화용 메소드 호출 전]");
		person1.showPersonInfo();
		System.out.println("[멤버변수 초기화용 메소드 호출 후]");
		person1.initialize("홍길동", 20, "논현동");
		person1.showPersonInfo();
		
		System.out.println("\n[이름값 전달한 값으로 초기화]");
		PersonConstructor person2 = new PersonConstructor("박길동");
		person2.showPersonInfo();
		
		System.out.println("==========================");
		System.out.println("[이름과 나이만 전달한 값으로 초기화]");
		PersonConstructor person3 = new PersonConstructor("최길동", 40);
		person3.showPersonInfo();
		
		System.out.println("\n[모든 매개변수를 전달한 값으로 초기화]");
		PersonConstructor person4 = new PersonConstructor("박길동", 50, "가산동");		
		person4.showPersonInfo();
		
	}

}
