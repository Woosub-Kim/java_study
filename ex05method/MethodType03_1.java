package ex05method;

import java.util.Scanner;

import ex01javastart.SystemOutPrintln;

/*
 * 메소드 형식 3
 * 매개변수는 있으나 반환값은 없는 경우
 * 메소드 실행을 위해 값을 전달받은 후 연산의 결과를 콘솔창에 즉시 출력하는 형태
 * 의 프로그램에 사용
 */
public class MethodType03_1 {
	// 시나리오
	/*사용자가 입력한 2개의 시작값과 끝값 사이의
	 * 모든 수를 더하여 출력하는 프로그램을 작성하시오.
	 */
	 static void yesParamNoReturn(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지 합은 %d", start, end, sum);
		}
	
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작값");
		int s = scanner.nextInt();
		System.out.print("종료값");
		int e = scanner.nextInt();
		
		yesParamNoReturn(s,e);
		
		
	}

}
