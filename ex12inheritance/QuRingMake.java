package ex12inheritance;

//다음 Point클래스를 이용하여 다음 문제를 해결하시오. 해당 문제는 상속을 통해 구현하는것이 아니라 복합관계를 이용하여 해결한다.
//원의 중심점을 표현하기 위한 클래스로 x,y값을 가지고 있음
class Point
{
   	private int xDot, yDot;
   	public Point(int x, int y){
   		xDot=x;
        yDot=y;
   	}
//멤버 메소드 원의 정보 출력
   	public void showPointInfo(){
         System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}	
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
//멤버변수
	private int radian;//반지름
	private Point center;
//Circle 클래스의 생성자
	public Circle(int x, int y, int rad) {
		center = new Point(x,y); //point객체 생성
		radian = rad;//반지름 초기화
	}
//멤버 메소드: 원의 정보 출력
	public void showCircleInfo() {
		System.out.println("반지름: " + radian);
//원의 중심좌표 정보출력: 상속관계가 아니므로 객체를 이용해서 멤버메소드 호출		
		center.showPointInfo();
	}	
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
//멤버변수
	private Circle innerCircle;//안쪽의 원
	private Circle outerCircle;//바깥쪽의 원
	public Ring(int ix, int iy, int irad,int ox, int oy, int orad) {
//상속관계가 아니라 복합관계로 표형되어 super() 대신 new
		innerCircle = new Circle(ix, iy, irad);
		outerCircle = new Circle(ox, oy, orad);		
	}
//멤버 메소드
	public void showRingInfo() {
//링의 정보 출력 링은 2개의 원으로 구성되므로 각각의 정보를 출력하면 된다.
		System.out.println("안쪽 원의 정보: ");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽 원의 정보: ");
		outerCircle.showCircleInfo();
	}
}
//이 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자.
//그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.
//main 메소드는 다음과 같다.
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
