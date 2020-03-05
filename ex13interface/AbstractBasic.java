package ex13interface;
//추상클래스1 추상메소드가 없는 추상메소드
abstract class NoHavingAbsMethod{
//static 상수 선언
	public static final int MAX_INT = Integer.MAX_VALUE;
//멤버변수	
	int instanceVar;
	static int staticVar;
//멤버메소드	
	void instanceMethod() {}
	static void staticMethod() {}	
}

class NoHavingChild extends NoHavingAbsMethod{
	int newVar;	
	@Override
	void instanceMethod() {
//	강제사항 아님.
//	추상메소드를 포함하지 않은 추상클래스를 상속받는 경우
//	오버라이딩이 강제사항이 아니므로 필요에 따라 처리한다.		
		super.instanceMethod();
	}
}
//	추상 클래스2 추상메소드 포함한 클래스
abstract class HavingAbsMethod{
//	추상메소드를 멤버로 포함한 클래스는 반드시 abstract로 정의한다.
//	그렇지 않으면 에러 규칙
	abstract void absMethod(int number);
}
class HavingChild extends HavingAbsMethod{	
//	의무적으로 오버라이딩한 메소드
//	이경우 오버라이딩 하지 않는 경우엔 클래스를 추상클래스로 선언해야 한다.
//	그 경우 해당클래스는 객체를 생성할 수 없게된다.=>오버라이딩 필수	
	@Override
	void absMethod(int number) {
		System.out.println("부모클래스에서 오버라이딩 한 메소드");	
	}
	
	void newMethod() {
		System.out.println("새로 확장한 에소드");
	}
}


public class AbstractBasic {

	public static void main(String[] args) {
//		추상클래스는 인스턴스를 생성할 수 없다.
//		
//		NoHavingAbsMethod nham = new NoHavingAbsMethod();
//		
//		추상클래스를 상속한 하위 클래스는 객체생성 가능
//		추상클래스로 객체생성은 할 수 없지만, 참조변수로 사용하는 것은 가능하다.
//		부모객체로 자식객체를 참조하게 되면 관리의 일관성 유지할 수 있다.
		NoHavingAbsMethod nhc = new NoHavingChild();
		HavingAbsMethod ham = new HavingChild();
		
		ham.absMethod(100);
		((HavingChild)ham).newMethod();
//		부모객체로 자식객체를 참조하게되면 업캐스팅(자동 형변환)이 되므로 다운캐스팅(명시적 형변환)
//		을 통해 자식객체에 접근해야 한다.
		
//		추상클래스에 선언된 정적멤버는 오버라이딩 대상이 될 수 없으므로 static 기본규칙을
//		따른다. 클래스명으로 접근 가능하다.
		NoHavingAbsMethod.staticMethod();
		NoHavingChild.staticMethod();			
	}
		


}
