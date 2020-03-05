package ex06array;

public class ArrayAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int [] ref;
		System.out.println("초기화 직후 출력");
		/*
		 arr배열의 크기만큼 반복하며 요소 출력
		 */
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		/*
		 배열명을 매개변수로 전달하는 것은 배열츼 참조값(힙 영역의 주소값)
		 을 전달하게 된다. 해당 참조값을 통해 배열을 접근할 수 있다.
		 */
		ref = addArray(arr, 7);
		System.out.println("메소드 호출후출력");
		/*
		 *배열변수 ref로 출력하는 것과 arr로 출력하는 것은 동일한 결과가 나오게된다. 
		 *이유는 동일한 주소값(참조값)을 가지고 있기 때문이다.
		 */
		for(int i=0; i<ref.length; i++) {
			System.out.print(ref[i]+" ");		
		}
		
		System.out.println();
		for(int i=0; i<ref.length; i++) {
			System.out.print(arr[i]+" ");
				
		}
	}
	
	static int[] addArray(int[] ar, int addval) {
		for(int i=0; i<ar.length; i++) {
			ar[i] += addval;
			//ar[i] = ar[i] + addval;
		}
		//매개변수로 전달받았던 주소값 그대로 반환
		return ar;
	}

}
