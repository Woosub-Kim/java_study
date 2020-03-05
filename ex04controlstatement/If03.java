package ex04controlstatement;

public class If03 {
/*
 * if문
 * 형식3
 * if(조건1){
 *   	실행문1;
 * {
 * else if(조건문2){
 * 		실행문2;
 * }
 * else{
 *     위 조건 모두 불만족시 실행문장;
 * }
 */
	public static void main(String[] args) {
		
		//시나리오
		//국영수 점수의 평균을 구하여 학점을 출력하는 프로그램을 작성하시오. 
		//90이상 A...60미만F
		
		int kor=60, eng=59, math=59;
		double avg = (kor+eng+math)/3.0;
		System.out.println("평균점수는" + avg);
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
		
		/*
		 ※if~else구문을 구성할 때에는 조건의 구간을 
		 어떻게 설정하느냐에 따라 전혀 다른 결과가 나올 수 있으므로 주의해야 한다.
		 아래 if문은 높은 점수라 할지라도 60점 이상의 조건을 만족하기때문에 무조건 D가 출력된다.
		 
		  
		 */
		
		if(avg<60) {
			System.out.println("f학점");
		}
		else if(avg<70) {
			System.out.println("d학점");
		}
		else if(avg<80) {
			System.out.println("c학점");
		}
		else if(avg<90) {
			System.out.println("b학점");
		}
		else {
			System.out.println("a학점");
		}
		
		/*
		시나리오
		문자하나를 입력해서 숫자이면 "숫자", 알파벳이면 "알파벳"을 출력하고 둘다 아니면 "듣보잡"을 출력하는 
		프로그램을 작성하시오. 아스키코드 모른다고 가정
		a => 알파벳
		4 => 숫자
		? => 듣보잡
		 */
		
		char chr = '@';
		if(chr>='0' && chr<='9') {
			System.out.printf("%c는 숫자%n", chr);//숫자인지 판단
		}
		else if((chr>='a' && chr<='z')||(chr>='A' && chr<='Z')) {
			System.out.printf("%c는 알파벳%n", chr);//알파벳인지 판단
		}
		else {
			System.out.printf("%c는 듣보%n", chr);//듣보잡
		}
	}

}
