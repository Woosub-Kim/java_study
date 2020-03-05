package ex12inheritance;
//정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
//그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 아래의 소스를 참조하여 구현하시오. 

//직사각형을 표현한 클래스
class Rectangle{
	private int side1;
	private int side2;
	public Rectangle(int side1, int side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	public void ShowAreaInfo() {
		System.out.println("Rectangle area: "+side1*side2);
	}
	public int getSide1() {
		return side1;
	}
	public int getSide2() {
		return side2;
	}
	
}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle{
//멤버변수: 여기서는 필요없음
//부모클래스에 이미 정의되어있는 멤버변수를 사용하므로 
//추가적인 정의는 필요없다.

//생성자: 정사각형은 가로, 세로 길이가 같으므로 매개변수 하나로
//2개의 멤버변수를 초기화한다.
	public Square(int side) {
		super(side, side);	
	}
	
//멤버메소드 오버라이딩 정의(자동완성 권장)
//부모 클래스의 멤버변수를 getter()메소드로 간접접근

	public void ShowAreaInfo() {
		System.out.printf("Square area: "+getSide1()*getSide2());
	}
	
} 


class QuRectangleMain
{
	public static void main(String[] args)
	{
       	Rectangle rec = new Rectangle(4, 3);
       	rec.ShowAreaInfo();
 
       	Square sqr = new Square(7);
       	sqr.ShowAreaInfo();
   	}
	
}


