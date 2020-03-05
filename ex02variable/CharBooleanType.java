package ex02variable;

public class CharBooleanType {
/*
 아스키코드: 1바이트로 표현할 수 있는 문자(영자, 숫자)를 십진수코드로 정의한 것.
 A: 65 / 01000001
 a: 97 / 01100001
 유니코드: 1바이트로 표현할 수 없는 문자(한글, 한자)는 2바이트가 필요한데, 
 이를 16진수로 정의한 것.
 */
	public static void main(String[] args) {
		//char형: 하나의 문자를 저장할 수 있는 자료형 ''로 감싼다. ""->문자열로 인식
		char ch1 = '가';
		//char ch2 = '가나다라';
		System.out.println("ch1=" + ++ch1);
		
		char ch2 = 'A'; //65
		int num1 = 2;
		int num2 = ch2 + num1; //67 
		System.out.println("num2=" + num2);//출력: 67
		
		char ch3 = (char)(ch2 + num1);//65 + 2 = 67 -> C
		System.out.println("ch3문자출력 = " +ch3);
		System.out.println("ch3아스키코드 출력" +(int)ch3);//C -> 67
		//문자1의 아스키코드 49
		char ch4 = '1';
		char ch4_1 = 49;
		System.out.println("ch4= " + ch4 + " ch4_1= " + ch4_1 );
		/*
		boolean형: true나 false 두가지 값만 가질 수 있는 데이터형 
		산술(+ - * / %), 비교연산(<, >, <=, >=) 불가. 논리연산만 가능
		*/
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1= "+ bn1 + " bn2= "+ bn2);
		
		// && 논리 and연산 둘다 참일때 참
		// || 논리 OR연산 둘중 하나만 참이어도 참
		boolean bn3 = bn1 && bn2; //AND: T and F -> F
		System.out.println("bn3=" + bn3);
		boolean bn4 = bn1 || bn2; //OR: T OR F -> T
		System.out.println("bn4=" + bn4);
		
		bn3 = '가' > 30000; //유니코드44032 > 30000
		System.out.println("bn3=" + bn3);
		System.out.println((int)'가');
		
	}

}
