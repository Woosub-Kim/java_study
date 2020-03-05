package ex02variable;

public class ConstantVar {
	//상수 저장된 값이 변하지 않는 메모리의 한 종류
	//선언방법: final 자료형 변수명 = 값;
	//프로그램에서 딱 한번 초기화되고 변경할 수 없다.
	//전체 대문자, _사용
	//코드의 가독성 개선위해 사용
	public static void main(String[] args) {
		final double PI = 3.14159;
		System.out.println("원주율 PI=" + PI);
		
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		/*
		개발자가 가위는 1 바위는 2 보는 3으로 결정했다고 가정..
		 */
		//개발자만 알아볼 수 있는 가독성이 떨어지는 코드. 명시적이지 않음
		int computer, user;
		computer = 1;
		user = 3;
		System.out.println("컴퓨터가 이겼습니다.");
		
		//누구나 이해할 수 있는 가독성이 높은 코드. 명시적인 코드 
		computer = SCISSOR;
		user = PAPER;
		System.out.println("컴퓨터가 이겼습니다.");
				
		//PI = 3.15; 상수의 값은 변경할 수 없다.
		System.out.println("PI변경후" + PI);
		
		//상수선언 이후 초기화하지 않은 상태에서 출력을 시도했기에 에러 발생
		final String NICK_NAME;
		//System.out.println("내 별명은" + NICK_NAME);
		NICK_NAME = "홍길동";//한번만 초기화가능, 선언 이후 초기화 가능
		System.out.println("내별명은"+ NICK_NAME);
	}

}
