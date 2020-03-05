package ex06array;

import java.util.Random;

public class Array01_2 {

	public static void main(String[] args) {
		//난수생성방법1
		/*
		 *Math.random() 0~1사이 실수를 반환한다.
		 */
		double db1Random = Math.random();
		System.out.println("생성된 난수"+db1Random);
		int intRandom = (int)(db1Random*100);
		System.out.println("정수로 선언된 난수" + intRandom);
		
		//난수생성방법2
		//Random클래스의 하위메소드 nextInt()사용
		Random rndNumber = new Random();
		System.out.println("생성된 난수"+rndNumber.nextInt());
		
		/*
		 *시나리오
		 *난수를 생성하여 크기가 6인 배열을 초기화하시오.
		 *로또번호처럼 1~45 사이의 난수 사용
		 */
		
		System.out.println("1~45 난수생성" + (int)((Math.random()*100)%45+1));
		System.out.println("=======");
		/*
		 *로또번호 생성하는 방법
		 *1. 0.XXXX형태의 난수를 정수로 변경하기위해 100(혹은 더 큰수)을 곱한후 int형으로 형변환한다.
		 *2. 45로 %연산하여 나머지를 구한다. 이 결과는 0~44이다.
		 *2번으ㅢ 결과에 1을 더하면 1~45사이의 난수를 구할 수 있다.
		 */
		System.out.println("크기가 6인 배열에 난수입력");
		int[] lottoNum = new int[6];
		for(int i = 0; i<lottoNum.length; i++) {
			lottoNum[i] = (int)((Math.random()*100)%45)+1;
		}
		/*
		 *생성된 난수로 크기 6 정수형 배열 초기화
		 */
		for(int i=0; i<lottoNum.length;i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
		/*
		 *
		 */
		
		
		

	}

}
   