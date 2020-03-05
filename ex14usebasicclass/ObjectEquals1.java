package ex14usebasicclass;
//equals메소드
//자바에서 인스턴스의 내용비교를 위해 ==을 사용하는 것은 단순한 참조값에 대한 비교
//실제 내용에 대해 비교하기 위해 equals()메소드 사용
//String등 기본 클래스는 별도의 오버라이딩 처리없이 사용할 수 있다.
//개발자가 직접만든 클래스의 경우 오버라이딩 필요

import java.awt.ImageCapabilities;

class IntNumber{
	int num;
	public IntNumber(int num) {
		this.num = num;// TODO Auto-generated constructor stub
	}
	
//아래 메소드는 equals메소드가 어떻게 객체간의 내용비교하는지 설명 위한 샘플코드
	
	
	public boolean isEquals(IntNumber numObj) {
		if (this.num==numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class ObjectEquals1 {

	public static void main(String[] args) {
//기본 클래스 String의 객체비교				
		String str1 = new String("한국직업전문학교");
		String str2 = "한국직업전문학교";
//		String str1 = new String("한국직업전문학교");
		
		if (str1.equals(str2)) {
			System.out.println("같은 문자열");
		}
		else {
			System.out.println("다른 문자열");
		}
		
//개발자가 정의한 클래스의 내용 비교
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if (num1.isEquals(num2)) {
			System.out.println("num1=num2");
		}
		else {
			System.out.println("num1!=num2");
		}
		
		if (num1.isEquals(num3)) {
			System.out.println("num1=num3");
		}
		else {
			System.out.println("num1!=num3");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
