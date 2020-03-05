package ex14usebasicclass;

public class WrapperClass2 {

	public static void main(String[] args) {
//Wrapper 클래스의 주요 메소드
//static int parseInt(String s)
//static Integer valueOf(String s) 
//숫자 형식의 문자열을 숫자로 변경해 반환한다
		String strNumber  = "1000";
		System.out.println("10+strNumber" + (10+strNumber));//결과 101000
		System.out.println("10+strNumber 숫자로 변경"+ 10 + Integer.valueOf(strNumber));
//valueOf()메소드의 반환타입은 Integer이지만 오토언박싱이 지원되어 별도의 처리없이 연산가능
		String money = "120원";       //문자열을 받아 숫자로 바꿔주는 메소드   
//		System.out.println("120원: " + Integer.parseInt(money));
//숫자형태의 문지열이 아닌 경우 에러가 발생 "원"은 숫자가 아니므로 제거해야 한다.		
//런타임 에러 		
		
		String floatString = "3.14";
//		System.out.println(Integer.parseInt(floatString)); 오류 발생
		System.out.println("실수형(float) 변경" + Float.parseFloat(floatString));
		System.out.println("실수형(double) 변경" + Double.parseDouble(floatString));
//실수 형태의 문자열을 실수로 변경할 때에는 parseInt 사용할 수 없다.
		
//Character 클래스의 주요 메소드
//1. static int codePopintAt(문자열, 인덱스)
//2. 문자열에서 특정 index에 해당하는 문자의 아스키코드값을 반환한다. index는 0부터 시작
		System.out.println("ABCD에서 3번째 인뎃스 아스키 코드");
		System.out.println(Character.codePointAt("ABCD", 3));//결과 68
//3. static boolean is Digit
//전달 받은 문자열이 숫자 홋은 숫자형 문자일때 숫자로 판단
		System.out.println("isDigit 통한 숫자판단");
		System.out.println(Character.isDigit('A')? "number": "not number");
		System.out.println(Character.isDigit(50)? "number": "not number");
		System.out.println(Character.isDigit('7')? "number": "not number");
//4. static boolean isLetter
//문자여부를 판단하는 메소드 특수기호나 숫자형은  false
		System.out.println("isLetter 통한 문자판단");
		System.out.println(Character.isLetter('가'));//t
		System.out.println(Character.isLetter('A'));//t
		System.out.println(Character.isLetter('#'));//f
		System.out.println(Character.isLetter('9'));//f
//5. staitc method isWhitespace(문자)
//공백문자인지 판단하는 메소드
		System.out.println("isWhite메소드로 공백문자 확인");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));//T		
//6. 대소문자
//영문자에만 적용되며 알파벳이 아닌 문자에 적용하면 false 반환
		System.out.println("대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isUpperCase('Z'));
		System.out.println(Character.isLowerCase('가'));//당연히 F
		System.out.println(Character.isUpperCase('가'));	//당연히 F	
//toCharArray(): 문자열을 char배열로 반환하는 메소드
//아래는 문자열 안에 몇개의 공백이 포함되어 있는지 확인하는 프로그램.
		String whitString = "   HE    L  L    O ";
		int wCount = 0;
		char[] chArr = whitString.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (Character.isWhitespace(chArr[i])) {
				wCount++;
			}
		}
		System.out.println("총 공백" + wCount);
	}		

}
		




