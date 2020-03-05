package ex07string;
import java.lang.*;//※wild card(*) '모든 것'을 의미하는 문자. 
/*
 *자바의 전제조건 1 
 *자바의 모든 프로그램은 java.lang패키지에 포함된다. 즉 아래의 import문은 생략이 가능하다.
 *해당 패키지 모든 클래스 사용 가능
 */
public class StringBasic extends Object{
/*
 *자바의 전제조건 2
 *자바에서 제공되는 혹은 생성하는 모든 클래스는 Object클래스를 자동으로 상속받는다.
 *따라서 Object클래스에 정의된 모든 메소드를 사용할 수 있다.
 */
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		//기본자료형 비교연산자로 비교
		String numResult = (num1==num2)? "데이터 동일": "데이터 다름";
		System.out.println(numResult);
		//String클래스 객체생성방법 1: new사용
		String str1 = new String("Hello Java");
		String str2 = new String("Hello Java");
		/*
		 str1, str2는 String객체의 주소값을 가지고 있으므로 단순히 
		 주소값에 대한 비교를 하고있다.
		 */
		if(str1==str2) {
			System.out.println("주소같음");
		}
		else {
			System.out.println("주소다름");
		}
		/*equals() 메소드 
		Object클래스로 부터 상속받은 메소드. 실제 객체에 대한 비교를 할수 
		있도록 정의됨. 즉 아래는 객체에 저장된 문자열에 대한 비교가 이루어진다.
		
		*/
		if(str1.equals(str2)) {
			System.out.println("내용같음");
		}
		else {
			System.out.println("내용다름");
		}
		/*
		 *자바에서 문자열 객체를 선언할 때, new를 사용하지 않고 ""을 사용하게 되면 동일한
		 *문자열인 경우 같은 메모리를 사용한다. new를 사용하면 무조건 새로운 메모리가 생성된다.
		 */
		String str3 = "한국직업전문학교";
		String str4 = "한국직업전문학교";
		if(str3==str4) {
			System.out.println("주소같음");
		}
		else {
			System.out.println("주소다름");
		}
		if(str3.equals(str4)) {
			System.out.println("내용같음");
		}
		else {
			System.out.println("내용다름");
		}
		
	}

}
