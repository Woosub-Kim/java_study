package ex03operator;

public class ShortCircuitEvaluation {
	/*
	 SCE:하나의 조건검사만으로 결과를 알 수 있는 경우, JAVA컴파일러는 뒤의 조건을 수행하지 않고 넘어가게 된다.
	 이때 변수의 값을 변화시키는 코드가 있다면 주의해야 한다.
	 */
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		boolean result;
		
		//논리AND연산은 둘중 하나만 false여도 false를 반환한다. 첫 조건이 false일 경우
		//두번째 조건은 실행하지 않는다.
		result = (num1 += 10)!=10 && (num2 += 10)>0;
		System.out.println("result=" + result);
		System.out.println("num1:"+num1+" num2:"+num2);
		//논리OR연산은 둘중 하나만 true여도 true를 반환한다.
		//첫 조건이 true이면 두번째 조건은 실행하지 않는다.
		result = (num1 += 10)==20 || (num2 += 10)>0;
		System.out.println("result=" + result);
		System.out.println("num1:"+num1+" num2:"+num2);
		
	}

}
