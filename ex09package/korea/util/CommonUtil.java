package ex09package.korea.util;

public class CommonUtil {
	/*
	 * 해당 클래스는 static타입으로 선언된 정적 메소드로 프로그램 
	 * 시작과 동시에 메소드영역에 로드되어 사용될 준비를 하게된다.
	 * 사용시 new를 통해 객체생성을 하지않고 클래스명으로 
	 * 즉시 호출 하는것이 가능하다.
	 */
	
	public static boolean isNumber(String strValue) {
		//문자열이 공백이면 즉시 false반환
		if (strValue.length()==0) {
			return false;
		}
		/*
		 * 문자열이 공백이 아닐경우 크기만큼 반복하며 특정 문자가 숫자형태인지 검사.
		 */
		for (int i = 0; i < strValue.length(); i++) {
			int accode = strValue.codePointAt(i);
			if (!(accode>='0'&&accode<='9')) {
				return false;
			}
		}
		return true;
	}
	

}
