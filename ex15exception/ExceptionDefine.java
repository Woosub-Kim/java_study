package ex15exception;

import java.util.InputMismatchException;
import java.util.Scanner;
//사용자정의 예외 클래스를 생성하는 방법
//1.Exception클래스를 상속받는다
//2.생성자에서 예외발생시 출력할 메세지를 super()로 설정한다
//3.예외발생지점에서 예외객체를 생성 후 throw
//throw한 예외 객체가 호출한 위치로 전달되기 위해 발생한 함수에서 throws해줘야 한다
class AgeErrorException extends Exception{
	public AgeErrorException() {
		super("나이를 어디로 드셨길래 음수가 나왔나요?");
	}
}
public class ExceptionDefine {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요");
//readAge()메소드가 던진 예외객체를 받아서 예외처리함		
		try {
			int age = readAge();
			System.out.println("당신의 나이는" + age);
		} catch (Exception e) {
			System.out.println("예외발생: " +e.getMessage());	
		}
		

	}
	public static int readAge() throws AgeErrorException {
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
			inputAge = sc.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);	
		}
//나이가 음수로 입력된 경우 예외발생 처리
		if (inputAge<0) {
//사용자가 정의한 예외클래스 객체 생성
			AgeErrorException ex = new AgeErrorException();
//예외 객체를 던짐
			throw ex;
		}
		return inputAge;
	}
}
