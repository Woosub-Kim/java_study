package ex06array;

public class ForEachObject {

	public static void main(String[] args) {
		/*
		 *객체배열 인스턴스배열
		 *배열에 정수 혹은 실수를 저장하게 죄면
		 *기본자료형이라 하고 객체를 저장하면 객체배열이라고 한다.
		 *
		 *객체를 저장한다는 것 외에 특별히 다른 것은 없으나 실제 저장되는 데이터는
		 *객체 자신이 아닌 참조값이다.
		 */
		String[] strArr = new String[] {
			"자바는 재미있다.",
			"자바는 유용하다",
			"그러나 어렵다."
		};
		
		for(String e:strArr) {
			
			System.out.println(e);
		}

	}

}
