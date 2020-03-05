package ex02variable;

public class EscapeSequence {
// 이스케이프 시컨스	 특정형식에 맞데 출력하기 위해 사용되는 문자. \(역슬러쉬)를 붙여 사용한다.
	public static void main(String[] args) {
		// \t 탭
		System.out.println("4월엔 벚꽃~~");
		System.out.println("4월엔 \t벚꽃~~");
		// \n 줄바꿈
		System.out.println("신도링에 오신걸 환영합니다.");
		System.out.println("여긴 한국직업\n전문학교입니다");
		
		System.out.println("4월엔\\벚꽃~~");
		// \" 따음표
		System.out.println("4월엔 \"벚꽃\"~~");
		//System.out.println("나는 "개발자"가 되고 싶어요");
		System.out.println("나는 \"빅데이터\"도 하고싶어요 ");
		//printf()문: 문자열을 서식에 맞춰 출력할 때 사용
		//%d 십진수, %f 실수, %s 문자열, %c 문자, %n 줄바꿈
		int kor=100, eng=99, math=98;
		System.out.printf("국어는:%d, 영어:%d, 수학:%d\n", kor, eng, math);
		System.out.println("국어:" + kor + ", 영어는:" + eng + ",수학은:" + math);
		
		System.out.print("print문은 줄바꿈 기능 없음");
		System.out.printf("printf문은 줄바꿈 안됨%n");
		System.out.println("나는 됨 ㅋㅋ");
		System.out.print("끝");
	}

}
  