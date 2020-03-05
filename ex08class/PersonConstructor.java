package ex08class;

public class PersonConstructor {
	//멤버변수
	String name;
	int age;
	String addr;
	/*
	 *생성자 constructor
	 *클래스를 객체화할때 자동으로 호출
	 *자동으로 호출되며 개발자가 임의 호출할 수 없다.
	 *반환값이 없다. void등 키워드 사용안함. return 불가 
	 *클래스명과 동일한 이름을 가진다.
	 *메소드의 다른 모든 기능을 가진가. 매개변수, 전달, 오버로딩 등등 
	 */
	public PersonConstructor() {
		this("익명", 1, "미상");
		System.out.println("기본생성");
	}
	/*
	 * 만약 클래스를 생성할 때, 아래와 같이 생성자를 정의하지 않으면, 디폴트 생성자가 컴파일러에 의해
	 * 자동생성
	 * 
	 * public PersonConstructor(){}
	 * 디폴트생성자는 매개변수도 실행문도 없는 형태로 정의된다.
	 * 단 생성자를 하나라도 정의하게 되면 디폴트 생성자는 정의되지 않는다.
	 */
	public PersonConstructor(String name) {
		this(name, 1, "미상");
		System.out.println("생성자1");
	}
	public PersonConstructor(String name, int age) {
		this(name, age, "미상");
		System.out.println("생성자2");
	}//해당 생성자 내에서 매개변수가 3개인 다른 생성자를 호출한다.
	public PersonConstructor(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("생성자3");
	}
	/*
	 *생성자 내 this 사용법
	 *1.동일 클래스 내에서 다른 생성자를 호출할 때.
	 *	사용법: this(parameter1, parameter2,...);
	 *	단 생성자 내에서만
	 *2.멤버변수와 매개변수를 구분할 때
	 *	this.name => 해당 클래스의 멤버변수 
	 *	name      => 배개변수 일반적인 변수
	 *	단, 멤버변수와 매개변수가 다르면 this 생략 가능. 명시적 코드 위해 사용.
	 */
	void initialize(String name, int age, String addr) {
		//this()는 생성자 내에서만 사용 가능 initialize()는 생성자가 아니므로
		//this(name, age, "미상");              에러가 발생한다.
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	
	void showPersonInfo() {//정보 출력용 메소드
		System.out.printf("%s님의 정보%n", this.name);
		System.out.println("나이: "+ age);
		System.out.println("주소: "+ addr);
		
	}

}
