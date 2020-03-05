package ex06array;

public class Array01_1 {

	public static void main(String[] args) {
		/*
		 *자바에서는 배열을 클래스를 통해 생성하게 된다. 
		 *생성된 값은 heap에 저장되고 할당된 메모리의 주소값을 반환한다. 
		 *그래서 배열명(배열명)은 주소값(참조값)을 저장한다.
		 */
		int[] numArr = new int[3];
		
		numArr[0]=10;
		numArr[1]=20;
		numArr[2]=30;
		
		System.out.println(numArr);
		System.out.println(numArr[2]);
		System.out.println("=========");
		
		int[] arrNumber = new int[4];
		/*
		 *선언된 배열의 초기화를 반복문으로 진행
		 *이와같이 배열은 반복문을 통해 순차적 접근이 가능하므로
		 * 변수가 많을수록 효과적이다.
		 */
		                //배열명.length 배열크기 반환
		for(int i=0;i<arrNumber.length;i++) {
			arrNumber[i] = i + 10;
		}
		for(int i=0;i<4;i++) {
			System.out.println(arrNumber[i]);
		}
		System.out.println("======");
		
		/*
		 *객체 배열도 기본자료형 배열 선언과 동일하게 사용한다.
		 *단 객체배열에 저장되는 값이 ㅈ실제값이 아닌 주소값이라는 차이가 있다.
		 */
		String[] strArr = new String[3];
		strArr[0] = "java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		
		for(int j=0; j<strArr.length;j++) {
			System.out.println(strArr[j]);
		}
		
		System.out.println("배열의 방법과 초기화");
		System.out.println("방법1: 배열의 선언 이후 초기화");
		int[] initArr = new int[1];
		initArr[0]= 100;
		System.out.println("initArr[0] = n" + initArr[0]);
		//자바 컴파일러는 초기값의 개수를 통해 크기를 결정할 수 있다.
		//이런 경우 크기 생략(약속)
		System.out.println("방법2: 선언과 동시에 초기화");
		//int initArr2 = new int[3]{1,20,300};->에러발생
		int[] initArr2 = new int[] {1,20,300};
		
		System.out.println("방법3: 초기값만으로 선언");
		/*
		 *new 키워드 없이 초기값만으로도 배열을 선언할 수 있다. 
		 *이경우에도 요소의 갯수를 통해 배열의 크기가 결정된다.  
		 */
		int[] initArr3 = {11,13, 17, 19, 23};
		int arrSum = 0;
		for(int x=0; x<initArr3.length;x++) {
			arrSum += initArr3[x];	
		}
		
		System.out.println("합은 " + arrSum);
		
		

	}

}
