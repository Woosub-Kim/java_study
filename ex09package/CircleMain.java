package ex09package;
/*
 * 메인클래스에서 다른 클래스를 import하여 사용하려면 해당 클래스는 반드시.public으로 선언되어야 한다.
 * 그렇지 않으면 not visible에러가 발생하게 된다.
 */
import ex09package.korea.perimeter.Circle;

public class CircleMain {

	public static void main(String[] args) {
		// 원의 넓이:풀 패키지경로 이용함.
		ex09package.korea.area.Circle circle1 = new ex09package.korea.area.Circle(6.5);
		System.out.println("반지름 6.5인 원의 넓이:" + circle1.getArea());
		//원의 둘레: import를 이용하여 파일을 포함시킴.
		Circle circle2 = new Circle(4.5);
		System.out.println("반지름 4.5인 원의 둘레:" + circle2.getPerimeter());

	}

}
