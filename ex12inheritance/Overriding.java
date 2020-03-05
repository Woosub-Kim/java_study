package ex12inheritance;
/*
 * 베이스스피커 IS A 스피커
 * 위와 같은 관계가 성립하므로 상속관계로 표현 적합
 * 
 * 오버라이딩
 * 클래스가 상속관계에 있을때 하위클래스에서 상위클래스 멤버메소드를 동일한 이름으로 메소드 재정의 하는 것
 * 오버로딩과 다른 점은 매개변수의 갯수 타입 반환형이 완전히 동일한 형태로 정의된다. 
 * 하워클래스에서 오버로딩한 메소드는 상위클래스 메소드를 가린다. 
 * 따라서 하위클래스에서는 재정의된 메소드가 호출된다.
 */
class Speaker{
	private int volumnRate;
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	/*
	 * 상속관계에서 오버라이딩을 목적으로 정의된 메소드
	 */
	public void showState() {
		System.out.println("Volume? " + volumnRate);
	}
}
class BaseSpeaker extends Speaker{
	private int baseRate;
	
	public void setBase(int bass) {
		baseRate = bass;
		
	}
	/*
	 * @Override 
	 * 어노테이션. 오버라이딩 된 메소드에 붙어서 컴파일러에게 알려주는 역할을 한다.
	 */
	@Override
	public void showState() {
		// TODO Auto-generated method stub
		super.showState();
		System.out.println("Bass volume:"+baseRate  );
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		//부모 클래스 메소드
		baseSpeaker.setVolumn(10);
		//클래스 자신의 메소드
		baseSpeaker.setBase(20);
		
		/*
		 * 하위클래스에 오버라이딩하여 정의된 메소드가 호출된다.
		 * 부모의 메소드는 가려지고 오버라이딩된 자신의 메소드가 호출됨.
		 */
		
		baseSpeaker.showState();
		System.out.println();
		Speaker speaker = new BaseSpeaker();
		/*
		 * 다형성=>관점
		 */
		speaker.setVolumn(30);
		//speaker.setBase(20);->에러발생
		
		/*
		 * Speaker의 참조변수로 BaseSpeaker 객체를 참조하면 접근범위는 Speaker객체로 제한된다.
		 * 따라서 하위클래스에 정의된 setBase() 메소드는 호출할 수 없다.
		 * 단, 오버라이딩된 메소드가 있다면 하위클래스 메소드가 호출된다.
		 */
		
		speaker.showState();
		
	}

}
