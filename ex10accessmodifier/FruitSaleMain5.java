package ex10accessmodifier;
//과일 판매자를 정의한 클래스
class FruitSeller5{
	int numOfApple; //판매자 사과 보유 갯수
	int myMoney;      //판매자 수익금.
	final int APPLE_PRICE;
	 
	/*
	 * 상수는 딱 한번만 초기화가 되므로 일반적인 메소드에서는 초기화 할 수 없다. 
	 * 단 생성자메소드에서는 초기화가 가능하다. 생성자 역시 딱 한번만
	 * 호출 되고, 임의로 호출할 수 없기 때문이다. 
	 */
	
	//판매 위한 멤버메소드
	public int saleApple(int money) {
		int num = money/APPLE_PRICE; 
		numOfApple -= num;
		myMoney += money;
		return num;	
	}
	/*
	 * 1차 버전에서는 멤버변수 초기화가 고정값이었다면 
	 * 2차버전에서는 초기화 메소드를 통해 멤버변수를 초기화한다.
	 */
	public FruitSeller5(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자]판매수익: " + myMoney);	
	}
}

class FruitBuyer5{
	int myMoney;   //구매자 보유금액
	int numOfApple;//보유한 사과갯수
	
	
	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;	
	}
	
	public FruitBuyer5(int MyMoney, int NumOfApple) {
		myMoney = MyMoney;
		numOfApple = NumOfApple;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: " + myMoney);
		System.out.println("[구매자]사과 갯수: " + numOfApple);		
	}
}


public class FruitSaleMain5 {

	public static void main(String[] args) {
		/*
		 * 생성자를 통해 객체생성과 동시에 초기화를 진행하므로 초기화메소드 호출없이 
		 * 객체를 생성할 수 있다.
		 */
		//보유액: 0원 사과: 100개 단가: 1000원
		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		//보유액: 0원 사과: 800개 단가: 500원
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);
		//구매자 보유액 10000 사과 0개
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
		//객체 초기상태 확인
		System.out.println("구매전 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		/*
		 * 아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매갯수에 논리적 오류가 
		 * 발생되어 코드를 통한 규칙이 완전히 무너졌다. 이와같은 논리적 오류를 차단하기위해
		 * 객체지향에서는 "정보은닉"하도록 권장한다.
		 */
		seller1.myMoney += 1000;//판매자1에 1000원 지불하고 
		seller1.numOfApple -= 100;//사과 100개 구매
		
		seller2.myMoney +=500;//판매자2에 500원 지불하고
		seller2.numOfApple -= 90;//사과 90개 구매
		
		System.out.println("구매 후 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		
		
	}

}
