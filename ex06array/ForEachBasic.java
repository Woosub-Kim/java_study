package ex06array;
/*
 *for each문
 *배열의 밀부가 아니라 전체를 #참조해야 할때 주로 사용하는 개선된 for문
 *배열의 요소를 #참조형태로 가져와서 출력. 그러므로 #참조의
 *목적으로만 사용해야 하고 값의 변경은 기본적으로 허용하지 않는다.
 *
 *형식
 *for(자료형 참조변수: 배열명){
 *	실행문장;
 *	참조변수를 통해 배열의 각 요소 출력가능
 *}
 */
public class ForEachBasic {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("기존 for문 합계 " +sum);
	
		int tot = 0;
		for(int e: arr) {  //배열 arr의 요소를 하나씩 참조하여 출력
			System.out.print(e + " "); //더 참조할 요소가 없을때 
			tot += e; //                for each문 자동 종료
		}
		
		System.out.println("\nfor each문 이용한 합계 " +tot);
		/*
		 *참조형태로 각 요소를 가져와서 변수 b에 할당하는 형식이므로 아래 증가가 실제
		 *배열에 반영되지 않음.
		 */
		
		System.out.println("\n배열 arr 요소값 1증가시키디");
		for(int d:arr) {
			d++;
			System.out.print(d+ " ");
		}
		System.out.println(" ");
		System.out.println("배열  arr 재출력");
		for(int f: arr) {
			System.out.print(f + " ");
		}
		System.out.println();
		System.out.println("2차원 배열을 foreach문으로 출력");
		
		int[][] twoDim = {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300,400}
		};
		
		for(int a[]:twoDim) {//첫번째 for문 2차원 배열에서 하나의 행씩 가져오기
			System.out.println(a);
			for(int b :a) {//두번째 for문 행에서요소 하나씩 참조.
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	
	
	}

}
