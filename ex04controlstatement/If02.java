package ex04controlstatement;

public class If02 {
/*
 * if문
 * 형식2
 * if(조건){
 *     조건이 참일때 실행문장;
 *  }
 *  else{
 *     조건이 거짓일 때 실행문장;
 *  }  
 */
	public static void main(String[] args) {
		
		int num = 99;
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		String numberResult = (num%2==0)? "짝수" : "홀수";
		System.out.printf("숫자 %d는 %s입니다.%n", num, numberResult);
		
		//시나리오] 숫자를 짝/홀 판단한 후 100이상인지 판단하는 프로그램을 작성하시오.
		//실행결과 짝수이면서 100이상입니다/홀수이면서 100미만입니다....
		
		int number = 106;
		if(number%2 == 0) {
			//짝수
			if(number>=100) {
				//짝수이면서 100이상
				System.out.println(number+"는 짝수이면서 100이상.");
			}
			else {
				//짝수이면서 100미만
				System.out.println(number+"는 짝수이면서 100미만.");
			}
		}
		else {
			//홀수
			if(number>=100) {
				//홀수이면서 100이상
				System.out.println(number+"는 홀수이면서 100이상.");
			}
			else {
				//홀수이면서 100미만
				System.out.println(number+"는 홀수이면서 100미만.");
			}
			
		}
	}

}
