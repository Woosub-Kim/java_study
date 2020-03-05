package ex11static;
/*
 * static블럭
 * 동일 클래스 내의 main method보다 먼저 실행되는 블럭으로 main 메소드의 실행문장이 없더라도 static
 * 블럭안의 코드는 실행된다.
 */
public class StaticBlock {
	//인스턴스형 변수
	int instanceVar;
	void instanceMethod() {}
	//정적멤버
	static int staticVar;
	static void staticMethod() {	
		int localVar;
		System.out.println("정적 메소드");
	}
	static {
		//static블럭 안에는 정적멤버만 접근가능
		staticVar = 1000;
		//instanceVar = 100;->오류발생
		System.out.println("staticVar = " + staticVar);
		staticMethod();
		//instanceMethod(); 오류발생
		
	
		//static 블럭 안에서만 제한적으로 사용할 수 있는 지역변수
		int localVar;
		localVar = 1000;
		System.out.println("localVar = " + localVar);//접근허용
		System.out.println("=== StaticBlock의 끝 === ");
			
	}
	//생성자 메소드
	public StaticBlock() {
		staticVar -= 1;
		System.out.println("===StaticBlock생성자===");		
	}	
}
