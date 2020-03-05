package ex05method;

import java.util.Scanner;

public class MethodType04_2 {

	public static void main(String[] args) {
		/*
		 시나리오
		 여러개의 숫자를 입력받은 후 최댓값을 구하는 메소드를 정의하시오
		 단 숫자의 갯수는 매개변수로 전달받고
		 숫자의 갯수만큼 Scanner클래스를 통해 입력받는다.
		 입력받은 숫자중 최댓값을 찾아서 반환하도록 정의한다.
		 */
		
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최댓값:" + maxValue1);
	}
	
	static int returnMaxNumber(int numberCnt) {
		Scanner scanner = new Scanner(System.in);
		int maxVal = 0;
		for(int i=1; i <=numberCnt; i++) {
			System.out.println("정수입력하세요.");
			int inputNum = scanner.nextInt();
			if(i==1) {
				maxVal = inputNum;
			}
			else if(maxVal < inputNum) {
				maxVal = inputNum;
			}	
		}
		return maxVal;
		
	}
	
	

}
