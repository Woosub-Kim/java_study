package ex04controlstatement;


/*
 do ~ while문: 반드시 한번은 실행해야 할 경우 사용하는 반복문. 
 조건검사 없이 무조건 한번은 실행한 후 조건을 검사한다.
 
 do{
 	실행문장;
 	증감식;
 }while(조건식);
 */
public class DoWhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("1~10까지 합" + sum);
		
		/*
		 시나리오
		 1~1000 까지의 정수중 4의 배수이거나 7의 배수인 수의 합을 구하여 
		 출력하는 프로그램을 do~while문으로 작성하시오.
		 */
		int j = 1, total = 0;//반복변수, 누적합 변수
		do {//무조건 한번실행
			total = (j%4==0||j%7==0)? total+j: total; //조건에 맞을때 j를 total에 누적 
			j++;
		}while(j<=1000);//반복조건체크
		System.out.println("1부터 1000까지 4나 7의 배수합:" +total);
		
	}

}
