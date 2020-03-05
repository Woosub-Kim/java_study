package ex15exception;
import java.io.IOException;

public class ExceptionBsaic01 {
	
	//public static void main(String[] args) throws IOException{
	public static void main(String[] args) { 

		
//1. Syntax에러 구문에러
//실행자체가 되지않는 코드로 오류를 수정해야지만 정상 실행할 수 있다
//코드의 문법오류
		
//		Int number = 10; int를 Int로 표기
//		if(true); if문에 ; 작성하여 if문이 종료됨
//		{} 
//		else if문이 종료되어 의미 없는 else문이 됨. 
//		{}
		
//위 문자에서 구문오류가 있는 부분을 수정한 코드		
		int number = 10;
		if(true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
//예외 발생시 처리 방법
//1.read()와 같이 호출시 기본적인 예외를 가지는 메소드는 예외던지기와 같이 main함수 밖으로 예외를 던져 처리
//이는 예외를 내부에서 처리하지 않고 무시하겠다는 의미
//public static void main(String[] args) throws IOException와 같이 예외를 함수 밖으로 던져 처리
			
//2. 예외가 발생한 지점에서 try~catch문으로 직접 처리		
		try {
			System.out.println("input one character");
			int iChar = System.in.read();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
