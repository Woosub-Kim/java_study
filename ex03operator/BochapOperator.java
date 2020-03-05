package ex03operator;

public class BochapOperator {
	//복합대입연산자: 산술연산자와 대입연산자를 붙여놓은 형태
	//좌우측 값을 연산하여 좌측 변수에 대립하는 형태
	//누적연산에 이용
	public static void main(String[] args) {
		double e = 3.1; //3.1
		e += 2.1; // 5.2
		e *= 2; // 10.4
		e = e + e; //20.8
		System.out.println("e 결과:" + e);
				
		int n = 5;
		//n = n * 2.7;
		n *= 2.7; //n의 자료형이 유지됨, 13
		System.out.println("n:"+n);
		//참고 복합대입연산자의 경우 문법 구조상 자동 형변환이 일어나지 않고 기존의 자료형을 유지한다.
	}

}
