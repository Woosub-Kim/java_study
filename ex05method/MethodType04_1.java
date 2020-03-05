package ex05method;

import java.util.Scanner;

/*
 *메소드형식4
 *매개변수도 있고 반환값도 있는 메소드. 4가지 형식중 가장 활용빈도가 높다.
 */
public class MethodType04_1 {
	/*
	 해당 클래스의 지역에 변수를 생성하였으므로 아래 변수를 전역변수 혹은 클래스 변수라고 한다.
	 해당 변수는 클래스 전체에서 사용할 수 있다. 
	 */
	
	static Scanner scanner = new Scanner(System.in);//전역변수 global var
	
	public static void main(String[] args) {
		/*
		 *시나리오
		 *인원수를 매개변수로 전달받아 각 인원수만큼
		 *나이를 전달받은 후 그 나이의 합을 반환하는 메소드
		 */
		//인원수 입력받도록..
		System.out.println("인원수 입력 하세요.");
		int personNum = scanner.nextInt();
		int sumOfAge = getTotalAge(personNum);
		System.out.println("나이합" + sumOfAge);

	}
	
	static int getTotalAge(int personCnt) {
		int sumAge=0;
		
		for(int i = 1; i<= personCnt; i++) {
			System.out.println(i + "번째 사람의 나이 입력");
			int age = scanner.nextInt();
			sumAge += age;
		}
		
		return sumAge;
		
	}
	
	
	
;
}
