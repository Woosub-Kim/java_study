package ex08class;

/*
 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.

 */
class Triangle{
	//멤버변수
	private int bottom;//밑변
	private int height;//높이
	
	/*void setBottom(int bot) {
		bottom = bot;
	}
	void setHeight(int ht) {
		height = ht;
	}*/
	
	double getArea() {
		//삼각형 넓이 반환
		return bottom*height*0.5;
	}
	void init(int bot, int ht) {
		bottom = bot;
		height = ht;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	/*
	 * setter()메소드 자동생성 순서
	 * 멤버변수선언 -> 우클릭 -> source -> getter and setter -> 선택 후 만들기
	 */
	
}
public class QuTriangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}

}
