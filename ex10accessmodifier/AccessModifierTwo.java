package ex10accessmodifier;

public class AccessModifierTwo {
	
	//멤버변수: 동일 패키지에 선언되어 import없이 사용가능
	AccessModifierOne one;
	
	//멤버메소드
	public void access() {	
		
		one = new AccessModifierOne();
		
		System.out.println("[접근 가능한 멤버 변수들]");
		
		/*
		 * AccessModifierOne의 멤버 중 private으로 선언된 멤버에는 접근이 불가능함.
		 * 서로 다른 외부 클래스이기 때문.
		 * 
		 * ※ private으로 선언된 멤버를 외부에서 접근할 때에는 public으로 선언된 메소드를 통해 간접접근해야 함. 
		 */
		
		//호출불가-private이므로
		//System.out.println("one.privateVar= " + one.privateVar);
		System.out.println("one.defaultVar = " + one.defaultVar);
		System.out.println("one.publicVar= " + one.publicVar);
		
		System.out.println("[접근 가능한 멤버 메소드들]");
		//one.privateMethod(); private 이므로 호출불가
		one.defaultMethod();
		one.publicMethod();
		
		/*
		 * one클래스와 Two클래스가 동일한 패키지 내에 선언되었으므로 객체생성이 가능하다.
		 */
		System.out.println("[default 클래스의 객체생성]");
		DefaultClass dClass = new DefaultClass();//동일 패키지 내에서 접근가능	
	}
}
