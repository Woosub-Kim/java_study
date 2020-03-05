package ex02variable;

public class JunsuType {

	public static void main(String[] args) {
		
		/*
		규칙
		1.큰 자료형과 작은 자료형의 연산결과는 항상 큰 자료형을 따른다.
		즉 실수 + 정수 = 실수
		2. 동일자료형 끼리의 연산결과는 동일 자료형이 된다. 단, int보다 작은 자료형의 연산결과는 int형이 된다. 
		byte + byte = int
		 */
		byte b1;
		b1 = 127;
		System.out.println("b1= " + b1);
		//byte 형은 127까지 표현할 수 있으므로 에러
		//b1 = 128; -128 ~ 127
		b1 = (byte)128;
		System.out.println("형변환 후 b1= " +b1);
		/*
		byte에 담을 수 없는 128을 byte형으로 형변환한 후 자료를 저장한다.
		문법적인 오류는 없으나 자료의 손실이 발생하여 -128이 출력된다.
		
		 형변환(Type Casting): 현재의 자료형을 다른 자료형으로 변환하는 행위
		 */
		
		byte b2=20, b3=30;
		//byte와 byte의 연산결과는 int가 된다. 위에서 설명한 규칙2에 해당.
		//byte b4= b2 + b3;
		int b5 = b2 + b3;
		System.out.println("byte형끼리 연산결과" + b5);
		/*
		규칙3 정수형에서 int형보다 큰 자료형 끼리의 연산결과는 기본규칙을 따른다.
		 */
		int num2=100, num3=200;
		long lng1=1000, lng2=2000;
		
		int num4 = num2 + num3;
		System.out.println("int끼리 연산 num4 = " + num4);
		
		long lng3 = num2 + lng1;
		System.out.println("long끼리 연산 lng3 = " + lng3);
		
		long lng4 = num2 + lng1;
		System.out.println("int와 long의 연산 lng4 = " + lng4);
		
		/*
		에러발생됨 out of range
		자바컴파일러(cpu)는 정수를 기본적으로 int타입으로 간주하므로, 
		접미사 L(l)을 붙여 long형 자료임을 컴파일러에게 알려주어야 에러가 발생하지 않는다.
		 */
		//long lng5 = 2200000000;
		long lng6 = 2200000000L;//점미사 L(l)
		System.out.println("lng6 = " + lng6);
		/*
		long타입의 자료를 int타입으로 변환했으므로 에러는 없어졌으나 오버플로우 발생 
		 */
		int num7 = (int)2200000000L;
		System.out.println("형변환후 num7" + num7);
		
	}

}
