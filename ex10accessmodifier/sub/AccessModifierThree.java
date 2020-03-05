package ex10accessmodifier.sub;

import ex10accessmodifier.AccessModifierOne;
/*
 * one클래스와 three클래스는 다른 패키지에 선언되었으므로 사용을 위해 import가 필요하다.  
 */
//import ex10accessmodifier.DefaultClass;

public class AccessModifierThree {
	AccessModifierOne one;
	public void access() {
		one = new AccessModifierOne();
		System.out.println("[접근 가능한 멤버 변수들]");
	
		//패키지가 다른 경우 default로 선언된 멤버는 외부접근불가
		//System.out.println("one.privateVar= " + one.privateVar);
		//System.out.println("one.defaultVar = + "one.defaultVar);
		System.out.println("one.publicVar= " + one.publicVar);
		
		System.out.println("[접근 가능한 멤버 메소드들]");
		//one.privateMethod(); ->접근불가
		//one.defaultMethod(); ->접근불가
		one.publicMethod();
		//DefaultClass 클래스는 default 형이므로 다른 패키지에서는 보이지 않아 import불가 
		System.out.println("[default 클래스의 객체생성]");
		//DefaultClass dClass = new DefaultClass();
		
		
	}
	
}
