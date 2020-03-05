package ex05method;

public class Overloading {
/*
 * 메소드 오버로딩
 * 동일한 이름의 메소드를 2개 이상 정의하는 것을 말한다.
 * 매개변수의 갯수나 타입이 다를때 성립.
 * 매개변수의 갯수와 자료형이 동일한데 반환타입만 다른 경우에는 성립하지 않는다.
 * 컴파일러는 메소드 호출 시 전달되는 파라미터를 통해서 호출할 메소드를 구분한다.
 */
	public static void main(String[] args) {
		// 매개변수의 갯수나 타입이 달라야 한다.
		person(23546);
		System.out.println("=====");
		person(123456,998844);
		
	}
	static void person(int juminNum, int milNum) {
		System.out.println("군필자입니다.");
		System.out.println("주민번호: " + juminNum);
		System.out.println("군번: " + milNum);
	}
	static void person(int juminNum) {
		System.out.println("미필자입니다.");
		System.out.println("주민번호: " + juminNum);
		System.out.println("군번: 없음");
	}

}
