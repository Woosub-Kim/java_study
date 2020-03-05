package ex04controlstatement;
/*
 *for문: while문과 같은 반복문으로 초기값 조건식 증감식이 한 라인에 있어 반복횟수를
 *명확히 알 수 있는 반복문.
 *사용빈도가 가장 높음
 *형식
 *for(초기값; 조건식; 증감식){
 *	실행문장;
 *}
 *
 *실행순서
 *초기값> 조건식> 실행문> 증감식> 조건식>....
 */
public class ForEx {

	public static void main(String[] args) {
		// gg
		for(int i=1; i<=5; i++) {
			System.out.println("i=" + i);
		}
		
		/*
		 시나리오 1~10까지의 합을 구하는 프로그램을
		 for문을 이용해 작성하시오.
		 */
		
		int sum = 0;
		//
		for(int j=1; j<= 10; j++) {
			sum += j;
		}
		System.out.println("sum=" + sum);
		
		/*
		 *시나리오
		 *1~10까지의 정수 중 2의 배수 합을 구하는 프로그램을
		 *for문을 이용하여 작성하시오
		 */
		
		
		//방법1 if문
		int total = 0;
		for(int x=1; x<=10; x++) {
			if(x%2==0) {
				total +=x;
			}
		}
		System.out.println("if문으로 total=" + total);
		
		
		
		//방법2 2씩 증가
		total = 0;
		for(int x=0; x<=10; x+=2) {
			total +=x;
		}
		System.out.println("if문 없이 total=" + total);
		
		int i = 0; //main 함수 지역
		for(; i<=5; i++) {
			System.out.println("for문 안에서 i값" + i);
		}
		
		System.out.println("for문 밖에서 i값" + i);
		
		for(int j=0; j<=5; j++) {
			System.out.println("for문 안의 j" + j);
		}
		
		//System.out.println("for문 밖에서 j" + j); 변수 j는 for문의 지역변수로 for문 밖에서
		//쓸 수 없다.
		
		/*
		 *전역변수와 지역변수
		 *for문의 초기식에서 선언된 변수 j는 for문 지역을 벗어난 순간 메모리에서 소멸된다. 
		 *이때 j를 for문의 지역변수라 한다.
		 *
		 * i는 main메소드 지역변수로 for문보다 더 큰 지역에서 선언되었으므로 for문 안에서 사용 가능하다.
		 * 하나의 중괄호 하나의 지역
		 * 
		 * for문의 초기값을 외부(넓은지역)에서 선언하게 되면 해당 변수는 
		 * for문 안쪽 (좁은지역)에서 사용 가능하다.
		 */
		
		//for(;;) 무한루프
		//무한루프는 주로 while문으로 작성.
		
		/*
		 * 시나리오 다음의 출력결과를 보이는 for문을 작성하시오
		 * 1000
		 * 0100
		 * 0010
		 * 0001
		 */
		
		for(int x=1;x<=4;x++) {
			
			for(int y=1;y<=4;y++) {
				
				if(x==y)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			
			System.out.println();
		}
		
		for(int x=1;x<=4;x++) {
					
			for(int y=4;y>=1;y--) {
				
				if(x==y)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
					
			System.out.println();
		}
			
			for(int x=1;x<=4;x++) {
				
				for(int y=1;y<=4;y++) {
					
					if(x+y==5)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
				
				System.out.println();
			}	
				
			for(int x=1;x<=4;x++) {
					
				for(int y=1;y<=4;y++) {
						
					if(y==5-x)
						System.out.print("1 ");
					else
						System.out.print("0 ");
					}
					
					System.out.println();
				}
		}	

}



