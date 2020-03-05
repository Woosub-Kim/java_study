package ex14usebasicclass;
import java.lang.*;
//* 와일드카드 패키지를 임포트할 때, 보통은 클래스명을 명시하나 특정 패키지의 모든 클래스를
//임포트힐 때에는 *사용
//모든 것 의미

//Object클래스
//자바에서 최상위 클래스
//별도의 선언없이 Object에 정의된 메소드 사용 가능
//개발자가 정의한 모든 클래스를 Object객체로 참조할 수 있다

class Friends extends Object{
	String myName;
	public Friends(String name) {
		myName = name;
	}
//	@Override
//	public String toString() {		
//		return"제 이름은 " + myName +"입니다.";
//	}	
}



//toString 메소드
//Object에 정의된 메소드로 println시 문자열 출력하기 전 자동 사용
//객체를 문자열 형태로 반환
//필요한 경우 클래스르 정의할 때 적절히 오버라이딩해서 사용
public class ToStringObject{

	public static void main(String[] args) {
		Friends fnd1 = new Friends("이순신");
		Friends fnd2 = new Friends("김유신");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
	}
}
