package ex15exception;

import java.io.IOException;
//예외처리 방법3
//예외가 발생한 지점에서 처리하는 대신 외부로 던진 후
//함수를 호출한 위치에서 예외객체를 받아 처리한다
//finally문은 무조건 실행된다.

public class ExceptionCase3 {
	static void compileFunc() throws IOException{
		System.out.println("하나의 문자를 입력하세요");
		try {
			int userChar = System.in.read();
			System.out.println("입력된 문자는" + (char)userChar);
		} finally {
			System.out.println("예외가 나든가 말든가");
		}		
	}
	public static void main (String[] args)  {
		try {
			compileFunc();
		} catch (IOException e) {
			System.out.println("compilfunc메소드에서 오류발생");
		}		
	}

}
