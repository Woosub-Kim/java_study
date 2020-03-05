package ex04controlstatement;



public class WhileEx {
	public static void main(String[] args) {
		//while문: 반복의 횟수가 정해져 있지 않을 때 '주로' 사용하는 반복문이다. 
		//횟수가 명확할 때는 for문 주로 사용
		//형식
		//while(조건){
		//		조건 참일때 실행문장;
		//		증감식;<-탈출조건위함.
		//}
		
		int sum = 0; //누적합 위한 변수 증가하는 i를 누적해서 더해
		int i = 1; //반복을 위한 조건에 사용될 변수
		//반복 조건식
		while(i<=1000) {
			//증가하는 i를 sum에 누적해서 더함.(1+2+3...)
			sum += i;
			//증가식, while문 탈출조건 만들기 위한.
			i++;
		}
		System.out.println("1~1000 합은" + sum);
		
		System.out.println("666666666666666666666666666666");
		
		/*
		 시나리오: 1부터 100까지의 정수 중 3의 배수이거나 5의 배수인 정수의 합을 구하여 
		 출력하는 프로그램을 작성하시오. while문 사용한다.
		 */
		
		/*
		1. 1~100 반복하는 반복문 만들기
		2. 반복문 안에서 3의 배수 나 5의 배수 찾기
		3. 위에서 찾은 변수 tot에 누적
		4. 결과 출력
		 */
		
		int tot=0, j=1; //tot 누적합 구하기 위한 변수, j는 반복을 위한 변수
		
		while(j<=100) {
			if(j%3==0||j%5==0) {//3의 배수거나 5의 배수인 조건
				tot +=j;//조건만족시에만 누적
			}
			j++;//
		}
		System.out.println("1부터 100사이 3이나 5의 배수 합:" + tot);//출력
		
		/*
		 시나리오
		 아래와 같은 모양을 출력하는 while문을 작성하시오
		 1 0 0 0
		 0 1 0 0
		 0 0 1 0
		 0 0 0 1
		 */
		
		int m=1;
		while(m<=4) {
			
			int n=1;
			while(n<=4) {
				if(m==n) 
					System.out.print("1 ");
				else
					System.out.print("0 ");
				n++;
			}
			System.out.println();
			m++;
		}
		
		/*
		 시나리오 구구단 출력하는 프로그램 작성하기
		 */
		
		int soo = 0;
		while(soo <= 9) {			
			int dan=2;
			while(dan<=9) {
				
				if(soo == 0)
					System.out.printf("  %d단         ", dan);
				else
					System.out.printf("%dX%d=%2d  ",dan, soo, (dan*soo));
				
				dan++;
			}
			System.out.println();
			soo++;
		}
		
		/*int k = 0;
		while(k<=3) {
			System.out.printf("?%kd", 1);
			System.out.println();
			k++;
		}
		*/
		
		
		char ga = '가';
		int k = 0;
		System.out.println("'가'가 가질수 있는 받힘들");
		while(k<=27) {
			System.out.print(ga++);
			k++;
		}
		System.out.println();
		
				
	
		
	}
}



