package ex07string;

public class StringMethod {

	public static void main(String[] args) {
	System.out.println("String 클래스 주요 메소드");
	
	String str1 = "Welcome to Java";
	String str2 = "자바야 놀자";
	/*
	 * 1. length(): 문자열 길이 반환
	 */
	System.out.println("the length of str1: " + str1.length());
	System.out.println("the length of str2: " + str2.length());
	/*
	 * 2. charAt(인덱스): 특정 안덱스에 해당하는 문자 하나를 반환한다. 
	 * 인덱스는 배열처럼 0부터 시작한다.
	 */
	System.out.println("the second character of str1: " + str1.charAt(1));	
	System.out.println("the second character of str2: " + str2.charAt(1));
	
	/*
	 * 시나리오
	 *주민등록번호를 이용하여 성별을 판단하는 프로그램을 작성하시오.
	 */
	
	String juminNum = "190419-3000000";
	char gender = juminNum.charAt(7); 
	if(gender=='2' || gender=='4') {
		System.out.println("Female");
	}
	else if(gender=='1' || gender=='3') {
		System.out.println("Male");
	}
	else {
		System.out.println("Wrong number");
	}
	/*
	 3. compareTo() 두 문자열을 첫글자부터 순차적으로 비교. 
	 앞문자의 아스키코드가 크면 양수 뒷문자가 크면 음수반환
	 같으면 0반환
	 */
	String str3 = "A";
	String str4 = "B";
	System.out.println(str3.compareTo(str4));
	System.out.println(str4.compareTo(str3));
	System.out.println("ABC".compareTo("ABC")==0 ? "same":"different");
	/*4. concat()
	 * 두개의 문자열을 연결할 때 사용한다. 자바에서는 주로 
	 * +연산자 사용한다. 
	 */
	System.out.println("Java".concat(" World"));
	System.out.println("Java" + " World");
	/*5. contains()
	 * 문자열에 특정 문자열이 포함되어있는지 판단하여 포함되었을 때 true반환.
	 */
	System.out.println(str1.contains("To"));
	System.out.println(str1.contains("to"));
	/*
	 *시나리오
	 *해당 문자열이 이메일 형식인지 검사하는 프로그램을 작성하시오.
	 */
	String email = "hong@ikosomo.co.kr";
	if(email.contains("@") && email.contains(".")) {
		System.out.println("valid email address");
	}
	else {
		System.out.println("check the email address");
	}
	
	/*
	 *6. format() 
	 *출력형식을 지정하여 문자열로 반환하고 싶을 때 사용하는 메소드.
	 *사용법은 printf()문과 동일
	 *주로 웹어플리케이션(웹사이트...) 제작할 때 사용
	 */
	System.out.printf("kor:%d, enf:%d, math:%d%n", 21, 92, 100 );
	String formatStr = String.format("kor:%d, enf:%d, math:%d%n", 21, 92, 100 );
	System.out.println(formatStr);
	/*
	 *7.indexOf() 
	 *문자열에서 특정 문자열의 시작 인덱스를 반환한다.
	 *만약 찾고자 하는 문자열이 없다면 -1을 반환한다.
	 */
	System.out.println(str1.indexOf("ava"));
	System.out.println(str1.indexOf("j"));
	System.out.println(email.indexOf("@")!=-1 ? "right":"wrong");
	juminNum = "120403-3012345";
	//주민번호에서 하이픈 기호의 인덱스를 찾아 1을 더하면 성별을 나타내는 숫자를 가져올 수 있다
	int index = juminNum.indexOf("-")+1;
	if(juminNum.charAt(index)=='3') {
		System.out.println("Male");
	}
	else {
		System.out.println("Female");
	}
	/*
	 *8. lastIndexOf()
	 *indexOf()와 사용방법은 동일하나 문자열의 뒤에서 부터 특정 문자열을 찾아서 인덱스를 반환한다.
	 */
	System.out.println("lastIndexOf:" + str1.lastIndexOf("a"));
	/*
	 *9.replace()
	 *특정 문자열을 찾아서 지정된 문자열로 변경한다. 만약 찾는 문자열이 없다면 변경만 되지 않을 뿐 
	 *에러가 발생하지는 않는다.
	 */
	System.out.println("J to G");
	System.out.println(str1.replace("J", "G"));
	System.out.println("java to KOSOMO");
	System.out.println(str1.replace("Java", "KOSOMO"));
	System.out.println("자바를 지울때도 사용가능");
	System.out.println(str2.replace("자바", ""));
	System.out.println("+++++++++++++++++++++++++");
	/*
	 *10.split()
	 *문자열을 구분자로 분리해서 String타입 배열로 반환.
	 *해당 구분자가 없는 경우 배열크기가 1인 String배열로 반환
	 */
	String phoneNumber = "010-1234-5678";
	String[] phoneArr = phoneNumber.split("-");
	for(int i=0; i<phoneArr.length;i++) {
		System.out.printf("phoneArr[%d] = %s\n", i, phoneArr[i]);
	}
	String[] phonArr = phoneNumber.split("=");
	for(int i=0; i<phonArr.length;i++) {
		System.out.printf("phoneArr[%d] = %s\n", i, phonArr[i]);
	}
	/*
	 *11. substring()
	 *시작인덱스와 끝 인덱스 사이의 문자열을 잘라서 반환하는 메소드
	 *사용법1 매개변수가 1개일때 인뎃스부터 끝까지 잘라 반환
	 *사용법2: 인덱스에 포함되는 문자열 만큼 잘라서 반환
	 */
	System.out.println(str1.substring(3));
	
	
	System.out.println(str1.substring(3,7));
    /*
	 * 연습문제
	 * 다음 파일 명에서 확장자를 잘라내는 프로그램을 작성하시오
	 * 출력결과 파일의 확장자는 jpg입니다.
	 */
	//방법0+++++++++++++++++++++++++++++++++++++++++++
	String fileName = "my.file.images.jpg";
	System.out.println("파일의 확장자는 "+ fileName.substring(fileName.lastIndexOf(".")+1));
	//방법1++++++++++++++++++++++++++++++++++++++++++++
	int formatIndex = fileName.lastIndexOf(".")+1;
	String fileFormat = new  String();
	fileFormat = fileName.substring(formatIndex);
	System.out.println(fileFormat);
	//방법2+++++++++++++++++++++++++++++++++++++++++++++
	fileName = "my.file.images.jpg";
	String[] fileForm = fileName.split("\\.");//정규표현식 아님을 표시

	System.out.println(fileForm.length);
	System.out.println(fileForm[(fileForm.length-1)]); 
	//replace(), split() 정규표현식 주의해야 하는 메소드
	

	}

}

