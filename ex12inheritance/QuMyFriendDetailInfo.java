package ex12inheritance;
/*
다음 상속관계에 있는 두 클래스의 적절한 생성자를 정의해보자.
main 함수에서는 MyFriendDetailInfo 클래스를 통해서 객체를 생성해야 하고 생성된 정보를 확인할 수 있도록 해보자.
*/

class MyFriendInfo
{
	private String name;
	int age;
	
	public void ShowMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
	public MyFriendInfo(String name, int age){
		this.name = name;
		this.age = age;
	}	
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
    private String phone;
    //생성자의 정의: 부모의 멤버변수 2개, 자신의 멤버변수 2개를 초기화할 수 있도록 정의	
	public MyFriendDetailInfo(String name, int age, String addr, String phone) {
		//부모 생성자 호출
		super(name, age);
		//자기 멤버변수 초기화
		this.addr = addr;
		this.phone = phone;
	}
	public void ShowMyFriendDetailInfo()
	{
		ShowMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}

class QuMyFriendDetailInfo
{
	public static void main(String[] args)
	{
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		MyFriendDetailInfo friend = new MyFriendDetailInfo("한국직업전문학교", 20, "서울시 구로구 신도림동", "02-1234-5678");
		//정보Print
		friend.ShowMyFriendDetailInfo();	
	}
}

