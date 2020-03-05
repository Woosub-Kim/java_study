package ex12inheritance;
/*
 * 상속 inheritance
 * 기존에 정의된 클래스에 메소드와 변수를 추가하여 새로운 클래스를 정의하는 것
 * 부모클래스를 자식클래스가 상속할 때, extends키워드를 사용한다.
 */

//부모클래스: 사람의 일반적 형태 표현
class Man{
	//멤버변수
	private String name;
	//기본생성자
	public Man() {
		/*
		 * 만약 자식클래스에서 super()를 통해 매개변수를 전달하지 않는다면 초기화가 되지않아 이름이 null로 호출된다.
		 */
		System.out.println("Man 클래스 디폴트 생성자 호출");		
	}
	public Man(String name) {
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출");		
	}
	//멤버메소드
	public void tellYourName() {
		System.out.println("내 이름은 "+ name + "입니다.");
	}
}
//자식클래스: Man클래스를 상속받는 회사원 클래스
class BusinessMan extends Man{
	//멤버변수
	private String company;
	private String position;
	//생성자 메소드
	
	public BusinessMan(String name, String company, String position) {	
		/*
		 * 상속받은 클래스에서는 부모클래스의 생성자를 호출하여 부모객체가 먼저생성되도록 해야하는 
		 * 책임을 가지고있다. spuer()는 부모클래스의 생성자를 호출하는 역할을 한다.
		 * 만약 기술하지 않으면 디폴트생성자가 호출된다.
		 */
		super(name);//부모클래스의 배개변수 1개인 생성자 호출
		this.company = company;
		this.position = position;
		System.out.println("Business 생성자 호출");
	}
	
	public void tellYourInfo() {
		System.out.println("회사명은 " + company +"입니다.");
		System.out.println("직급은 " + position +"입니다.");
		/*
		 * 부모틀래스를 상속받았으므로 자식클래스에서 호출하는 것이 가능하다.
		 */
		tellYourName();
	}
}

public class BusinessManMain {

	public static void main(String[] args) {
		BusinessMan man1 = new BusinessMan("홍길동", "Naver", "팀장");
		BusinessMan man2 = new BusinessMan("김길동", "Daum", "부장");
		
		man1.tellYourInfo();
		man1.tellYourName();
		man2.tellYourInfo();
		man2.tellYourName();
		
		
	}




}