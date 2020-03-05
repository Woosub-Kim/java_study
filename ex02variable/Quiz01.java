package ex02variable;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 퀴즈01] 파일명 : Quiz01.java
		1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
		2.국어 89점, 영어 99점, 수학 78점을 대입한다.
		3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
		4.총합점수를 출력한다.
		
		실행결과 
	 	국어점수:XX점, 수학점수:XX점, 영어점수:XX점
	 	3과목의 총점은 : XXX점	
		 */
		int kor,eng, math, tot;
		double avg;
		kor = 89;
		eng = 99;
		math = 78;
		tot = kor + eng + math;
		avg = (double)tot / 3;
		System.out.printf("국어점수: %d점, 영어점수 %d점, 수학점수 %d점%n3과목의 총점: %d점, 평균%g점", kor, eng, math, tot, avg);
		
		//소수점 이하자릿수 결정
		System.out.printf("\n평균:%7.3f", avg);// 오른쪽 정렬, 전체 7자리, 소숫점이하 3자리
		System.out.printf("\n평균:%9.3f", avg);// 오른쪽 정렬, 전체 9자리, 소숫점이하 3자리
		System.out.printf("\n평균:%-9.3f", avg);// 왼쪽 정렬, 전체 9자리, 소숫점이하 3자리
		System.out.printf("\n국어:%-6d점", kor);
		System.out.printf("\n영어:%4d점", eng);
		System.out.printf("\n수학:%6d점", math);
	}

}
