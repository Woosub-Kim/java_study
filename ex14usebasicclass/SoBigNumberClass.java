package ex14usebasicclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SoBigNumberClass {

	public static void main(String[] args) {
		
		System.out.println("Long 최대값" + Long.MAX_VALUE);
		System.out.println("Long 최소값" + Long.MIN_VALUE);
//BigInteger클래스 int형이나 long형으로 표형할 수 없는 매우 큰 수를 연산하고자 할때 사용
//매개변수 전달시 문자열로 전달
// long으로는 코드 작성 불가		
		BigInteger bigValue1 = new BigInteger("100000000000000000000000");
		BigInteger bigValue2 = new BigInteger("-90000000000000000000000");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger subResult = bigValue1.subtract(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		BigInteger divResult = bigValue1.divide(bigValue2);
		BigInteger remResult = bigValue1.remainder(bigValue2);
		
		System.out.println("큰수의 덧셈" + addResult);
		System.out.println("큰수의 뺄셈" + subResult);
		System.out.println("큰수의 곱셈" + mulResult);
		System.out.println("큰수의 나눗셈" + divResult);
		System.out.println("큰수의 나머지" + remResult);
		
		double db11 = 1.6;
		double db12 = 0.1;
		System.out.println("덧셈 오차"+(db11+db12));
		System.out.println("곱셈 오차"+(db11*db12));
		
		BigDecimal bigDec1 = new BigDecimal("1.6");
		BigDecimal bigDec2 = new BigDecimal("0.1");
		
		System.out.println("덧셈" + bigDec1.add(bigDec2));
		System.out.println("뺄셈" + bigDec1.subtract(bigDec2));
		System.out.println("곱셈" + bigDec1.multiply(bigDec2));
		System.out.println("나눗셈" + bigDec1.divide(bigDec2));
		System.out.println("나머지" + bigDec1.remainder(bigDec2));
		
	}

}
