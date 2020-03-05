package ex06array;
/*
 * 
 */
public class CallByReference {
/*
 *call by reference 주소에 의한 호출
 *메소드를 호출할 때, 참조값을 전달하여 서로다른 지역에서도 
 *동일한 메모리영역을 참조할 수 있게 하는 호출방법
 *메소드의 지역이 다르더라도 참조값을 통해 참조하므로
 *A영역의 값의 변경을 B에서도 그대로 참조할 수 있는 장점이 있다.
 */
	public static void main(String[] args) {
		int[] arr = {100, 200};
		System.out.println("main 메소드 swap 전");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		callByReference(arr);
		
		System.out.println("메인 메소드  swap 후");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void callByReference(int[] ar) {
		int temp;
		temp = ar[0];
		ar[0] = ar[1];
		ar[1] = temp;
	}

}
