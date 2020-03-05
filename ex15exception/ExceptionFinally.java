package ex15exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//finally절
//예외발생 여부에 상관없이 try문으로 진입했을 때 반드시 실행해야 하는 코드가 있는 경우 특별히 기술하는 블럭
//1]try~catch:예외를 직접처리할 때 사용
//2]try~catch~finally: 예외를 직접 처리한 후 반드시 실행할 문장이 있을 때 사용
//3]try~finally: 예외는 외부로 던지고 예외발생과 상관없이 실행할 문장이 있을 경우 사용
//단 try문에서 System.exit(0)를 만나면 프로그램자체가 종료되어 finally문이실행되지 않는다.

public class ExceptionFinally {

//호출시 반드시 runtime예외가 발생되도록 생성된 메소드
//예외 발생시 직접 처리하지 않고 호출 지점으로 예외객체를 던진다.
	static void runtime() throws NumberFormatException{
		Integer.parseInt("www");
	}
	
	static void tryCatchFinally() {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요");
		int age = Integer.MAX_VALUE;
		try {
			age = scan.nextInt();
			System.out.println("당신은 5년후" + (age+5) +"살");
//try구문에서 return만나도 finally는 무조건 실행			
			return;
//프로그램 자체가 종료->finally 실행X			
//			System.exit(0);			
		} catch (InputMismatchException e) {
			System.out.println("나이는 숫자로");
		}
		finally {
			System.out.println("항상 실행 finally문");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		try {
			runtime();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		tryCatchFinally();
//실행되지 않는 문장 System.exit(0);때문		
		System.out.println("메인 메소드 끝");
			
	}

}
