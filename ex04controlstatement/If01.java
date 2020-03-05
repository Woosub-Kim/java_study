package ex04controlstatement;

public class If01 {
/* if문 조건문, 분기문
 형식1
 if(조건문){
 	실행문장1;
 	실행문장2
 }
 즉 if문의 조건문은 반드시 비교식 혹은 논리식이어야 한다. 즉 그 결과값이 boolean타입이어야 한다.
 실행할 문장이 하나일때 중괄호 생략 가능하다.
 
 */
	
	public static void main(String[] args) {
		
		int num = 10;
		
		/*
		 *아래 두 문장은 boolean이 아닌 산술 식이므로 에러가 발생한다. 
		if(num%2) {
			System.out.println("잘못된 조건식.");
		}
		if(num) {
		System.out.println("또 틀림.");
		}
	
		*/
		
		/*
		 * if문의 조건은 반드시 아래와같이 boolean을 반환해야 한다.
		 */
		
		if(num%2 == 0) {
			System.out.printf("%d는 짝수입니다.%n", num);
		}
		if(num%2==0 && num>= 10) {
			System.out.printf("%d는 짝수이고 10보다 크거나 같습니다%n", num);
		}
		//경우에 따라 무조건 실행되는 if문이 필요하다.
		if(true) {
			System.out.println("무조건!");
		}
		//if(조건식); => 조건식이 참일때 실행할 문장이 없음을 의미하는 코드
		//아래 {}블럭은 무조건 실행되는 코드. 작성시 주의!!
		if(num%2!=0); {
			System.out.printf("%d는 홀수입니다%n", num);
		}
		
		if(num%2 == 0)//if문에거 실행문장 1개면 {}중괄호 생략가능 
			System.out.println(num + "even number");
		if(num%2 != 0) {	
			System.out.println("even number" + num);
			System.out.println("num equals" + num);
		}	
		
		
		//시나리오 입력한 문자가 숫자인지 여부를 판단하는 프로그램을 if문을 이용해 작성하시오.
		char ascii = '0';
		if(ascii>=48 && ascii<=57) {
			System.out.println("number");
		}
		else {
			System.out.println("It is a character.");
		}//아스키코드를 아는경우
		if(ascii>='0' && ascii<='9') {
			System.out.println("number");
		}
		else {
			System.out.println("It is a character.");
		}//아스키코드를 모르는 경우
		
		
	}
}
