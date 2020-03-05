package ex12inheritance;

/*
 * 두 클래스가 상속관계에 있더라도 private으로 선언되면 클래스 내부에서만 접근 가능하다. 즉 상속받은 하위
 * 클래스에서 직접 접근이 불가능하다.
 */
//부모클래스
class Account{
	private int money;//잔고
	public Account(int init) {
		money = init;		
	}
	//입금처리: protected이므로 상속관계에서 접근가능함.
	protected void depositMoney(int money) {
		if(money<0) {
			System.out.println("마이너스 금액은 입금처리 불가");
			return;
		}
		this.money += money;
	}
	/*
	 * private멤버변수를 외부클래스로 반환해주는 역할을 하는 메소드를 가르켜 getter()메소드라 한다
	 * 아무런 기능도 없고 단순히 값을 반환한다.
	 */
	protected int getAccMoney() {
		return money;
	}
	
}
//자식클래스
class SavingAccount extends Account{
	//추가되는 멤버변수 없음
	
	/*
	 * 인자생성자: super()를 통해 부모클래스의 생성자를 호출하여 초기화하고 있음.
	 */
	public SavingAccount(int initVal) {
		super(initVal);
	}
	/*
	 * private으로 선언된 멤버면수에 접근이 불가능하므로 protected로 선언된 멤버메소들 통해
	 * 간접적으로 접근하여 입금을 처리한다.
	 */
	public void saveMoney(int money) {
		depositMoney(money);
	}
	public void showAccountMoney() {
		System.out.println("잔액: " + getAccMoney());
	}
	
}
public class PrivateInheritanceMain {

	public static void main(String[] args) {
	SavingAccount sa = new SavingAccount(10000);
	/*
	 * private멤버변수이므로 하위클래스에서는 접근불가능함.
	 * 부모의 멤버메소드를 통해서만 접근
	 */
	//sa.money=100000;
	
	sa.saveMoney(-1000);
	sa.showAccountMoney();
	
	Account account = new Account(1000);
	
	//account.money = 1000; => 오류발생
	/*
	 * 클래스 외부에서의 접근이므로 private멤버는 접근불가
	 */

	}

}
