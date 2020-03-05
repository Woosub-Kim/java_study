package ex12inheritance;
/*
 * 오버로딩
 * 함수명은 같으나 매개변수의 갯수나 타입 순서가 다른 경우 함수정의를 말한다. 즉, 서로 다른 함수이므로 
 * 상속받은 클래스에서는 오버로딩된 메소드가 포함된다.
 * 
 * 오버라이딩
 * 함수명, 매개변수의 갯수와 타입이 모두 동일한 함수를 상속관계의 하위 클래스에서 재정의 하는 것.
 * 이 경우 하위클래스에서 정의한 메소드가 상위 클래스의 메소드를 가리게 되므로
 * 항상 최하위클래스 메소드가 호출된다.
 * 
 * 오버라이딩은 참조변수의 영향을 받지 않는다. 항상 최하위 메소드가 호출된다
 * 오바로딩은 참조변수의 영향을 받는다. 해당 참조변수의 범위까지만 접근이 가능하다.
 */

class Ac{
	public void rideMethod() {
		System.out.println("A ride");
	}
	public void loadMethod() {
		System.out.println("A load");
	}
}

class Bc extends Ac{
	@Override
	public void rideMethod() {
		System.out.println("B ride");	
	}
	public void loadMethod(int n) {
		System.out.println("B load");
	}
}

class Cc extends Bc{
	@Override
	public void rideMethod() {
		System.out.println("C ride");
	}
	public void loadMethod(double n) {
		System.out.println("C load");
	}
	
}
class Dc extends Cc{
	@Override
	public void rideMethod() {
		System.out.println("D ride");
	}
	public void loadMethod(long n) {
		System.out.println("D load");
	}
}

public class RideAndLoad {

	public static void main(String[] args) {
		Ac ref1 = new Cc();
		Bc ref2 = new Cc();
		Cc ref3 = new Cc();
		System.out.println("OverRide");
		ref1.rideMethod();//C에
		ref2.rideMethod();//정의된
		ref3.rideMethod();//오버라이딩
		System.out.println("OverLoad");
		//객체를 C타입으로 간주하고 참조
		ref3.loadMethod();//각각의
		ref3.loadMethod(1);//클래스에 정의된 
		ref3.loadMethod(1.1);//메소드 호출
		//객체를 B타입으로 간주하고 참조
		ref2.loadMethod();//B객체까지만 
		ref2.loadMethod(1);//접근가능
		//ref2.loadMethod(1.1);//C객체 접근 불가
		//객체를 A타입으로 간주하고 참조
		ref1.loadMethod();//A객체만 접근가능
		//ref1.loadMethod(1);//ㅠB객체 접근불가
		//ref1.loadMethod(1.1);C객체 접근불가
		
	}

}
