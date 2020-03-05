package ex12inheritance;
/*
 *IS-A관계
 *X is a Y => X는 Y의 일종이다로 표현가능
 *노트북은 컴퓨터의 일종이다.와 같이 IS-A 관계가 성립하는 것을
 *상속으로 표현하기 적합하다.
 */
//기본적인 컴퓨팅환경 제공
class Computer{
	String owner;

	public Computer(String owner) {
		
		this.owner = owner;
	}
	//멤버메소드
	private void keyboardTouch() {
		System.out.println("키보드를 통해 입력한");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	public void calculateFunc() {
		/*
		 * 필요한 메소드를 '캡슐화'하여 순서까지 정하여 정의함.
		 */
		keyboardTouch();
		calculate();
	/*
	 * private접근지정자로 선언된 메소드는 외부클래스 혹은 상속받은 클래스에서 접근이 불가능하므로
	 * public으로 선언된 멤버메소드를 통해 간접 호출한다. 상속관계이므로protected도 사용 가능하다.
	 */	
	}	
	
}
class NotebookCom extends Computer{
	int battary;
	
	public NotebookCom(String owner, int battary) {
		/*
		 * 부모 클래스의 생성호출을 위한 super()는 생략은 가능하나, 
		 * 다른 문장이 먼저 기술되면 오류!
		 */
		super(owner);
		this.battary = battary;
	}

	public void charging() {
		battary += 5;
	}
	public void movingCal() {
		if(battary<1) {//베터리 양 체크
			System.out.println("베터리 방전 사용 불가");
			return;
		}
		System.out.println("이동하면서");
		calculateFunc();//캡슐화된 메소드를 통한 기능수행
		battary -=1;
	}
	
}
class TabletNotebook extends NotebookCom{
	//태블릿을 사용하기위한 펜슬-등록된것 만 사용가능
	String registPencil;
	
	public TabletNotebook(String owner, int battary, String registPencil) {
		super(owner, battary);
		this.registPencil = registPencil;
	}

	public void write(String penInfo) {
		if (battary<1) {
			System.out.println("배터리 방전 사용불가");
			return;
		}
		//A.compareTo(B) 문자열을 비교하여 동일하면 0 다르면 1,-1을 반환한다. 사전순으로
		//문자열을 비교하는 메소드이다.
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("미등록 펜슬");
			return;
		}
		movingCal();
		System.out.println("스크린에 펜으로 끄적인다.");
		battary -= 1;
	}
}

public class ISAInheritance {
	public static void main(String[] args) {
		NotebookCom noteBook = new NotebookCom("공유", 5);
		TabletNotebook tablet = new TabletNotebook("이동울", 5, "ISE-1234");
		
		System.out.println("==노트북사용==");
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.movingCal();
		noteBook.charging();
		noteBook.movingCal();
		noteBook.movingCal();
		System.out.println("==ISE-1234펜으로 태블릿 사용==");
		tablet.write("ISE-1234");
		System.out.println("==XYZ-9876펜으로 태블릿 사용==");
		tablet.write("XYZ-9876");				
	}
}
