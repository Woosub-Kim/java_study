package ex12inheritance;
//객체값이 null, 참조하는 객체가 없다.
/*
 * 복합관계로 표현하기에 적합한 HAS-A관계
 * X has A Y = x가 Y를 소유한다.
 * 위와 같은 소유관계를 상속으로 표현하면 클래스간의 강한 연결고리가 형성되어 
 * 권총이 없는 경찰등을 표현하기 힘들어지므로 이런 경우 복합관계가 바람직하다.
 * 복합관계란 클래스의 멤버로 다른 갱체가 정의되는 것을 말함.
 */
class Gun{
	int bullet; //총알 갯수
	
	public Gun(int bullet) {
		super();
		this.bullet = bullet;
	}
	public void shotGun() {
		System.out.println("Bang~!");
		bullet--;
	}
}

class Police{
	int handCuffs;
	Gun pistol;
	public Police(int bullet, int handCuffs) {
		this.handCuffs = handCuffs;
		/*
		 * 권총 보유여부 초기화
		 * 만약 총알이 0이면 보유한 권총이 없는것으로 표현하고 참조변수는 null이 된다.
		 * 참조변수가 null이라는 것은 참조할 변수가 없다는 의미이다.
		 */
		if(bullet<=0) {
			pistol = null;
		}
		else{
			pistol = new Gun(bullet);
		}
	}
	public void putHandcuff() {
		System.out.println("응 검거~");
	handCuffs--;
	}
	public void shot() {
		if(pistol == null) {
			System.out.println("연장챙겨야지");
		}
		else {
			pistol.shotGun();
		}
	}
	
}




public class HasAComposite {

	public static void main(String[] args) {
		//권총 보유 경찰
		System.out.println("policman 1");
		Police police1 = new Police(5, 3);
		police1.shot();
		police1.putHandcuff();
		//권총 비보유 경찰
		System.out.println("policman 2");
		Police police2 = new Police(0, 3);
		police2.shot();
		police2.putHandcuff();
		
	}

}
