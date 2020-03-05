package ex08class;
/*
 해당 예제에서 Human클래스를 외부파일로 선언하였다. 동일한 패키지에 정의된다면 컴파일러는 해당 클래스를
 찾아 객체화할 수 있다. 만약 다른 패키지에 정의되면 import선언 해야 한다.
 */
public class HumanMain {

	public static void main(String[] args) {
		//1.객체생성
		Human human = new Human();
		//2.객체 초기화
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		//3.멤버메소드를 통해 행동 구현
		human.showState();
		human.eat();
		human.walk();
		human.thinking();
		human.riceCakeSoup();
		human.showState();
		//4.에너지 고갈시키기
		for(int i=1; i<=20; i++) {
			human.walk();
		}
		human.showState();
		//5.에너지가 최대치를 넘도록 해보자
		for(int i=1; i<=20; i++) {
			human.eat();
		}
		human.showState();
		

	}

}
