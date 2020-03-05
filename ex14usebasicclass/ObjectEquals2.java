package ex14usebasicclass;

class MyClass{
	int data;
	public MyClass(int data) {
		this.data = data;
	}
//toString()
//실제 저장된 데이터가 반환되도록 Object클래스로부터 상속받아 오버라이딩한 메소드				
	@Override
	public String toString() {
		return String.valueOf(data);
	}	
//hashcode()
//객체의 고유한 주솟값을 문자열의 상태로 반환
//차후 set에서 중복제거위해 사용됨

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return data;
	}
//equals()
//두 객체간에 내용비교를 위해 오버라이딩한 메소드로 멤버변수를 비교해서 동일한지 판단		
	@Override
	public boolean equals(Object obj) {
//비교의 대상이 되는 객체를 매개변수로 부터 받아 해당 객체타입인지 확인 후 비교		
		if (obj instanceof MyClass) {
//매개변수로 전달될 때 object로 업캐스팅(자동 형변환)
//실제 값 비교위해 다운캐스팅(명시적 형변환) 진행
			MyClass mc = (MyClass)obj;
			if (mc.data==this.data) {
				return true;//동일한 경우 true반환
			}
			else {
				return false;
			}	
		}
		return false;
	}	
}



class Point{
	int x,y;
	public Point(int x, int y) {
		this.x =x;
		this.y =y;
	}	
//객체 1의 x,y값과 객체 2의 x,y값을 각각 비교하여 동일한 객체인지 판단
//따라서 객체의 형태에따라 equals메소드 내용 달라진다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point pos = (Point)obj;
			if (this.x==pos.x&&this.y==pos.y) {
				return true;
			}
			else {
				return false;
			}	
		}
		return false;
	}
	@Override
	public String toString() {
		return "X=" + String.valueOf(x)+", y="+String.valueOf(y);
	}	
}

public class ObjectEquals2 {

//Collection List Set map
	public static void main(String[] args) {
//
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
//		
		System.out.println("두 객체 equal로 비교");
		if (mc1==mc2) {
			System.out.println("참조값 동일");
		}
		else {
			System.out.println("참조값 다름");
		}
		System.out.println(mc1.equals(mc2)? "같다":"다르다");
		System.out.println("두 객체의 toString");
		System.out.println("mc1=>" + mc1.toString());
		System.out.println("mc2=>" + mc2.toString());
		Point pos1 = new Point(10, 20);
		Point pos2 = new Point(10, 30);
		System.out.println(pos1.equals(pos2)? "같다":"다르다");
//아래 toString메소드는 굳이 호출하지 않아도 print문이 실행될때 자동호출 된다
//즉 결과는 동일
		System.out.println("pos1.tostring=> " +pos1.toString() );
		System.out.println("pos2.tostring=> " +pos2.toString() );
//		
		System.out.println(pos1);
		System.out.println(pos2);		
	}
}
