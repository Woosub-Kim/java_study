package ex11static;

class NoSingleTone{
	int instVar;
	public NoSingleTone() {
		// 기본생성자
	}
	public void showInfo() {
		System.out.println("instVar= " + instVar);
	}
}
/*
 * 싱글톤 디자인 패턴
 * 클래스를 설계하는 디자인 패턴의 하나로 하나의 인스턴스 즉 하나의 메모리를 생성해
 * 이를 공유해서 사용하고자 할 때 쓰는 패턴이다.
 * 
 * 방법
 * 1. 생성자의 접근지정자를 private으로 한다.
 * 2. 정적 메소드로 해당 클래스의 객체를 반환하도록 한다.
 */
class SingleTone{
	int shareVar;
	private SingleTone() {
		//기본생성자
	}
	/*
	 * JVM에의해 프로그램이 메모리에 로드될 때 객체가 생성되어 메소드영역에 할당된다.
	 */
	private static SingleTone single = new SingleTone();
	public static SingleTone getInstance() {
		return single;
	} 
	public void print() {
		System.out.printf("shareVar = %d", shareVar);
	}
}
public class SingletonDesignPattern {
	public static void main(String[] args) {
		//NoSingleTone객체생성
		/*
		 * 일반적인 클래스는 new연산자를 통해 생성하므로 메모리상에 계속해서 새로운 객체가 생성된다.
		 * (디버그모드로 확인)
		 */
		NoSingleTone no1 = new NoSingleTone();
		NoSingleTone no2 = new NoSingleTone();
		no1.instVar = 10;
		no2.instVar = 20;
		no1.showInfo();
		no2.showInfo();
		//생성자를 private로 선언했으므로 new연산자로 객체생성 불가
//		SingleTone st1 =  new SinleTone();
		/*
		 * 이미 생성되어 있는 static변수를 가져온다. 공유객체이므로 
		 * 해당 객체는 하나만 생성이 된다.
		 */
		SingleTone st2 =  SingleTone.getInstance();
		SingleTone st3 =  SingleTone.getInstance();
		st2.shareVar = 30;
		st3.shareVar = 40;
		st2.print();
		st3.print();
	}
}
