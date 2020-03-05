package ex15exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCatch {
//예외처리를 할 때 필요에 따라 여러개의 catch블록을 사용 할 수 있다.
//이 경우 Exception 객체는 가장 마지막의 블록에서 사용해야 한다
//Exception객체는 최상위 예외 클래스 이므로 모든 예외를 catch하기때문에
//그 아래 catch블록은에서는 에러가 발생한다.

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		try {
			for (int i = 0; i < array.length; i++) {
				System.out.println("array[" + i +"]에 입력할 숫자");
				array[i] = Integer.parseInt(scanner.nextLine());
			}
			System.out.println("배열에 저장된 두수 나누기" + array[0]/array[1]);
			System.out.println("나이를 입력하기");
			int age = scanner.nextInt();
			System.out.println("당신의 나이는"+age);
			array[3] = age;			
		} catch (InputMismatchException e) {
			System.out.println("숫자만");
		} catch (ArithmeticException e) {
			System.out.println("연산불가");
		} catch (NumberFormatException e) {
			System.out.println("숫자형태만");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과");
		} catch (Exception e) {
//예외 처리에 있어서 디테일한 처리가 필요없다면 Exception객체 하나로 catch블록을 구성해도 된다
//단 각각의 예외 클래스로 세분할 수 없다는 것이 단점
			System.out.println("(알 수 없는)예외가 발생하였 습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		
	}

}
