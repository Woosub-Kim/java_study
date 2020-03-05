package ex14usebasicclass;
//Wrapper클래스
//기본자료형의 데이터를 객체화할때 사용하는 클래스
//오토박싱: 기본자료형이 자동으로 객체로 변경되는 것
//오토언박싱 객체가 자동으로 기본자료형으로 변경되는 것
//※ 오토박싱/언박싱은 JDK1.5이상에소 적용

public class WrapperClass1 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int result = num1 + num2;
		System.out.println("result= " + result);

//		Jdk1.4이전 버전에서의 코딩형태
		Integer n10obj = new Integer(10);
		Integer n20obj = new Integer(20);
		
		int result2 = n10obj.intValue() + n20obj.intValue();
		System.out.println("result2= " + result2);
//		Integer 객체를 언박싱해주는 메소드 통한 덧셈
		
		
		Integer resultobj = new Integer(result2);
		System.out.println("결과값 Byte형으로:" + resultobj.byteValue() );
		
		System.out.println("결과값 이진수형으로:" + Integer.toBinaryString(result2));
		
//		JDK1.5이상에서의 코딩형태 오토박싱 처리
		Integer numobj1 = 100;
		Integer numobj2 = 200;
		int num3 = numobj1;//오토언박싱
		
//		Wrapper클래스를 이용하는 이점
//		정의된 많은 메소드를 사용하여 최대 최소값 혹은 진법변환등을 처리한다.
		System.out.println("int형 최대값" + Integer.MAX_VALUE);
		System.out.println("int형 최소값" + Integer.MIN_VALUE);
		System.out.println("10을 2진수" + Integer.toBinaryString(10));
		System.out.println("10을 8진수" + Integer.toOctalString(10));
		System.out.println("10을 16진수" + Integer.toHexString(10));
					
	}	
	

}
