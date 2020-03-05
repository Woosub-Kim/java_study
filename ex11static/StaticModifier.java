package ex11static;

/*
정적변수(Static Variable)
	-멤버변수앞에 static지정자(modifier)가 붙으면 정적변수가 
	된다.
	-정적변수는 JVM에 의해 프로그램이 메모리에 로드되는 시점에 
	초기화된다.
	-main메소드가 실행되기전에 이미 초기화 되므로 main메소드 
	실행시 별도의 선언없이 변수를 사용할수 있다. 

접근방법
	-클래스내부 : 변수명으로 접근
	-클래스외부 : 참조변수.변수명 or 클래스명.변수명 으로 접근
 */

class MyStatic {
	
	/*
	인스턴스형 멤버변수 : 일반적인 멤버변수로 객체의 참조변수를
		통해 접근한다.
	*/ 
	int instanceVar;
	/*
	정적 멤버변수 : 객체를 만들 필요없이 클래스명으로 바로 접근이 
		가능하다. 
	 */
	static int staticVar;
	
	
	/*
	인스턴스형 멤버메소드 : 해당 메소드에서는 모든 멤버를 사용
		할수 있다. 정적멤버, 인스턴스형멤버 둘다 사용가능.
	 */
	void instanceMethod() {
		System.out.println("instanceVar="+ instanceVar);
		System.out.println("staticVar="+ staticVar);
		staticMethod(); 
	}
	
	/*
	정적메소드 : 해당 메소드에서는 정적멤버만 접근하거나 호출할수
		있다. 인스턴스형멤버는 접근이 불가능하다. (main메소드
		에서 static으로 선언된 메소드만 호출할수 있었던것과
		동일한 특성이다)
	 */
	static void staticMethod() {
		//System.out.println("instanceVar="+ 
		//			instanceVar);->오류발생
		System.out.println("staticVar="+ staticVar);
		//instanceMethod();->오류발생
	}
}

//main 클래스
public class StaticModifier {
	
	//멤버변수
	int instanceVar;
	static int staticVar;
	
	//멤버메소드
	void instanceMethod() {}
	static void staticMethod() {}
	
	//main 메소드
	public static void main(String[] args) {
	
		MyStatic myStatic = new MyStatic();//메인메소드 안에서 메인클래스의 객체생성
		//스태틱 공간에 존재하므로.
		
		/*
		 * 인스턴스변수는 객체생성 후 참조변수를 통해 접근한다.
		 */
		myStatic.instanceVar = 100;//객체 통해 접근
		System.out.println("myStatic.instanceVar="+
				myStatic.instanceVar);
		/*
		 * 정적변수는 아래 2가지 방식으로 접근한다.
		 * 방법1. 클래스명을 통해 객체생성 없이 바로 접근한다.
		 * 방법2. 객체생성후 참조변수를 통해 접근한다. 하지만 이경우
		 * 코드레벨에서는 인스턴스 변수로 착각할 수 있어 권장하지 않는다.
		 * 명시적이지 않은 코드
		 */
		MyStatic.staticVar = 200;//방법1. 클래스 통해 접근(static)
		System.out.println("MyStatic.staticVar="+
				MyStatic.staticVar);
		myStatic.staticVar = 300;//방법2. 객체통해 접근. 문법적으로는 맞지만 권장하지는 않음.
		//인스턴스 변수인지 static변수인지 분명하지 않다.
		System.out.println("myStatic.staticVar="+
				myStatic.staticVar);
	
		
		/*
		 * main 클래스의 벰버변수 혹은 멤버 메소드에 접근하기 
		 * 정적멤버의 경우 클래스명을 통해 접근 자신의 클래스의 멤버는 클래스명을 생략한다.
		 * 즉, 아래 호출문장은 MyStatic의 멤버가 아니다.
		 */
		System.out.println(staticVar);
		staticMethod();
			
		StaticModifier sm = new StaticModifier();
		System.out.println(sm.instanceVar);
		//static은 static만 호출한다.
		sm.instanceMethod();//객체를 통한 간접호출은 가능
		//instatceMethod();
		/*
		 * main메소드는 static으로 선언된 정적 메소드이므로 static이 아닌 메소드의 호출은 허용
		 * 되지 않는다. 따라서 아래 메소드를 호출하기위해서는 객체의 참조변수를 통해 호출해야 한다.
		 */
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		/*
		 * 인스턴스 멤버는 객체별로 각각 존재하므로 아래 초기화된 값은 객체별로 따로 저장된다.
		 */
		ms1.instanceVar = 100;
		//호출주체 객체1 인스턴스 변수는 객체마다 다르게 할당
		ms2.instanceVar = 1000;
		//호출주체 객체2
		System.out.println("ms1.instanceVar="+ ms1.instanceVar);
		System.out.println("ms2.instanceVar="+ ms2.instanceVar);
		
		/*
		 *정적 멤버는 객체별로 따로 존재하지 않고 메소드영역에 하나만 생성되어 공유되기 때문에 
		 *아래에 할당값은 마지막에 저장한 900이 된다.즉 정적변수는 공유변수이다. 
		 */
		
		ms1.staticVar = 800;
		//호출주체 = 객체1 static 변수는 단 하나.
		ms2.staticVar = 900;
		//호출주체 = 객체2
		
		System.out.println("ms1.staticVar="+ ms1.staticVar);
		System.out.println("ms2.staticVar="+ ms2.staticVar);
	}
}
