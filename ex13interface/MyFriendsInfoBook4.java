package ex13interface;

import java.util.Scanner;

/*
 * 상속관계에 있어 Friend클래스는 최상위 클래스이므로 
 * 해당 객체배열에 하위 클래스의 객체를 한꺼번레 저장할 수 있다. 
 * 상위클래스의 객체가 하위클래스의 객체를 한꺼번에 저장할 수 있다
 * 다형성 개념 활용한 것
 * 
 */

//객체화되지 않는다.
abstract class Friend4{
	String name;
	String phone;
	String addr;
	public Friend4 (String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

//	하나이상의 추상메소드를  포함하는 클래스는 반드시 추상클래스로 선언되어야 한다.	
//	추상메소드: 완성시키지 않는다. 추상메소드 중괄호 X
//	아래와 같이 추상메소드의 경우는 함수의 몸체가 없다. 오버라이딩 목적으로 선언하는 경우에 사용한다.
	public abstract void showBasicInfo(); 
//	오버라이딩용-실행부가 없다.
	
	
}
class  HighFriend4 extends Friend4{
	String nickname;//별명
	public HighFriend4(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	/*
	 *Friend클래스를 상속하게 되면 abstract 메소드를 그대로 내려받는 꼴이 되어
	 *해당 HighFriend클래스고 abstract로 선언해야 한다.
	 *해당 클래스를 abstract로 선언하지 않기위해 아래와 같이 오버라이딩하여 
	 *abstract로 선언된 메소드를 가린다. 
	 */
	@Override
	public void showBasicInfo() {
		System.out.println("==급식친구==");
		System.out.println("이름: " + name);
		System.out.println("전화번호: "+phone);
		System.out.println("별명: " + nickname);
	}
}
class UnivFriend4 extends Friend4{
	String major;//전공
	public UnivFriend4(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==학식친구==");
		System.out.println("이름: " + name);
		System.out.println("전화번호: "+phone);
		System.out.println("전공: " + major);
	}
//	@Override
//	public void showBasicInfo() {
//		
//		
//	}
}

public class MyFriendsInfoBook4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
//		객체배열의 index로 사용할 변수
		Friend4[] friArr = new Friend4[100];
		int frIndex =0;
		
		String iName, iPhone, iAddr, iNickname, iMajor;
		
		for(int i=0; i<2; i++) {
			System.out.println("==급식 친구를 입력하세요==");
			System.out.println("이름: "); iName = scan.nextLine();
			System.out.println("전화번호: "); iPhone = scan.nextLine();
			System.out.println("주소: "); iAddr = scan.nextLine();
			System.out.println("별명: "); iNickname = scan.nextLine();
			HighFriend4 high = new HighFriend4(iName, iPhone, iAddr, iNickname);
		
//			frIndex의 초기값은 0이므로 0번 index에 데이터가 저장된 후 +1
//			
//			friArr[frIndex++] = high;
//			high.showBasicInfo();
		}
			
		for (int i = 0; i<2; i++) {
			System.out.println("==학식 친구를 입력하세요==");
			System.out.println("이름: "); iName = scan.nextLine();
			System.out.println("전화번호: "); iPhone = scan.nextLine();
			System.out.println("주소: "); iAddr = scan.nextLine();
			System.out.println("전공: "); iMajor= scan.nextLine();
			UnivFriend4 univ = new UnivFriend4(iName, iPhone, iAddr, iMajor);
			//univ.showBasicInfo();
			friArr[frIndex++] = univ;
		}
		
		/*
		 * 주소록에 저장된 모든 친구정보를 호출한다. 친구의 구분에 상관없이
		 * showBasicInfo()메소드를 호출하면 오버라이딩 처리된 가장 하위의 메소드가 호출되므로
		 * 별도 처리 필요 없다.
		 */
		for (int i = 0; i < frIndex; i++) {
			friArr[i].showBasicInfo();
		}
	
//		Friend클래스는 상속의 목적으로만 정의되었으므로 
//		abstract 키워드를 통해 추상클래스오 정의하면 new를
//		 통해 객체를 생성할 수 없게된다. 따라서 아래와 같은
//		 논리적오류를 원천차단할 수 있다.
// 		=============================================	 		
//		System.out.println("==친구를 입력하세요==");
//		System.out.println("이름: "); iName = scan.nextLine();
//		System.out.println("전화번호: "); iPhone = scan.nextLine();
//		System.out.println("주소: "); iAddr = scan.nextLine();
//		Friend4 fri = new Friend4(iName, iPhone, iAddr);
		
		
		
		
		//fri.showBasicInfo();
	
		
//		
//		Friend4[] friArr = new Friend4[100];
//		friArr[0] = univ;
//		friArr[1] = high;
//		

		

	}

}
