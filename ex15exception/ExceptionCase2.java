package ex15exception;

import java.io.IOException;
//예외처리 방법2
//예외가 발생한 지점에서 직접 try-catch 문으로 처리한다.

public class ExceptionCase2 {
	static void compileFunc(){
		System.out.println("하나의 문자를 입력하세요");
		try {
			int userChar = System.in.read();
			System.out.println("입력된 문자는" + (char)userChar);
		} catch (IOException e) {
			System.out.println("IO예외가 발생하였습니다");
		}		
	}
	public static void main (String[] args)  {
		compileFunc();
		
	}

}
