package ex10accessmodifier;
/*
 * 접근지정자 (접근제어지시자)
 * 클래스와 클래스 사이의 멤버간 접근을 제어하는 기능을 가진 키워드.
 * 
 * 접근의 법위 private<default<protected<public
 * private: 클래스 내부에서만 접근 가능. 외부에서 접근불가
 * default: 동일 패키지 내에서만 접근가능. 외부에서 접근불가
 * protected: 상속관계에 있는 클래스에서 접근가능
 * public: 모든 클래스에서 접근 가능
 * 
 * 접근지정자는 클래스 멤버변수 멤버 메소드 모두에 붙일 수 있다.
 */

/*
 * class를 정의할 때, 반드시public과 default만 가능하다.
 * private 클래스는 불가능 하므로 오류 발생.
 * 
 * private class PrivateClass{
 * void notFunc() {
		System.out.println("나는 정의할 수 없는 Class");
		}
	}
 */
/*
 * 접근지정자 생략했으므로 default 믈래스로 정의됨.
 * 해당 클래스는 동일 패키지 내에서만 접근 가능	
 */
class DefaultClass{
	//몸체가 없는 디폴트 클래스
}

//어디서든 접근이 가능한 class
public class AccessModifierOne {
	//멤버변수: 각각의 접근지정자를 통해 선언함.
	private int privateVar;
	int defaultVar;
	public int publicVar;
	//멤버메소드: 
	private void privateMethod() {
		//클래스 내부이므로 private멤버에 접근가능
		System.out.println("privateVar= " +privateVar);
		System.out.println("privateMethod() 메소드 호출 " );
	}
	void defaultMethod() {
		System.out.println("defaultMethod() 메소드 호출 " );
	}
	public void publicMethod() {
		privateMethod();
		System.out.println("publicMethod() 메소드 호출");
	}
	
}
