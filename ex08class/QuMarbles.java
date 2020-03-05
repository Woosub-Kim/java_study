package ex08class;
/*
*구슬치기 하는 아이들을 모델링하여 클래스로 정의해보자.
*어린아이가 보유하고 있는 구슬의 개수 정보를 담는다
*놀이를 통해 구슬을 획득 또는 상실하는 것을 표현한다.
*어린이의 현재 보유하고 있는 구슬의 개수를 표현한다.
*초기화는 다음과 같이 진행한다.
*	◆어린이1의 보유갯수 : 구슬 20개
*	◆어린이2의 보유갯수 : 구슬 15개
*게임은 다음과 같이 진행한다.
*	◆1차게임 : 어린이1은 어린이2의 구슬 5개를 획득한다.
*	◆2차게임 : 어린이2는 어린이1의 구슬 9개를 획득한다.
*/
class ChildProperty{
	private int marble;//멤버변수 
	
	public ChildProperty(int start) {//생성자 (필드는 대충 속성을 의미)
		marble = start;
	}
	//멤버메소드
	public void showProperty() {
		System.out.println(marble);
	}
	public void obtainBead(ChildProperty child, int tropy){
		System.out.println("==============\n묻고 더블로 가!");	
		/*
		 * 구슬을 획득하는 주체가 되는 어린이는 해당 함수를 호출한 객체이므로 this사용.
		 * 멤버변수를 증가시킨다.
		 */
		this.marble += tropy;
		/*
		 * 구슬을 잃는 어린이는  매개변수로 전달되는 객체
		 * 멤버변수를 차감한다.
		 */
		child.marble -= tropy;
		System.out.println("이 구슬은 제가 먹습니다. 신사답게\n==============");	
	}
}

public class QuMarbles {

	public static void main(String[] args) {
			//해당 클래스에 매개변수 1개인 생성자 호출하여 객체생성
			ChildProperty child1 = new ChildProperty(20);
			ChildProperty child2 = new ChildProperty(15);

			System.out.println("게임 전 구슬의 보유 개수");
			System.out.print("어린이1 : ");
			child1.showProperty(); 
			System.out.print("어린이2 : ");
			child2.showProperty(); 
			
			/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
			child1.obtainBead(child2, 5);
			//
			
			/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
			child2.obtainBead(child1, 9);

			System.out.println("게임 후 구슬의 보유 개수");
			System.out.print("어린이1 : ");
			child1.showProperty(); 
			System.out.print("어린이2 : ");
			child2.showProperty();



	}

}
