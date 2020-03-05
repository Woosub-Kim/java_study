package ex08class;
/*
연습문제] 은행계좌를 추상화 해보자
	멤버변수 : 예금주(name)
			계좌번호(accountNumber)
			잔고(balance)
			
	멤버메소드 : 입금하다(deposit())
	 		출금하다(withdraw())
	 		계좌잔고 출력하기(showAccount())
	
	조건1 : 입금은 무제한으로 가능함
	조건2 : 잔고가 부족할 경우에는 출금불능 처리
 */
class Account {
	//멤버변수
	String name;
	String accountNumber;
	long balance;
	
	//생성자
	public Account(String customer, String accNum, long initDeposit) {
		name = customer;
		accountNumber = accNum;
		balance = initDeposit;
	}
	public Account(String customer, String accNum) {
		name = customer;
		accountNumber = accNum;
		balance = 0;
	}
	//초기화메소드
	void init(String newName, String newNum, long newBalance) {
		name = newName;
		accountNumber = newNum;
		balance = newBalance;
		System.out.printf("%s님(%s) 계좌정보 변경 알림.%n==========%n", name, accountNumber);		
	}
	
	//멤버 메소드
	void deposit(long cash) {
		balance += cash;
		System.out.printf("%s님(%s) 입금되었습니다..%n입금액은 %d원, 잔액 %d원 입니다.%n==========%n", name, accountNumber, cash, balance);		
	}
	void withdraw(long cash) {
		if(balance >= cash) {
			balance -= cash;
			System.out.printf("%s님(%s) 출금되었습니다. %n출금액은 %d원, 잔액 %d원 입니다.%n==========%n", name, accountNumber, cash, balance);
		}
		else {
			System.out.printf("[알림] 잔액부족%n==========%n");			
		}			
	}
	void showAccount() {
		System.out.printf("%s님(%s)의 계좌정보입니다.%n잔액은 %d원 입니다.%n==========%n", name, accountNumber, balance);		
	}
	
}
/*
연습문제] 은행계좌를 추상화 해보자
	멤버변수 : 예금주(name)
			계좌번호(accountNumber)
			잔고(balance)
			
	멤버메소드 : 입금하다(deposit())
	 		출금하다(withdraw())
	 		계좌잔고 출력하기(showAccount())
	
	조건1 : 입금은 무제한으로 가능함
	조건2 : 잔고가 부족할 경우에는 출금불능 처리
 */
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("홍길동", "12389-00-5644");
		account.showAccount();
		account.deposit(1000000);
		account.withdraw(500000);
		account.withdraw(9000000000000000L);
		account.showAccount();
		
		Account account2 = new Account("BB", "1234");
		account2.showAccount();
		account2.init("홍길순", "123-5686-7744", 1000);
		account2.showAccount();
	}

}
