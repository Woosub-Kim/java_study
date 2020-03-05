package ex05method;

public class MethodType01 {
/*
 Method(메소드)ㅣ 객체지향 프로그램에서 행동 또는 동작을 의미한다. 
 즉, 어떤 일을 처리하는 하나의 모듕(부속품)이라 정의 할 수 있다.
 
 메소드는 반드시 클래스 안에 정의한다.
 메소드 안에 또다른 메소드를 정의할 수 없다.
 정의할 때, 반드시 반환타입이 있어야 한다. 반환값 없으면 void사용
 이름의 규칙은 변수와 동일하다. 소문자로 시작하는 변형카멜 camelCase()
 */
	public static void noParamNoReturn() {//메소드 형식 1 매개변수(파라미터)도 반환값도 없는 경우 
		                         //출력에 주로 사용. void명시
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.열기 2.계속 3.종료");
		System.out.println();	
	}
	//동일한 클래스 내에서 메소드명의 중복은 불가능
	//※메소드오버로딩 Overloading 메소드 명은 같지만 매개변수의 갯수나 타입을 다르게 정의하는 문법
	
	/*public static void noParamNoReturn() {
		
		System.out.println("동일한 함수명 사용 불가.");
		
	}*/
	
	public static void noParamNoReturn2() { 
		int returnValue = 11;
		System.out.println("[리턴 이전]");
		/*
		함수의 중간에 return문장을 쓰게 되면 함수가 종료되므로 
		그 아래 문장은 실행될 수가 없는 코드가 된다.
		unreachable code error발생 
		 */
		
		if(returnValue%2==0) {//이 경우는 조건에 따라 결과가 달라질 수 있어 허용된다.
			System.out.println(returnValue + " 짝수");
			return;
		}
		
		System.out.println(returnValue + " 홀수");
		System.out.println("리턴문 이후");
		
		//return;
		//System.out.println("[리턴이후]");	
	}
	
	
	
	
	/*
	 *규칙 Java에서 main메소드는 무조건 public static void로 선언하기로 약속되어있다. 
	 *그리고 static으로 선언된 메소드에서 다른 메소드를 호출하기 위해서는 호출되는 메소드도 
	 *static으로 선언되어야 한다. 
	 */
	public static void main(String[] args) {
		//규칙 메소드 호출 후 반환값은 항상 호출한 위치로 돌려준다. 만약 반환값이 없다고 하더라도
		//호출한 위치로 실행 흐름이 돌아온다.
		noParamNoReturn();
		noParamNoReturn2();

	}

}
