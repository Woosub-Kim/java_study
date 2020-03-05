package ex03operator;

public class PrePostFixOperator {

	public static void main(String[] args) {
		//증감 연산자: +1 혹은 -1 연산한 결과 반환. 반복횟수 카운트시 사용
		
		//전위증가   Prefix: 연산자가 변수 앞에 있는 경우로 변수값이 먼저 증가(감소)한 후 할당됨
		//후위증가 Postfix: 연산자가 변수 뒤에 있는 경우로 할당 후 변수값 증가(감소)됨.
		
		int num1 = 7, num2, num3;
		
		num2 = ++num1;/*
				1. num1 값 먼저 증가
				2. num2에 1 증가된 값이 대입됨
				결과 num1=8, num2=8
		 	*/
		num3 = --num1;/*
				1. num1값 먼저 감소
				2. num3에 감소한 num1의 값이 대입됨
				결과 num1=7, num3=7
		 	*/
		
		System.out.println("전위증감");
		System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
		
		//nnnnnnnnnnnnnnnnnnnnnoooooooooooo????ooooooooooooonnnnnnnnnnnnnnnnnn\\
		
		num1 = 7; 
		num2 = 0; 
		num3 = 0;
		
		num2 = num1++;/*
					1. num1의 값이 num2에 먼저 대입
					2. num1의 값이 증가함.
		 		*/
		num3 = num1--;/*
					1. num1의 값이 num3에 먼저 할당됨
					2. num1값이 감소됨
					
					결과 7,7,8
		 		*/
		
		System.out.println("후위증감");
		System.out.println("num1:" + num1 + " num2:" + num2 + " num3:" + num3);
		
		//삼항연산자/조건연산자
		//if문과 비슷한 기능. 조건이 참일때와 거짓일때를 분기하여 실행할 수 있는 연산자이다.
		
		int x = 100;
		String result = (x<=100)? "참이다": "거짓이다.";
		System.out.println("\nresult?" + result);
		
		
		

	}

}
