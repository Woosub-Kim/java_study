package ex06array;

public class TwoArray02_1 {

	public static void main(String[] args) {
		/*
		 *아래와 같이 초기화하면 세로크기 3 가로크기 4로 지정된다.
		 *초기화 할 요소가 없는 부분은 null로 채워지게 된다.
		 *※ 아무것도 없는 값. 즉 빈값
		 *스페이드를 눌렀을 때의 공백과는 다름에 주의
		 */
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		System.out.println("배열의 행수"+arr.length);
		
		for(int i=0; i<arr.length;i++) {
			System.out.printf("%d행의 크기%d%n",i, arr[i].length );
		}
		System.out.println("배열출력하기");
		System.out.println("arr[0][1]=" + arr[0][1]);//정상출력
		//System.out.println("arr[0][2]=" + arr[0][2]);
		//arr[0][2]는 초기화되지 않아 null이므로 출력 시도하면 
		//ArrayIndexOutOfBoundsException발생. 
	}

}
