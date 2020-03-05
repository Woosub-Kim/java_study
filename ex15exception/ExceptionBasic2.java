package ex15exception;

import java.sql.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.Track;

//런타임 에러
//컴파일 시에는 체크가 안되고 실행시에만 발생되는 에러
//main메소드에서 throws하더라도 에러발생 반드시 예외처리
//RuntimeException클래스 계열로 NullPointerException이 대표적 하위 클래스
//예외발생시 JVM(자바가상머신)은 해당 예외클래스를 객체화해서 프로그램쪽에 전달한다.
public class ExceptionBasic2 {
//참조병수로 선언만 하고 객체생성은 되지 않은 상태
//아래 nullPointerException에서 확인 함
	static Date toDay;//= new Date()
//주석처리된 new부분을 주석처리 해제하면 예외 발생되지 않음
		
	public static void main(String[] args) {
//ArrayIndexOutOfBoundsException	
//배열의 크기를 벗어나는 인덱스 사용시 발생하는 예외
		
		//패키지                              클래스			
		game.Gugupp.main(args);
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번 방은?"+ intArr[0]);
			intArr[1] = 200;
			System.out.println("1번 방은?"+ intArr[1]);
			intArr[2] = 300; //예외 발생지점
//위에서 예외가 발생하므로 해당 문장은 실행되지 않음			
			System.out.println("??번 방은?"+ intArr[2]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
//try문에서 발생된 예외를 JVM이 객체화하여 catch쪽으로 전달하면 해당 예외 객체를 받아 적절히 처리한다			
			System.out.println("예외빌생");
			System.out.println("예외메세지" +e.getMessage());
			e.printStackTrace();
		}
//getMessage() 예외에 대한 간략한 메세지만 표시
//printStakTrace() 예외가 발생할 때의 에러메세지를 그대로 화면에 출력
//개발시 사용빈도가 높다
		System.out.println("0번방 재출력" + intArr[0]);
		System.out.println("ArrayIndexOutOfBoundsException예외 발생후");
//NumberFormatException
//숫자형식이 아닌 경우 문자열을 int로 변환하는 경우 해당 문자열이 숫자형식이 아니면 발생하는 예외	
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("나이는??");//<-10살 형태로 입력
			String strAge = sc.nextLine();
			int ageAfter10 = Integer.parseInt(strAge)+10;//예외발생
			System.out.println("10년후엔 " +ageAfter10);	
		} 
		catch (NumberFormatException e) {
			System.out.println("숫지로만");
			System.out.println("예외 메세지" +e.getMessage());
			e.printStackTrace();
		}
//InputMissmatchException
//nextInt()를 통해 정수형의 자료를 받을 때 문자를 입력하면 예외발생
		try {
			System.out.println("나이는?");
			int intAge = sc.nextInt();
			int ageAfter10 = intAge +10;
			System.out.println("10년 후엔 " + ageAfter10);
			
		} catch (InputMismatchException e) {
			System.out.println("문자 ㄴㄴ");
			System.out.println("예외메세지" + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("toDay= " + toDay);
		try {
			System.out.println(toDay.getTime());
		} catch (NullPointerException e) {
			System.out.println("today 참조변수가 null입니다");
			System.out.println("예외 메세지" + e.getMessage());
			
		}
//2.4NullPointerException
//참조변수가 참조할 객체가 없는 상태에서 멤바를 호출할 때 발생하는 예외
//참조변수가 null을 가지게 되면 참조할 객체가 없다는 뜻으로 반드시 객체생성후 멤버생성해야한다.		
		String emptyString = "";
		System.out.println("emptyString 의 문자열 길이" + emptyString.length());
		
		String nullString = null;
		try {
			System.out.println("nulString의 문자열 길이" + nullString.length());
		} catch (NullPointerException e) {
			System.out.println("nullString은 null");
			System.out.println(e.getMessage());
		}		
//2.5ArithmeticException
//수학적계산이 불가능한경우 발생하는 예외		
		int result = 10;
		try {
			result = result/0;
			System.out.println("결과는" + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다");
			System.out.println("예외메세지" + e.getMessage());
		}		
//2.6ClassCastException
//객체의 형변환이 불가능한 경우에 발생되는 예외
		Object object = new Object();
		try {
//object클래스 자체를 다른 타입으로 변환할 수 없다
//아래 예제로 이해하자
			String strObject = (String)object;
		} catch (ClassCastException e) {
			System.out.println("형변환 불가");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		System.out.println("ClassCastException 후");
//Object클래스와 String 클래스간의 형변환 확인 위한 참조코드		
		String str = "형변환 되나요";
		boolean castFlag = myClassCast(str);
		if (castFlag) {
			System.out.println("가능");
		}
		else {
			System.out.println("안됨");
		}		
	}//end of main 	
//매개변수로 전달된 String객체를 Object클래스로 받으므로 둘 사이에 상속관계 확인(자동형변환됨)
	public static boolean myClassCast(Object obj) {
		if (obj instanceof String) {
			return true;
		}
		else {
			return false;
		}
	}//end of myClassCast
	
}//end of class
