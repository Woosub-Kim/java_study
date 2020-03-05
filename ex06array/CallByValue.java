package ex06array;
//call by value 값에 의한 호출
/*
 *메소드 호출과 관련된 개념으로 매개변수를 통해 값을 전달할 때, 메모리의 복사를 통해
 *값이 전달된다.
 *그래서 다른 지역에서의 값이 변경되더라도 호출한 메소드의 값에는 전혀 영향을 미치지 않는다.
 *
 *메모리적 관점에서보면 "스택영역"만 사용하는 케이스로 메인과 호출된 메소드는 서로다른 지역이므로 
 *서로에게 영향을 미치지 않는다.
 */
public class CallByValue {

	public static void main(String[] args) {
		int first = 100, second = 200;
		//출력1 first:100 second:200 
		System.out.println("main 메소드/호출전\n" +first+" " + second);
		callByValue(first, second);
		//출력3:first:100 second:200
		System.out.println("main 메소드/호출후\n"+first+" "+second);
	}
	
	public static void callByValue(int fNum, int sNum) {
		int temp;
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		//출력2: fNum:200 sNum:100
		System.out.println("callByValue메소드안\n"+fNum+" "+sNum);
	}
	

}
