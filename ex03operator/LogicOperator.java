package ex03operator;

public class LogicOperator {
/*
 논리연산자
 && 논리and. 양쪽 모두 true일때만 true 반환. 나머지는 false반환
 || 논리or. 한쪽만 true이면 true반환. 양쪽 모두 false일때만 false반환.
 ! 논리not. 반대의 논리 반환
 */
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		
		boolean result1 = (num1==100 && num2==20);
		boolean result2 = (num1<12 || num2>=30);
		
		System.out.println("result1=>" + result1);
		System.out.println("result2=>" + result2);
		
		if(!(num1 == num2)) {
			System.out.println("num1과 num2는 다르다.");
		}
		else {
			System.out.println("num1과 num2는 같다.");
		}
		
		

	}
}
